package org.example.v5_flujo.interfaces;
@FunctionalInterface
public interface Predicado<T> {
   boolean aplicar(T n);
}
