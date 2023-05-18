/*
Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7.
 */
package bucles;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame el primer numero");

        int num1 = teclado.nextInt();

        System.out.println("Dame el segundo numero");

        int num2 = teclado.nextInt();

        int mayor;
        int menor;

        if (num1 != num2) { //si son distintos que haga esto
            if (num1 > num2) { //definir cual es el mayor y cual es el menor
                mayor = num1;
                menor = num2;
            } else { //definir cual es el mayor y cual es el menor
                mayor = num2;
                menor = num1;
            }

            for (int i = menor; i <= mayor; i++) { //muestro por pantalla cuales son lso numeros desde el menor al mayor
                System.out.println(i);
            }

        } else {
            System.out.println("Has introducido numeros iguales");
        }

    }
}
