/*
Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.
 */
package bucles;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int num;
        int contNum = 0;
        int contImpares = 0;
        int cantNumImpares = 0;
        int mayorPares = 0;
        int mediaImpar = 0;
         
        do{
            num = teclado.nextInt();
            
            if (num>=0) { //para acumular todos los numeros
                contNum++;
            }
            
            if (num%2==1){ //para saber si es impar
                contImpares = contImpares + num;
                cantNumImpares++; //guardar la cantidad de numeros impares
                mediaImpar = contImpares / cantNumImpares;
            } else { //para numeros pares
                if (num>mayorPares){
                    mayorPares = num; //reemplazo llos numeros por mayor de los pares para que se guarde el mayor numero que ingreso
                }
            }
            
        } while (num>=0);
        
        System.out.println("Introduciste " +contNum+ " numeros");
        System.out.println("La media de los impares es " +mediaImpar);
        System.out.println("El mayor de los pares es " +mayorPares);
        
        
        
    }
}
