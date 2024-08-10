package org.example.v2_superfunciones_clases.clases;

import org.example.v2_superfunciones_clases.interfaces.Reductor;

public class Suma implements Reductor {
    @Override
    public Integer reducir(Integer acum, Integer n) {
        return acum + n;
    }
}
