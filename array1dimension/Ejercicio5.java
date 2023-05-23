/*
Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.
 */
package array1dimension;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int array[] = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Dame 10 numeros aleatorios, y te dire cual es el menor y cual es el mayor");
        for (int i = 0; i < 10; i++) { //cargar el array

            array[i] = teclado.nextInt();

            if (array[i] < minimo) {
                minimo = array[i];
            }

            if (array[i] > maximo) {
                maximo = array[i];
            }

        }

        for (int i = 0; i < 10; i++) { //recorrer el array

            if (array[i] == maximo) {

            }

            if (array[i] == minimo) {

            }

        }
        
        //Mostrar resultados
        System.out.println("El numero maximo es " + maximo);
        System.out.println("El numero minimo es " + minimo);

    }
}
