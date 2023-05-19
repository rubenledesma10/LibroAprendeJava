/*
Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.

 */
package bucles;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int introNum = 0;
        int suma = 0;
        int contador = 0;
        double media = 0;
        
        while (suma<10000){
            System.out.println("Dame un numero");
           introNum = teclado.nextInt();
           contador++;
           suma = suma + introNum;
        }
        
        media = suma/contador;
        
        System.out.println("La suma de todos los numeros que introduciste es de " +suma);
        System.out.println("Introduciste " +contador);
        System.out.println("La media de todos los numeros introducidos es de " +media);
        
    }
}
