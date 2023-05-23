/*
Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).
 */
package arraybidimensionales;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int matriz[][] = new int[4][5];

        int sumaFila = 0;
        int sumaCol = 0;

        for (int f = 0; f < 4; f++) { //carga de matriz
            for (int c = 0; c < 5; c++) {
                matriz[f][c] = (int)(Math.random()*(999-100+1)+100);
                System.out.println(matriz[f][c]);
            }
        }

        for (int f = 0; f < 4; f++) { //recorrder matriz y sumar filas
            sumaFila = 0; //para que no se acumule los resultados
            for (int c = 0; c < 5; c++) {
                sumaFila = sumaFila + matriz[f][c];
            }
            System.out.println("La suma de la fila " + f + " es de " + sumaFila); //mostrar suma fila
        }

        for (int c = 0; c < 5; c++) { //recorrer matriz y sumar columnas
            sumaCol = 0; //para que no se acumule los resultados
            for (int f = 0; f < 4; f++) {
                sumaCol = sumaCol + matriz[f][c];
            }
            System.out.println("La suma de la columna " + c + " es de " + sumaCol); //mostrar suma columnas
        }
    }
}
