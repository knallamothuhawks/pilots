package com.tedwon.pilots.cache;

/**
 * Thrown to indicate an exception has occurred in the Cache.
 * <p/>
 * This is the base class for all cache exceptions.
 * @author Greg Luck
 */
public class CacheException extends RuntimeException {

    /**
     * Constructs a new CacheException.
     */
    public CacheException() {
        super();
    }

    /**
     * Constructs a new CacheException with a message string.
     *
     * @param   message   the detail message. The detail message is saved for
     *          later retrieval by the {@link #getMessage()} method.
     */
    public CacheException(String message) {
        super(message);
    }

    /**
     * Constructs a CacheException with a message string, and
     * a base exception
     *
     * @param   message   the detail message. The detail message is saved for
     *          later retrieval by the {@link #getMessage()} method.
     * @param throwable
     */
    public CacheException(String message, Throwable throwable) {
        super(message, throwable);
    }
}