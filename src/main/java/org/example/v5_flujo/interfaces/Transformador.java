package org.example.v5_flujo.interfaces;
@FunctionalInterface
public interface Transformador<T,R> {
    R aplicar(T n);
}
