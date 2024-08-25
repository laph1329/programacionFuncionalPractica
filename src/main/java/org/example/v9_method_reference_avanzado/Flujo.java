package org.example.v9_method_reference_avanzado;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

//Usando interfaces como parametros
public class Flujo<T> {

    private final List<T> lista;

    public Flujo(List<T> lista){
        this.lista=lista;
    }

    public static <T> Flujo<T> proveer(int size, Supplier<T> supplier){
        List<T> resultado=new ArrayList<>();
        for(int i=0;i<size;i++){
            resultado.add(supplier.get());
        }
        return new Flujo<>(resultado);
    }

    public Flujo<T> filtrar(Predicate<T> predicate){
        List<T> listaFiltrada=new ArrayList<>();
        for(T n : lista){
            if(predicate.test(n)){
                listaFiltrada.add(n);
            }
        }
        return new Flujo<>(listaFiltrada);
    }
    public <R> Flujo<R> transformar(Function<T,R> function){
        List<R> listaCuadrados=new ArrayList<>();
        for(T n : lista){
            listaCuadrados.add(function.apply(n));
        }
        return new Flujo<> (listaCuadrados);
    }

    public Flujo<T> imprimirLista(Consumer<T> consumer){
        for(T n : lista){
            consumer.accept(n);
        }
        return new Flujo<>(lista);
    }

    public Flujo<T> ordenar(Comparator<T> comparator){
        List<T> listaOrdenada=new ArrayList<>(lista);
        listaOrdenada.sort(comparator);
        return new Flujo<>(listaOrdenada);
    }

    public T reducir(T valorInicial, BinaryOperator<T> reductor){
        T resultado=valorInicial;
        for(T n : lista){
            resultado=reductor.apply(resultado,n);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}
