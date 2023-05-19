/*
Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.
 */
package bucles;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dame un numero mayor a 1");
        int numero = teclado.nextInt();
        
        int contador = 0;
        int suma = 0;
        
        for (int i = 1; i<numero; i++){
            if (i%3==0){
                System.out.println(i+ " ");
                contador++;
                suma = suma + numero;
            }
        }
        
        System.out.println("Ingresaste " +contador+ " numeros multiplos de 3");
        System.out.println("La suma de estos es de " +suma);
        
        
        
        
    }
}
