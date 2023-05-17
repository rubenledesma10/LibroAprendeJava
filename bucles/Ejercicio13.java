/*
Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.
 */
package bucles;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dame 10 numeros y te dire cuales son positivos y cuales son negativos");
                
        int positivo = 0;
        int negativo = 0;
        
        for (int i = 0; i<10; i++){
            
            int numero = teclado.nextInt();
            
            if (numero>0){
                positivo++;
            } else {
                negativo++;
            }
        }
        
        System.out.println("Has introducido " +positivo+ " numeros positivos y has introducido " +negativo+  " numeros negativo");
        
    }
}
