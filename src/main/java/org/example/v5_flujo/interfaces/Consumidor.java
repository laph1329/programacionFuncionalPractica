package org.example.v5_flujo.interfaces;
@FunctionalInterface
public interface Consumidor<T> {
    void aceptar(T n);
}
