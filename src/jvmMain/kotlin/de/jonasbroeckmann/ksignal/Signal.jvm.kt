package de.jonasbroeckmann.ksignal

import sun.misc.Signal as JavaSignal
import sun.misc.SignalHandler as JavaSignalHandler

/**
 * A signal.
 *
 * The JVM implementation is based on [sun.misc.Signal].
 */
public actual class Signal private constructor(
    internal val java: JavaSignal
) {
    /**
     * Creates a signal with the given id.
     *
     * @param id the signal id (e.g. `"QUIT"`)
     *
     * @see [sun.misc.Signal]
     */
    public constructor(id: String) : this(JavaSignal(id))

    public actual val name: String get() = java.toString()

    override fun toString(): String = name

    /**
     * A signal handler.
     *
     * @see [sun.misc.SignalHandler]
     */
    public actual class Handler internal constructor(
        internal val java: JavaSignalHandler
    ) : (Signal) -> Unit {
        actual override fun invoke(signal: Signal) {
            java.handle(signal.java)
        }

        public actual companion object {
            public actual operator fun invoke(action: (Signal) -> Unit): Handler {
                return Handler(JavaSignalHandler { action(Signal(it)) })
            }
        }
    }

    public actual companion object : Signals()
}

public actual fun Signal.handle(handler: Signal.Handler): Signal.Handler? {
    return Signal.Handler(JavaSignal.handle(java, handler.java))
}

public actual fun Signal.raise() {
    JavaSignal.raise(java)
}
