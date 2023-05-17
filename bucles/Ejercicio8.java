/*
Muestra la tabla de multiplicar de un número introducido por teclado.
 */
package bucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Dame un numero y te mostrare su tabla de multiplicacion");
        int numero = teclado.nextInt();
        
        for(int i=0;i<=10;i++){
            int resultado = i * numero;
            System.out.println(resultado);
        }
    }
}
