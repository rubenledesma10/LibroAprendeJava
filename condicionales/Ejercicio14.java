/*
Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5
*/
package condicionales;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Dame un numero y te dire si es par y si es divisible por 5");
        
        int numero = teclado.nextInt();
        
        if (numero%2==0){
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }
        
        if (numero%5==0){
            System.out.println("Es divisible por 5");
        } else {
            System.out.println("No es divisible por 5");
        }
    }
}
