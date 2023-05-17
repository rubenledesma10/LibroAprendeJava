/*
Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */
package bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int contador = 1;
        
        System.out.println("Dame los numeros que queres saber el cuadrado y el cubo");
        
        int numero = teclado.nextInt();
        
        for (int i = numero; i<numero + 5; i++){
            System.out.printf("%5d |%8d |%9d\n", i, i * i, i * i * i);
        }
        
    }
}
