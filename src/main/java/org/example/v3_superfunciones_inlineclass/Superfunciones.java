package org.example.v3_superfunciones_inlineclass;

import org.example.v3_superfunciones_inlineclass.interfaces.Consumidor;
import org.example.v3_superfunciones_inlineclass.interfaces.Predicado;
import org.example.v3_superfunciones_inlineclass.interfaces.Reductor;
import org.example.v3_superfunciones_inlineclass.interfaces.Transformador;

import java.util.List;
//Usando interfaces como parametros
public class Superfunciones {
    public static List<Integer> filtrar(List<Integer> lista, Predicado predicado){
        List<Integer> listaFiltrada=new java.util.ArrayList<>();
        for(Integer n:lista){
            if(predicado.aplicar(n)){
                listaFiltrada.add(n);
            }
        }
        return listaFiltrada;
    }
    public static List<Integer> transformar(List<Integer> lista, Transformador transformador){
        List<Integer> listaCuadrados=new java.util.ArrayList<>();
        for(Integer n:lista){
            listaCuadrados.add(transformador.aplicar(n));
        }
        return listaCuadrados;
    }

    public static void imprimirLista(List<Integer> lista, Consumidor consumidor){
        for(Integer n:lista){
            consumidor.aceptar(n);
        }
    }

    public static void reducir(List<Integer> lista, int valorInicial, Reductor reductor){
        int resultado=valorInicial;
        for(Integer n:lista){
            resultado=reductor.reducir(resultado,n);
        }
        System.out.println("Resultado: "+resultado);
    }
}
