/*
Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h. 
t = raiz(2h/g) siendo g = 9.81 m/s2
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        Double g = 9.81;
        
        System.out.println("Calcular el tiempo de caida de un objeto");
        
        System.out.println("Dame la altura en metros de la cual cae el objeto");
        
        Double h = teclado.nextDouble();
        
        Double s = Math.sqrt(2*h/g);
        
        System.out.printf("El objeto tardara %.2f segundos en caer ",s); //redondeamos usando String format
        
        
    }
}
