package org.example.v5_flujo.interfaces;
@FunctionalInterface
public interface Reductor<T,U,R> {
    R reducir(T acum, U n);
}
