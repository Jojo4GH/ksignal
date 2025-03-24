package de.jonasbroeckmann.ksignal

import sun.misc.Signal as JavaSignal
import sun.misc.SignalHandler as JavaSignalHandler

public actual class Signal(
    public actual val name: String
) {
    internal val java by lazy { JavaSignal(name) }

    override fun toString(): String = name

    public actual class Handler internal constructor(
        internal val java: JavaSignalHandler
    ) : (Signal) -> Unit {
        actual override fun invoke(signal: Signal) {
            java.handle(signal.java)
        }

        public actual companion object {
            public actual operator fun invoke(action: (Signal) -> Unit): Handler {
                return Handler(JavaSignalHandler { action(it.toSignal()) })
            }
        }
    }

    public actual companion object : Signals() {
        private val All by lazy { all() }
        internal val byName by lazy { All.associateBy { it.name } }
    }
}

@Suppress("UnnecessaryAbstractClass", "PropertyName", "VariableNaming")
public actual abstract class Signals {
    public actual val ABRT: Signal = Signal("ABRT")
    public actual val ALRM: Signal = Signal("ALRM")
    public actual val BUS: Signal = Signal("BUS")
    public actual val CLD: Signal = Signal("CLD")
    public actual val CHLD: Signal = Signal("CHLD")
    public actual val CONT: Signal = Signal("CONT")
    public actual val FPE: Signal = Signal("FPE")
    public actual val HUP: Signal = Signal("HUP")
    public actual val ILL: Signal = Signal("ILL")
    public actual val INT: Signal = Signal("INT")
    public actual val IO: Signal = Signal("IO")
    public actual val IOT: Signal = Signal("IOT")
    public actual val KILL: Signal = Signal("KILL")
    public actual val PIPE: Signal = Signal("PIPE")
    public actual val POLL: Signal = Signal("POLL")
    public actual val PROF: Signal = Signal("PROF")
    public actual val PWR: Signal = Signal("PWR")
    public actual val QUIT: Signal = Signal("QUIT")
    public actual val SEGV: Signal = Signal("SEGV")
    public actual val STKFLT: Signal = Signal("STKFLT")
    public actual val STOP: Signal = Signal("STOP")
    public actual val SYS: Signal = Signal("SYS")
    public actual val TERM: Signal = Signal("TERM")
    public actual val TRAP: Signal = Signal("TRAP")
    public actual val TSTP: Signal = Signal("TSTP")
    public actual val TTIN: Signal = Signal("TTIN")
    public actual val TTOU: Signal = Signal("TTOU")
    public actual val UNUSED: Signal = Signal("UNUSED")
    public actual val URG: Signal = Signal("URG")
    public actual val USR1: Signal = Signal("USR1")
    public actual val USR2: Signal = Signal("USR2")
    public actual val VTALRM: Signal = Signal("VTALRM")
    public actual val WINCH: Signal = Signal("WINCH")
    public actual val XCPU: Signal = Signal("XCPU")
    public actual val XFSZ: Signal = Signal("XFSZ")
}

private fun JavaSignal.toSignal(): Signal {
    return Signal.byName[name] ?: error("Unknown signal: $name")
}

public actual fun Signal.handle(handler: Signal.Handler): Signal.Handler? {
    return Signal.Handler(JavaSignal.handle(java, handler.java))
}

public actual fun Signal.raise() {
    JavaSignal.raise(java)
}
