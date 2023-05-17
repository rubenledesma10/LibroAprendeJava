/*
Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).
 */
package bucles;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un numero y te dire cuantos dígitos tiene: ");
        int numeroIntroducido = teclado.nextInt();

        int numeroDigitos = 1;

        while (numeroIntroducido >= 10) {
            numeroDigitos++;
            numeroIntroducido = numeroIntroducido / 10;
        }

        System.out.println("El numero que introduciste tiene " +numeroDigitos+ " digitos");

    }
}
