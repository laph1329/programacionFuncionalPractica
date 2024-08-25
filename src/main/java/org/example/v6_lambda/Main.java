package org.example.v6_lambda;

import org.example.v6_lambda.interfaces.*;

import java.util.Random;

// usando funciones anónimas
public class Main {
    public static void main(String[] args) {
        new  Main();
    }
    public Main() {

        Random random=new Random();
        Integer total = Flujo
                .proveer(10,() ->  random.nextInt(6))
                .filtrar(n ->n % 2 == 0)
                .transformar(n->n * n)
                .imprimirLista(n->System.out.println(n))
                .reducir(0, (Integer acum, Integer n)->acum + n);
        System.out.println("Total: "+total);
    }

}