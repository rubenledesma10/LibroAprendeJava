/*
Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int numero;
        int ultimaCifra;
        
        System.out.println("Dame un numero");
        numero = teclado.nextInt();
        
        ultimaCifra = numero%10;   
        System.out.println("La ultimo cifra del numero que ingresaste es " +ultimaCifra);
        
    }
}
