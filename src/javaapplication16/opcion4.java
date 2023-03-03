
package javaapplication16;

import java.util.Arrays;


public class opcion4 {
    public static int[] ordenarPositivosNegativos(int[] vector) {
        int n = vector.length;
        int[] vectorPositivos = new int[n];
        int[] vectorNegativos = new int[n];
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        for (int i = 0; i < n; i++) {
            if (vector[i] >= 0) {
                vectorPositivos[contadorPositivos] = vector[i];
                contadorPositivos++;
            } else {
                vectorNegativos[contadorNegativos] = vector[i];
                contadorNegativos++;
            }
        }

        Arrays.sort(vectorPositivos, 0, contadorPositivos);
        Arrays.sort(vectorNegativos, 0, contadorNegativos);
        int[] vectorOrdenado = new int[n];

        for (int i = 0; i < contadorPositivos; i++) {
            vectorOrdenado[i] = vectorPositivos[contadorPositivos - i - 1];
        }

        for (int i = 0; i < contadorNegativos; i++) {
            vectorOrdenado[contadorPositivos + i] = vectorNegativos[i];
        }

        return vectorOrdenado;
    }
}
