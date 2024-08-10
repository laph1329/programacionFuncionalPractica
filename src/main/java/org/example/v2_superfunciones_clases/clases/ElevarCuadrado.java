package org.example.v2_superfunciones_clases.clases;

import org.example.v2_superfunciones_clases.interfaces.Transformador;

public class ElevarCuadrado implements Transformador {
    @Override
    public Integer aplicar(Integer n) {
        return n * n;
    }
}
