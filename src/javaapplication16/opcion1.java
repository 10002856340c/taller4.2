/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.util.Scanner;

import java.util.Scanner;


public class opcion1 {
    public static int[] sumarVectores(int[] vectorA, int[] vectorB) {
        int n = vectorA.length;
        int[] vectorC = new int[n];

        for (int i = 0; i < n; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        return vectorC;
    }
}