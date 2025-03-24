package de.jonasbroeckmann.ksignal

@Suppress("PropertyName", "VariableNaming")
public actual abstract class Signals {
    /** Abort signal */
    public actual val ABRT: Signal = Signal("SIGABRT", platform.posix.SIGABRT)

    /** Timer signal */
    public val ALRM: Signal = Signal("SIGALRM", platform.posix.SIGALRM)

    /** Bus error (bad memory access) */
    public val BUS: Signal = Signal("SIGBUS", platform.posix.SIGBUS)

    /** Child stopped or terminated */
    public val CHLD: Signal = Signal("SIGCHLD", platform.posix.SIGCHLD)

    /** Continue if stopped */
    public val CONT: Signal = Signal("SIGCONT", platform.posix.SIGCONT)

    /** Erroneous arithmetic operation */
    public actual val FPE: Signal = Signal("SIGFPE", platform.posix.SIGFPE)

    /** Hangup detected on controlling terminal or death of controlling process */
    public val HUP: Signal = Signal("SIGHUP", platform.posix.SIGHUP)

    /** Illegal instruction */
    public actual val ILL: Signal = Signal("SIGILL", platform.posix.SIGILL)

    /** Interrupt from keyboard */
    public actual val INT: Signal = Signal("SIGINT", platform.posix.SIGINT)

    /** I/O now possible */
    public val IO: Signal = Signal("SIGIO", platform.posix.SIGIO)

    /** IOT trap */
    public val IOT: Signal = Signal("SIGIOT", platform.posix.SIGIOT)

    /** Kill signal */
    public val KILL: Signal = Signal("SIGKILL", platform.posix.SIGKILL)

    /** Broken pipe: Write to pipe with no readers */
    public val PIPE: Signal = Signal("SIGPIPE", platform.posix.SIGPIPE)

    /** Pollable event */
    public val POLL: Signal = Signal("SIGPOLL", platform.posix.SIGPOLL)

    /** Profiling timer expired */
    public val PROF: Signal = Signal("SIGPROF", platform.posix.SIGPROF)

    /** Power failure */
    public val PWR: Signal = Signal("SIGPWR", platform.posix.SIGPWR)

    /** Quit from keyboard */
    public val QUIT: Signal = Signal("SIGQUIT", platform.posix.SIGQUIT)

    /** Invalid memory reference */
    public actual val SEGV: Signal = Signal("SIGSEGV", platform.posix.SIGSEGV)

    /** Stack fault on coprocessor (unused) */
    public val STKFLT: Signal = Signal("SIGSTKFLT", platform.posix.SIGSTKFLT)

    /** Stop process */
    public val STOP: Signal = Signal("SIGSTOP", platform.posix.SIGSTOP)

    /** Bad system call */
    public val SYS: Signal = Signal("SIGSYS", platform.posix.SIGSYS)

    /** Termination signal */
    public actual val TERM: Signal = Signal("SIGTERM", platform.posix.SIGTERM)

    /** Trace/breakpoint trap */
    public val TRAP: Signal = Signal("SIGTRAP", platform.posix.SIGTRAP)

    /** Stop typed at terminal */
    public val TSTP: Signal = Signal("SIGTSTP", platform.posix.SIGTSTP)

    /** Terminal input for background process */
    public val TTIN: Signal = Signal("SIGTTIN", platform.posix.SIGTTIN)

    /** Terminal output for background process */
    public val TTOU: Signal = Signal("SIGTTOU", platform.posix.SIGTTOU)

    /** Synonymous with [SYS] */
    public val UNUSED: Signal = Signal("SIGUNUSED", platform.posix.SIGUNUSED)

    /** Urgent condition on socket */
    public val URG: Signal = Signal("SIGURG", platform.posix.SIGURG)

    /** User-defined signal 1 */
    public val USR1: Signal = Signal("SIGUSR1", platform.posix.SIGUSR1)

    /** User-defined signal 2 */
    public val USR2: Signal = Signal("SIGUSR2", platform.posix.SIGUSR2)

    /** Virtual alarm clock */
    public val VTALRM: Signal = Signal("SIGVTALRM", platform.posix.SIGVTALRM)

    /** Window resize signal */
    public val WINCH: Signal = Signal("SIGWINCH", platform.posix.SIGWINCH)

    /** CPU time limit exceeded */
    public val XCPU: Signal = Signal("SIGXCPU", platform.posix.SIGXCPU)

    /** File size limit exceeded */
    public val XFSZ: Signal = Signal("SIGXFSZ", platform.posix.SIGXFSZ)

    internal actual val Known = listOf(
        ABRT, ALRM, BUS, CHLD, CONT, FPE, HUP, ILL, INT, IO, IOT, KILL, PIPE, POLL, PROF, PWR, QUIT, SEGV,
        STKFLT, STOP, SYS, TERM, TRAP, TSTP, TTIN, TTOU, UNUSED, URG, USR1, USR2, VTALRM, WINCH, XCPU, XFSZ
    )
}
