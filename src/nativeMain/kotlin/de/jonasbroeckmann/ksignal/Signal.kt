package de.jonasbroeckmann.ksignal

import kotlinx.cinterop.*
import platform.posix.raise
import platform.posix.signal

internal typealias PosixSignal = Int

@OptIn(ExperimentalForeignApi::class)
private typealias PosixSignalHandler = CPointer<CFunction<(PosixSignal) -> Unit>>

/**
 * A signal based on POSIX.
 *
 * @param name the signal name
 * @param number the POSIX signal number
 */
public actual class Signal(
    public actual val name: String,
    internal val number: PosixSignal
) {
    override fun toString(): String = name

    public actual class Handler internal constructor(
        private val handler: (Signal) -> Unit
    ) : (Signal) -> Unit {
        actual override fun invoke(signal: Signal): Unit = handler(signal)

        public actual companion object {
            public actual operator fun invoke(action: (Signal) -> Unit): Handler = Handler(action)
        }
    }

    public actual companion object : Signals() {
        internal val byNumber by lazy { Known.associateBy { it.number } }

        internal val handlers = mutableMapOf<Signal, Handler>()
    }
}

private fun PosixSignal.toSignal(): Signal {
    return Signal.byNumber[this] ?: error("Unknown signal: $this")
}

@OptIn(ExperimentalForeignApi::class)
private fun PosixSignalHandler.toSignalHandler(): Signal.Handler {
    return Signal.Handler { this.invoke(it.number) }
}

private fun handlePosixSignal(posixSignal: PosixSignal) {
    val signal = posixSignal.toSignal()
    Signal.handlers[signal]?.invoke(signal)
}

@OptIn(ExperimentalForeignApi::class)
public actual fun Signal.handle(handler: Signal.Handler): Signal.Handler? {
    val oldHandler = Signal.handlers[this]
    Signal.handlers[this] = handler
    val oldPosixHandler = signal(
        number,
        staticCFunction<PosixSignal, Unit>(::handlePosixSignal)
    )
    return oldPosixHandler?.toSignalHandler() ?: oldHandler
}

public actual fun Signal.raise() {
    raise(number)
}
