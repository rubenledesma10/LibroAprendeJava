/*
Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.
 */
package bucles;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Dame una base");
        
        double base = teclado.nextDouble();
        
        System.out.println("Dame un exponente (entero positivo)");
        
        int exponente = teclado.nextInt();
        
        double potencia = Math.pow(base, exponente);
        
        System.out.println("La potencia es de " +potencia);
        
        
    }
}
