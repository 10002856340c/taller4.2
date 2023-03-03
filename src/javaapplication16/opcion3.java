/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.util.Scanner;

public class opcion3 {
    public static int encontrarMayor(int[] vector) {
        int mayor = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
        }

        return mayor;
    }

    public static int encontrarMenor(int[] vector) {
        int menor = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }

        return menor;
    }
}
