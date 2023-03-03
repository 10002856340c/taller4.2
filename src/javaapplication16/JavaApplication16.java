
package javaapplication16;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Elija una opción:");
            System.out.println("1. Sumar vectores y almacenar el resultado en otro vector");
            System.out.println("2. Buscar un número determinado en un vector y contar cuántas veces se repite");
            System.out.println("3. Encontrar el mayor y el menor número en un vector");
            System.out.println("4. Ordenar números positivos y negativos en un vector");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Sumar vectores y almacenar el resultado en otro vector
                    int[] vectorA = {1, 2, 3, 4, 5};
                    int[] vectorB = {5, 4, 3, 2, 1};
                    int[] vectorC = opcion1.sumarVectores(vectorA, vectorB);
                    System.out.println(Arrays.toString(vectorC)); // Debería imprimir "[6, 6, 6, 6, 6]"
                    break;
                case 2:
                    // Buscar un número determinado en un vector y contar cuántas veces se repite
                    int[] vectorD = {1, 2, 3, 2, 1, 2, 3, 2, 1};
                    System.out.println("Ingrese el número que desea buscar:");
                    int numeroBuscado = scanner.nextInt();
                    int vecesRepetido = opcion2.contarNumero(vectorD, numeroBuscado);
                    System.out.println("El número " + numeroBuscado + " se repite " + vecesRepetido + " veces."); // Debería imprimir "El número 2 se repite 4 veces."
                    break;
                case 3:
                    // Encontrar el mayor y el menor número en un vector
                    int[] vectorE = {5, 1, 3, 2, 4};
                    int mayor = opcion3.encontrarMayor(vectorE);
                    int menor = opcion3.encontrarMenor(vectorE);
                    System.out.println("El mayor número es " + mayor + " y el menor número es " + menor + "."); // Debería imprimir "El mayor número es 5 y el menor número es 1."
                    break;
                case 4:
                    // Ordenar números positivos y negativos en un vector
                    int[] vectorF = {-3, 2, 0, -1, 4, -2, 5, -4};
                    int[] vectorOrdenado =opcion4.ordenarPositivosNegativos(vectorF);
                    System.out.println(Arrays.toString(vectorOrdenado)); // Debería imprimir "[5, 4, 2, 0, -1, -2, -3, -4]"
                    break;
                case 5:
                    // Salir
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}