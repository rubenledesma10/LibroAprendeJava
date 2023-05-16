/*
Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un numero y te dire la cantidad de digitos tiene");
        int numero = teclado.nextInt();
        String tamanio = Integer.toString(numero);

        if (tamanio.length() <= 5) {
            if (numero >= 0) {
                if (numero >= 0 && numero <= 9) {
                    System.out.println("El numero que introduciste tiene 1 digito");
                } else if (numero >= 10 && numero <= 99) {
                    System.out.println("El numero que introduciste tiene 2 digitos");
                } else if (numero >= 100 && numero <= 999) {
                    System.out.println("El numero que introduciste tiene 3 digitos");;
                } else if (numero >= 1000 && numero <= 9999) {
                    System.out.println("El numero que introduciste tiene 4 digitos");
                } else if (numero >= 10000 && numero <= 99999) {
                    System.out.println("El numero que introduciste tiene 5 digitos");
                } else if (numero <= -1) {
                    System.out.println("El numero que introduciste tiene 1 digito");
                } else if (numero <= -10 && numero >= -99) {
                    System.out.println("El numero que introduciste tiene 2 digitos");
                } else if (numero <= -100 && numero >= -999) {
                    System.out.println("El numero que introduciste tiene 3 digitos");
                } else if (numero <= -1000 && numero >= -9999) {
                    System.out.println("El numero que introduciste tiene 4 digitos");
                } else if (numero <= -10000 && numero >= -99999) {
                    System.out.println("El numero que introduciste tiene 5 digitos");
                }
            } else {
                if (numero <= -1 && numero >= -9) {
                    System.out.println("El numero que introduciste tiene 1 digito");
                } else if (numero <= -10 && numero >= -99) {
                    System.out.println("El numero que introduciste tiene 2 digitos");
                } else if (numero <= -100 && numero >= -999) {
                    System.out.println("El numero que introduciste tiene 3 digitos");
                } else if (numero <= -1000 && numero >= -9999) {
                    System.out.println("El numero que introduciste tiene 4 digitos");
                } else if (numero <= -10000 && numero >= -99999) {
                    System.out.println("El numero que introduciste tiene 5 digitos");
                }
            }
        } else {
            System.out.println("Has introducido un numero de 6 cifras o mas");
        }
    }
}
