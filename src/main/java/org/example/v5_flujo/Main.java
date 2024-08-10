package org.example.v5_flujo;

import org.example.v5_flujo.interfaces.*;

import java.util.List;
import java.util.Random;

// usando funciones anónimas
public class Main {
    public static void main(String[] args) {
        new  Main();
    }
    public Main() {

//        1. crear lista
        Flujo<Integer> numeros=Flujo.proveer(10, new Proveedor<>() {
            Random random=new Random();
            @Override
            public Integer obtener() {
                return random.nextInt(10);
            }
        });
        System.out.println("Lista original: "+numeros);

//        2. filtrar pares
        Flujo<Integer> filtrados= numeros.filtrar(new Predicado<>() {
            @Override
            public boolean aplicar(Integer n) {
                return n % 2 == 0;
            }
        });
        System.out.println("Lista de pares: "+filtrados);

        //3a) elevar al cuadrado
        Flujo<Integer> listaCuadrados= filtrados.transformar(new TransformadorUnario<>() {
            @Override
            public Integer aplicar(Integer n) {
                return n * n;
            }
        });
        System.out.println("Lista de cuadrados: "+listaCuadrados);

//        3b) convertir a cadena
        Flujo<String> convertirCadena= filtrados.transformar(new Transformador<>() {
            @Override
            public String aplicar(Integer n) {
                return "valor: "+n;
            }
        });
        System.out.println("Lista de cadena: "+convertirCadena);

//        4. imprimir
        listaCuadrados.imprimirLista(new Consumidor<>() {
            @Override
            public void aceptar(Integer n) {
                System.out.println(n);
            }
        });

//        5. obtener la suma
        Integer suma=listaCuadrados.reducir(0, new OperadorBinario<Integer>() {
            @Override
            public Integer reducir(Integer acum, Integer n) {
                return acum + n;
            }
        });
        System.out.println("suma cuadrados:" +suma);
    }

}