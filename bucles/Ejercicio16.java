/*
Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.
 */
package bucles;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un numero y te dire si es primo o no");

        int numero = teclado.nextInt();
        boolean primo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
            }

        }
        
        if (primo){
            System.out.println("El numero que introduciste es primo");
        } else {
            System.out.println("El numero que introduciste no es primo");
        }
    }
}
