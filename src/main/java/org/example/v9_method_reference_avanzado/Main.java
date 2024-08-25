package org.example.v9_method_reference_avanzado;

import java.util.Comparator;
import java.util.Random;



// usando funciones anónimas
public class Main {
    public static void main(String[] args) {
        new  Main();
    }
    public Main() {

        Integer total = Flujo
//                .proveer(10,() ->  randomInt())
                .proveer(10, this::randomInt) // metodo de instancia del objeto Main
//                .filtrar(n ->NumberUtils.esPrimo(n)) metodo estatico
                .filtrar(NumberUtils::esPrimo)
//                .ordenar((n1,n2)->n2.compareTo(n1)) // ordenar de mayor a menor, metodo estatico
                .ordenar(Comparator.reverseOrder())
//                .ordenar((n1,n2)->n1.compareTo(n2)) // ordenar de menor a mayor,
                .ordenar(Integer::compareTo) //3er caso referencia a metodo de instancia no especificada,
                // ya que compareTo no es estatico
//                .transformar(n->NumberUtils.elevarAlCuadrado(n)) metodo estatico
                .transformar(NumberUtils::elevarAlCuadrado)
//                .imprimirLista(n->System.out.println(n)) metodo de instancia, out es instancia de PrintStream
                .imprimirLista(System.out::println)
//                .reducir(0, (Integer acum, Integer n)->Integer.sum(acum,n));
                .reducir(0, Integer::sum);

        System.out.println("Total: "+total);
    }
    private int randomInt() {
        return new Random().nextInt(6);
    }

}