package de.jonasbroeckmann.ksignal

/**
 * A collection of predefined signals.
 *
 * The common source set only provides a subset of signals that are available on all platforms.
 * See the platform-specific implementations for additional signals.
 */
@Suppress("PropertyName", "VariableNaming")
public expect abstract class Signals internal constructor() {
    /** Abort signal */
    public val ABRT: Signal

    /** Erroneous arithmetic operation */
    public val FPE: Signal

    /** Illegal instruction */
    public val ILL: Signal

    /** Interrupt from keyboard */
    public val INT: Signal

    /** Invalid memory reference */
    public val SEGV: Signal

    /** Termination signal */
    public val TERM: Signal

    internal val Known: List<Signal>
}
