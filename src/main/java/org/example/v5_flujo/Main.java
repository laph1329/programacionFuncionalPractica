package org.example.v5_flujo;

import org.example.v5_flujo.interfaces.*;

import java.util.Random;

// usando funciones anónimas
public class Main {
    public static void main(String[] args) {
        new  Main();
    }
    public Main() {

        Integer total = Flujo.proveer(10, new Proveedor<Integer>() {
            Random random=new Random();
            @Override
            public Integer obtener() {
                return random.nextInt(10);
            }
        }).filtrar(new Predicado<>() {
            @Override
            public boolean aplicar(Integer n) {
                return n % 2 == 0;
            }
        }).transformar(new TransformadorUnario<>() {
            @Override
            public Integer aplicar(Integer n) {
                return n * n;
            }
        }).imprimirLista(new Consumidor<>() {
            @Override
            public void aceptar(Integer n) {
                System.out.println(n);
            }
        }).reducir(0, new OperadorBinario<Integer>() {
            @Override
            public Integer reducir(Integer acum, Integer n) {
                return acum + n;
            }
        });
        System.out.println("Total: "+total);
    }

}