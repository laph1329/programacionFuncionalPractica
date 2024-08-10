package org.example.v2_superfunciones_clases.clases;

import org.example.v2_superfunciones_clases.interfaces.Consumidor;

public class Imprimir implements Consumidor {
    @Override
    public void aceptar(Integer n) {
        System.out.println(n);
    }
}
