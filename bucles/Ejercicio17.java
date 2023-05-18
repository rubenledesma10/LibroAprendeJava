/*
Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).
 */
package bucles;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Dame un numero y te sumare los 100 numeros siguientes");
        
        int numero = teclado.nextInt();
        int suma=0;
        
        while (numero<=0){
            System.out.println("El numero introducido no es correcto, intentalo nuevamente");
            numero = teclado.nextInt();
        }
        
        for (int i = numero; i<numero+100; i++){
            suma= suma + i;
        }
        
        System.out.println(suma);
        
        
    }
}
