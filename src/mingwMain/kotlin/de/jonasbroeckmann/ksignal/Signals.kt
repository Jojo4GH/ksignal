package de.jonasbroeckmann.ksignal

@Suppress("PropertyName", "VariableNaming")
public actual abstract class Signals {
    /** Abnormal termination */
    public actual val ABRT: Signal = Signal("SIGABRT", platform.posix.SIGABRT)

    /** See [source](https://github.com/mingw-w64/mingw-w64/blob/dc69654d1bc1325626feff3094ecef82d2cc7b2f/mingw-w64-headers/crt/signal.h#L31) */
    public val ABRT2: Signal = Signal("SIGABRT2", platform.posix.SIGABRT2)

    /** Same meaning as [ABRT]. For compatibility with other platforms. */
    public val ABRT_COMPAT: Signal = Signal("SIGABRT_COMPAT", platform.posix.SIGABRT_COMPAT)

    /** See [source](https://github.com/mingw-w64/mingw-w64/blob/dc69654d1bc1325626feff3094ecef82d2cc7b2f/mingw-w64-headers/crt/signal.h#L29) */
    public val BREAK: Signal = Signal("SIGBREAK", platform.posix.SIGBREAK)

    /** Floating-point error */
    public actual val FPE: Signal = Signal("SIGFPE", platform.posix.SIGFPE)

    /** Illegal instruction */
    public actual val ILL: Signal = Signal("SIGILL", platform.posix.SIGILL)

    /** Interrupt from keyboard */
    public actual val INT: Signal = Signal("SIGINT", platform.posix.SIGINT)

    /** Illegal storage access */
    public actual val SEGV: Signal = Signal("SIGSEGV", platform.posix.SIGSEGV)

    /** Termination request */
    public actual val TERM: Signal = Signal("SIGTERM", platform.posix.SIGTERM)

    internal actual val Known: List<Signal> = listOf(
        ABRT, ABRT2, ABRT_COMPAT, BREAK, FPE, ILL, INT, SEGV, TERM
    )
}
