package org.example.v1_imperativa;

import java.util.ArrayList;
import java.util.List;
// usando forma imperativa
public class Main {
    public static void main(String[] args) {
        new  Main();
    }
    public Main() {
//        1. crear lista
        List<Integer> listaNum=crearLista();
        System.out.println("Lista original: "+listaNum);
//        2. filtrar pares
        List<Integer> listaPares=filtrarPares(listaNum);
        System.out.println("Lista de pares: "+listaPares);
//        3. elevar al cuadrado
        List<Integer> listaCuadrados=elevarAlcuadrado(listaPares);
        System.out.println("Lista de cuadrados: "+listaCuadrados);
//        4. imprimir
        imprimir(listaCuadrados);
//        5. obtener la suma
        sumaListaCuadrados(listaCuadrados);
    }

    public List<Integer> crearLista(){
        //List.of crea una lista inmutable, no se puede modificar, agregar o eliminar elementos, se incluye en java 9
        return List.of(1,2,3,4,5,6,7,8,9,10);
    }
    public List<Integer> filtrarPares(List<Integer> lista){
        List<Integer> listaPares=new ArrayList<>();
        for(Integer n:lista){
            if(n%2==0){
                listaPares.add(n);
            }
        }
        return listaPares;
    }
    public List<Integer> elevarAlcuadrado(List<Integer> lista){
        List<Integer> listaCuadrados=new ArrayList<>();
        for(Integer n:lista){
            listaCuadrados.add(n*n);
        }
        return listaCuadrados;
    }
    public void imprimir(List<Integer> lista){
        for(Integer n:lista){
//            System.out.println(n);
        }
    }
    public void sumaListaCuadrados(List<Integer> lista){
        int suma=0;
        for(Integer n:lista){
            suma+=n;
        }
        System.out.println("La suma de los cuadrados es: "+suma);
    }
}