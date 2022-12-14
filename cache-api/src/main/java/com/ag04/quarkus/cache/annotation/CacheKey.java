package com.ag04.quarkus.cache.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * When a method argument is annotated with {@link CacheKey}, it is identified as a part of a cache key during an invocation of
 * a method annotated with {@link CacheResult} or {@link CacheInvalidate}.
 * <p>
 * This annotation is optional and should only be used when some of the method arguments are NOT part of the cache key.
 * 
 * This class is taken from: https://github.com/quarkusio/quarkus/blob/main/extensions/cache/runtime/src/main/java/io/quarkus/cache/CacheKey.java
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface CacheKey {
}
