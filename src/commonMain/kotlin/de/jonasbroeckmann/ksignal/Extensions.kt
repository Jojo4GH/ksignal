package de.jonasbroeckmann.ksignal

/**
 * Installs a signal handler for this signal.
 *
 * @param action the signal handler
 * @return the old signal handler
 */
public fun Signal.handle(action: (Signal) -> Unit): Signal.Handler? = handle(Signal.Handler(action))

/**
 * Installs a signal handler for this signal and executes the given block.
 *
 * The old signal handler is restored after the block has been executed.
 *
 * @param handler the signal handler
 * @param block the block to execute
 * @return the result of the block
 */
public inline fun <R> Signal.withHandler(handler: Signal.Handler, block: () -> R): R {
    val oldHandler = handle(handler)
    try {
        return block()
    } finally {
        if (oldHandler != null) handle(oldHandler)
    }
}
