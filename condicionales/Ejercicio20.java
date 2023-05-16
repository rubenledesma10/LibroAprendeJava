/*
Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras.
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        boolean capicua = false;
        System.out.println("Dame un numero y te digo si es capicua o no");
        numero = teclado.nextInt();

        String tamanio = Integer.toString(numero);

        int cifras = tamanio.length();

        if (cifras <= 5) {

            if (numero < 10) { //si el numero es menor de 10 va a tener una 1 cifra, por ende es capicua
                capicua = true;
            } else if (numero >= 10 && numero < 100) { //si el numero tiene dos cicras
                if (numero / 10 == numero % 10) { //si la division de numero y 10 es = al resto de numero dividido 10 es capicua
                    capicua = true;
                }
            } else if (numero >= 100 && numero < 1000) { //si el numero tiene 3 cifras
                if (numero / 100 == numero % 10) { //si la division de numero y 100 es = al resto de numero dividido 10 es capicua
                    capicua = true;
                }
            } else if (numero >= 1000 && numero < 10000) { //si el numero tiene 4 cifras
                if (numero / 1000 == numero % 10 && (numero / 100) % 10 == (numero / 10) % 10) { 
                    //division de n y 1000 es = al resto de n y 10 Y si el resto de la division n/100 es igual al resto de numero /10 es capicua
                    capicua = true;
                }
            } else if (numero >= 10000) { //si el numero tiene 5 cifras
                if (numero / 10000 == numero % 10 && (numero / 1000) % 10 == (numero / 10) % 10) { 
                    //division de n y 10000 es = al resto de n y 10 Y si el resto de la division n/1000 es igual al resto de numero /10 es capicua                    
                    capicua = true;
                }
            }

            if (capicua) { //si capicua es true
                System.out.println("El numero que introduciste es capicua");
            } else {
                System.out.println("El numero que introduciste no es capicua");
            }

        } else {
            System.out.println("Has elegido un numero mayor de 5 cifras");
        }
    }
}
