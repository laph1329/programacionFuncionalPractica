package org.example.v9_method_reference_avanzado;

public class NumberUtils {
    private NumberUtils() {
    }
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int elevarAlCuadrado(int n) {
        return n * n;
    }
}
