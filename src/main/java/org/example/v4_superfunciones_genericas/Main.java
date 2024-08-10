package org.example.v4_superfunciones_genericas;

import org.example.v4_superfunciones_genericas.interfaces.*;

import java.util.List;
// usando funciones anónimas
public class Main {
    public static void main(String[] args) {
        new  Main();
    }
    public Main() {

//        1. crear lista
        List<Integer> listaNum=crearLista();
        System.out.println("Lista original: "+listaNum);

//        2. filtrar pares
        List<Integer> listaFiltrada= Superfunciones.filtrar(listaNum, new Predicado<>() {
            @Override
            public boolean aplicar(Integer n) {
                return n % 2 == 0;
            }
        });
        System.out.println("Lista de pares: "+listaFiltrada);

        //3a) elevar al cuadrado
        List<Integer> listaCuadrados= Superfunciones.transformar(listaFiltrada, new TransformadorUnario<>() {
            @Override
            public Integer aplicar(Integer n) {
                return n * n;
            }
        });
        System.out.println("Lista de cuadrados: "+listaCuadrados);

//        3b) convertir a cadena
        List<String> convertirCadena= Superfunciones.transformar(listaFiltrada, new Transformador<>() {
            @Override
            public String aplicar(Integer n) {
                return "valor: "+n;
            }
        });
        System.out.println("Lista  de cadena: "+convertirCadena);

//        4. imprimir
        Superfunciones.imprimirLista(listaCuadrados, new Consumidor<>() {
            @Override
            public void aceptar(Integer n) {
                System.out.println(n);
            }
        });

//        5. obtener la suma
        Superfunciones.reducir(listaCuadrados, 0, new OperadorBinario<Integer>() {
            @Override
            public Integer reducir(Integer acum, Integer n) {
                return acum + n;
            }
        });
    }

    public List<Integer> crearLista(){
        //List.of crea una lista inmutable, no se puede modificar, agregar o eliminar elementos, se incluye en java 9
        return List.of(1,2,3,4,5,6,7);
    }
}