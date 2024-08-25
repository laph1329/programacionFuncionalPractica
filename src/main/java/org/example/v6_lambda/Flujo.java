package org.example.v6_lambda;

import org.example.v6_lambda.interfaces.*;

import java.util.ArrayList;
import java.util.List;
//Usando interfaces como parametros
public class Flujo<T> {

    private final List<T> lista;

    public Flujo(List<T> lista){
        this.lista=lista;
    }

    public static <T> Flujo<T> proveer(int size, Proveedor<T> proveedor){
        List<T> resultado=new ArrayList<>();
        for(int i=0;i<size;i++){
            resultado.add(proveedor.obtener());
        }
        return new Flujo<>(resultado);
    }

    public Flujo<T> filtrar(Predicado<T> predicado){
        List<T> listaFiltrada=new ArrayList<>();
        for(T n : lista){
            if(predicado.aplicar(n)){
                listaFiltrada.add(n);
            }
        }
        return new Flujo<>(listaFiltrada);
    }
    public <R> Flujo<R> transformar(Transformador<T,R> transformador){
        List<R> listaCuadrados=new ArrayList<>();
        for(T n : lista){
            listaCuadrados.add(transformador.aplicar(n));
        }
        return new Flujo<> (listaCuadrados);
    }

    public Flujo<T> imprimirLista(Consumidor<T> consumidor){
        for(T n : lista){
            consumidor.aceptar(n);
        }
        return new Flujo<>(lista);
    }

    public T reducir(T valorInicial, OperadorBinario<T> reductor){
        T resultado=valorInicial;
        for(T n : lista){
            resultado=reductor.reducir(resultado,n);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}
