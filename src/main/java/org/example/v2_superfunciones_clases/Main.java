package org.example.v2_superfunciones_clases;

import org.example.v2_superfunciones_clases.clases.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new  Main();
    }
    public Main() {
//        1. crear lista
        List<Integer> listaNum=crearLista();
        System.out.println("Lista original: "+listaNum);
//        2. filtrar pares
        List<Integer> listaFiltrada=Superfunciones.filtrar(listaNum, new SoloPares());
        System.out.println("Lista de pares: "+listaFiltrada);
//        3. elevar al cuadrado
        List<Integer> listaCuadrados=Superfunciones.transformar(listaFiltrada,new ElevarCuadrado());
//        4. imprimir
        Superfunciones.imprimirLista(listaCuadrados, new Imprimir());
//        5. obtener la suma
        Superfunciones.reducir(listaCuadrados,0,new Suma());
    }

    public List<Integer> crearLista(){
        //List.of crea una lista inmutable, no se puede modificar, agregar o eliminar elementos, se incluye en java 9
        return List.of(1,2,3,4,5,6,7);
    }
}