package org.example.v6_lambda.interfaces;
@FunctionalInterface
public interface Reductor<T,U,R> {
    R reducir(T acum, U n);
}
