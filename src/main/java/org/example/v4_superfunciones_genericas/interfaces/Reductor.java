package org.example.v4_superfunciones_genericas.interfaces;

public interface Reductor<T,U,R> {
    R reducir(T acum, U n);
}
