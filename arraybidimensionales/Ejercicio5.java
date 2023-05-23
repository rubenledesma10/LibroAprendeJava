/*
Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo.
 */
package arraybidimensionales;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int matriz[][] = new int[6][10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (int f = 0; f < 6; f++) { //carga de matriz
            for (int c = 0; c < 10; c++) {
                matriz[f][c] = (int) (Math.random() * (0 - 1000 + 1) + 1000);

                System.out.println("Estoy en la fila " + f + " y en la columna " + c + " tiene guardado un " + matriz[f][c]);

                if (matriz[f][c] < minimo) {
                    minimo = matriz[f][c];

                }

                if (matriz[f][c] > maximo) {
                    maximo = matriz[f][c];

                }

            }
        }

        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 10; c++) {
                if (matriz[f][c] == maximo) {
                    System.out.println("El maximo es " + maximo + " y esta en la fila " + f + " y se encuentra en la columna " + c);
                }

                if (matriz[f][c] == minimo) {
                    System.out.println("El minimo es " + minimo + " y esta en la fila " + f + " y se encuentra en la columna " + c);
                }
            }
        }

    }
}
