package de.jonasbroeckmann.ksignal

import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

/**
 * Suspends until this signal is raised.
 *
 * @return the raised signal
 */
public suspend fun Signal.await(): Signal {
    var oldHandler: Signal.Handler? = null
    try {
        return suspendCoroutine<Signal> { continuation ->
            oldHandler = handle(Signal.Handler { continuation.resume(it) })
        }
    } finally {
        if (oldHandler != null) handle(oldHandler)
    }
}
