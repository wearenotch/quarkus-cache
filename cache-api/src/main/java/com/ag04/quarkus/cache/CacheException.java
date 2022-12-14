package com.ag04.quarkus.cache;

/**
 * This exception is thrown when a cache value computation fails because of an exception. The cause of the failure can be
 * retrieved using the {@link Throwable#getCause()} method.
 * 
 * Taken from: https://github.com/quarkusio/quarkus/blob/main/extensions/cache/runtime/src/main/java/io/quarkus/cache/CacheException.java
 */
public class CacheException extends RuntimeException {

    private static final long serialVersionUID = -3861791759030139393L;

    public CacheException(Throwable cause) {
        super(cause);
    }

    public CacheException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
