package de.jonasbroeckmann.ksignal

/**
 * A collection of predefined signals.
 */
@Suppress("PropertyName", "VariableNaming")
public expect abstract class Signals internal constructor() {
    /** Abort signal */
    public val ABRT: Signal

    /** Timer signal */
    public val ALRM: Signal

    /** Bus error (bad memory access) */
    public val BUS: Signal

    /** Child stopped or terminated */
    public val CLD: Signal

    /** Child stopped or terminated */
    public val CHLD: Signal

    /** Continue if stopped */
    public val CONT: Signal

    /** Erroneous arithmetic operation */
    public val FPE: Signal

    /** Hangup detected on controlling terminal or death of controlling process */
    public val HUP: Signal

    /** Illegal instruction */
    public val ILL: Signal

    /** Interrupt from keyboard */
    public val INT: Signal

    /** I/O now possible */
    public val IO: Signal

    /** IOT trap */
    public val IOT: Signal

    /** Kill signal */
    public val KILL: Signal

    /** Broken pipe: Write to pipe with no readers */
    public val PIPE: Signal

    /** Pollable event */
    public val POLL: Signal

    /** Profiling timer expired */
    public val PROF: Signal

    /** Power failure */
    public val PWR: Signal

    /** Quit from keyboard */
    public val QUIT: Signal

    /** Invalid memory reference */
    public val SEGV: Signal

    /** Stack fault on coprocessor (unused) */
    public val STKFLT: Signal

    /** Stop process */
    public val STOP: Signal

    /** Bad system call */
    public val SYS: Signal

    /** Termination signal */
    public val TERM: Signal

    /** Trace/breakpoint trap */
    public val TRAP: Signal

    /** Stop typed at terminal */
    public val TSTP: Signal

    /** Terminal input for background process */
    public val TTIN: Signal

    /** Terminal output for background process */
    public val TTOU: Signal

    /** Synonymous with [SYS] */
    public val UNUSED: Signal

    /** Urgent condition on socket */
    public val URG: Signal

    /** User-defined signal 1 */
    public val USR1: Signal

    /** User-defined signal 2 */
    public val USR2: Signal

    /** Virtual alarm clock */
    public val VTALRM: Signal

    /** Window resize signal */
    public val WINCH: Signal

    /** CPU time limit exceeded */
    public val XCPU: Signal

    /** File size limit exceeded */
    public val XFSZ: Signal

    internal val Known: List<Signal>
}
