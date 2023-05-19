/*
Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.
 */
package bucles;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Dame un numero");
       
        int numero = teclado.nextInt();
        int invertido = 0;
        
        
        while (numero>0){
            
            int resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero = numero / 10;
        }
        
        System.out.println(invertido);
        
        
    }
}
