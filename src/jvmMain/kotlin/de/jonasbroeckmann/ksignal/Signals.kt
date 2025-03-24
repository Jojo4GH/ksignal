package de.jonasbroeckmann.ksignal

/**
 * A collection of predefined signals.
 *
 * On the JVM, this class provides only defines signals that should be available on all platforms.
 * One may use the [Signal] constructor to create other signals by their name.
 */
@Suppress("UnnecessaryAbstractClass", "PropertyName", "VariableNaming")
public actual abstract class Signals {
    /** Abnormal termination triggered by abort CL */
    public actual val ABRT: Signal = Signal("ABRT")

    /** Floating point exception */
    public actual val FPE: Signal = Signal("FPE")

    /** Illegal instruction */
    public actual val ILL: Signal = Signal("ILL")

    /** Interrupt */
    public actual val INT: Signal = Signal("INT")

    /** Segment violation */
    public actual val SEGV: Signal = Signal("SEGV")

    /** Software termination signal from kill */
    public actual val TERM: Signal = Signal("TERM")

    /**
     * Ctrl-Break sequence
     *
     * **Note**: [Windows only](https://github.com/openjdk/jdk/blob/45ff10cc68296c7c73d0eafe6fcc9946ab98267e/src/hotspot/os/windows/os_windows.cpp#L5691C36-L5691C55)
     */
    public val BREAK: Signal = Signal("BREAK")

    internal actual val Known: List<Signal> = listOf(ABRT, FPE, ILL, INT, SEGV, TERM, BREAK)
}