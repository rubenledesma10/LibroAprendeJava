/*
Realiza un programa que calcule la media de tres notas
Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio7y8 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int nota1, nota2, nota3;
        
        System.out.println("Dame la primer nota");
        nota1 = teclado.nextInt();
        System.out.println("Dame la 2da nota");
        nota2 = teclado.nextInt();
        System.out.println("Dame la 3er nota");
        nota3 = teclado.nextInt();
        
        double promedio = (nota1+nota2+nota3)/3;
        
        System.out.println("Tu promedio es de " +promedio);
        
        if (promedio<=6){
            System.out.println("Insuficiente");
        } else if (promedio==7) {
            System.out.println("Suficiente");
        } else if (promedio ==8) {
            System.out.println("Bien");
        } else if (promedio == 9) {
            System.out.println("Notable");
        } else if (promedio==10) {
            System.out.println("Sobresaliente");
        }
        
    }
}
