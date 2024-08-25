package org.example.v6_lambda.interfaces;
@FunctionalInterface
public interface Transformador<T,R> {
    R aplicar(T n);
}
