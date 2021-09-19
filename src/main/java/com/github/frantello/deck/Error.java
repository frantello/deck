package com.github.frantello.deck;

/**
 * The type Error.
 */
public class Error extends RuntimeException {

    /**
     * Instantiates a new Error.
     *
     * @param message the message
     */
    public Error(String message) {
        super(message);
    }

    /**
     * Require non null.
     *
     * @param object  the object
     * @param message the message
     */
    public static void requireNonNull(Object object, String message) {
        if (object == null) {
            throw new Error(message);
        }
    }

}
