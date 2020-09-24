/*
 * Copyright
 */

package org.germalus.backend.webrest;

/**
 * Interface for implement return of simple message.
 *
 * @since 0.0.1
 */
public interface MessageController {

    /**
     * Return simple message.
     * @return Some string.
     */
    String getMessage();
}