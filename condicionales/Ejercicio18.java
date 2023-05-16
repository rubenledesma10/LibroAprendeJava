/*
Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dame un numero entero");
        String numEntero = teclado.nextLine();
        int tamanio = numEntero.length();
        
        if (tamanio <= 5) {
            int numero = Integer.parseInt(numEntero);
            int potencia = Double.valueOf(Math.pow(10, tamanio - 1)).intValue(); //el resultado doble lo paso a int
            int primerDigito = numero/potencia;
            System.out.println("El primero digito del numero que usted escribio es " +primerDigito);
        } else {
            System.out.println("Has introducido un numero de mas de 5 cifras");
        }
        
    }
}
