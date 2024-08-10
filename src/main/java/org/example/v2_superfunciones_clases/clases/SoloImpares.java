package org.example.v2_superfunciones_clases.clases;

import org.example.v2_superfunciones_clases.interfaces.Predicado;

public class SoloImpares implements Predicado {
    @Override
    public boolean aplicar(Integer n) {
        return n % 2 != 0;
    }
}
