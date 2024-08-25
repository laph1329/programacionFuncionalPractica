package org.example.v6_lambda.interfaces;
@FunctionalInterface
public interface Consumidor<T> {
    void aceptar(T n);
    default void yLuego(){
        System.out.println("Ejecutando yLuego");
    }
    static void prueba(){
        System.out.println("Ejecutando prueba");
    }
    private void prueba2(){
        System.out.println("Ejecutando prueba2");
    }
}
