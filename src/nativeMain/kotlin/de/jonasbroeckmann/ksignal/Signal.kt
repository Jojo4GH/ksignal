package de.jonasbroeckmann.ksignal

import kotlinx.cinterop.*
import platform.posix.raise
import platform.posix.signal

internal typealias PosixSignal = Int

@OptIn(ExperimentalForeignApi::class)
private typealias PosixSignalHandler = CPointer<CFunction<(PosixSignal) -> Unit>>

public actual class Signal(
    public actual val name: String,
    private val posix: PosixSignal
) {
    override fun toString(): String = name

    internal val requireSupportedPosix: PosixSignal get() {
        require(posix != UnsupportedPosix) { "Signal $this is not supported on this platform" }
        return posix
    }

    public actual class Handler internal constructor(
        private val handler: (Signal) -> Unit
    ) : (Signal) -> Unit {
        actual override fun invoke(signal: Signal): Unit = handler(signal)

        public actual companion object {
            public actual operator fun invoke(action: (Signal) -> Unit): Handler = Handler(action)
        }
    }

    public actual companion object : Signals() {
        private const val UnsupportedPosix = -1
        internal fun unsupported(name: String) = Signal(name, UnsupportedPosix)

        private val All by lazy { all() }
        internal val byPosix by lazy { All.associateBy { it.posix } }

        internal val handlers = mutableMapOf<Signal, Handler>()
    }
}

private fun PosixSignal.toSignal(): Signal {
    return Signal.byPosix[this] ?: error("Unknown signal: $this")
}

@OptIn(ExperimentalForeignApi::class)
private fun PosixSignalHandler.toSignalHandler(): Signal.Handler {
    return Signal.Handler { this.invoke(it.requireSupportedPosix) }
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
        requireSupportedPosix,
        staticCFunction<PosixSignal, Unit>(::handlePosixSignal)
    )
    return oldPosixHandler?.toSignalHandler() ?: oldHandler
}

public actual fun Signal.raise() {
    raise(requireSupportedPosix)
}
