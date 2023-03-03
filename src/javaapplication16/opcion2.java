
package javaapplication16;

import java.util.Scanner;


public class opcion2 {
    public static int contarNumero(int[] vector, int numero) {
        int contador = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero) {
                contador++;
            }
        }

        return contador;
    }
}

