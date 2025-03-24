package de.jonasbroeckmann.ksignal

/**
 * A signal.
 *
 * @property name the signal name
 */
public expect class Signal {
    public val name: String

    /**
     * A signal handler.
     */
    public class Handler : (Signal) -> Unit {
        /**
         * Invokes the signal handler.
         *
         * @param signal the signal
         */
        override fun invoke(signal: Signal)

        public companion object {
            /**
             * Creates a signal handler from the given action.
             *
             * @param action the action to perform when the signal is raised
             * @return the signal handler
             */
            public operator fun invoke(action: (Signal) -> Unit): Handler
        }
    }

    public companion object : Signals
}

/**
 * Installs a signal handler for this signal.
 *
 * @param handler the signal handler
 * @return the old signal handler or `null` if none was installed
 */
public expect fun Signal.handle(handler: Signal.Handler): Signal.Handler?

/**
 * Raises this signal.
 */
public expect fun Signal.raise()
