/*
Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:

       1
      121
     12321 
    1234321

 */
package bucles;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa pinta una pirámide hecha a base de números.");
        System.out.println("Por favor, introduzca la altura de la pirámide: ");

        int n = teclado.nextInt();

        int altura = 1;
        int i = 0;
        int espacios = n - 1;

        while (altura <= n) {

            for (i = 1; i <= espacios; i++) { //para los espacios
                System.out.print(" ");
            }

            for (i = 1; i < altura; i++) { //imprimir numeros y numero maximo en cada fila de la piramide
                System.out.print(i);
            }

            for (i = altura; i > 0; i--) { //imprimir numeros y empezar a descontar
                System.out.print(i);
            }

            System.out.println();

            altura++;
            espacios--;
        }

    }
}
