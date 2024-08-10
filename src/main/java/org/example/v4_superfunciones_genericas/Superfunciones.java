package org.example.v4_superfunciones_genericas;

import org.example.v4_superfunciones_genericas.interfaces.*;

import java.util.List;
//Usando interfaces como parametros
public class Superfunciones {
    public static <T> List<T> filtrar(List<T> lista, Predicado<T> predicado){
        List<T> listaFiltrada=new java.util.ArrayList<>();
        for(T n:lista){
            if(predicado.aplicar(n)){
                listaFiltrada.add(n);
            }
        }
        return listaFiltrada;
    }
    public static <T,R> List<R> transformar(List<T> lista, Transformador<T,R> transformador){
        List<R> listaCuadrados=new java.util.ArrayList<>();
        for(T n:lista){
            listaCuadrados.add(transformador.aplicar(n));
        }
        return listaCuadrados;
    }

    public static <T> void imprimirLista(List<T> lista, Consumidor<T> consumidor){
        for(T n:lista){
            consumidor.aceptar(n);
        }
    }

    public static <T> void reducir(List<T> lista, T valorInicial, OperadorBinario<T> reductor){
        T resultado=valorInicial;
        for(T n:lista){
            resultado=reductor.reducir(resultado,n);
        }
        System.out.println("Resultado: "+resultado);
    }
}
