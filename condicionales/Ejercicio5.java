/*
Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0).
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Este programa es para resolver esta ecuacion ax+b =0");
        Double a, b;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Dame un numero para a");
        a=teclado.nextDouble();
        
        System.out.println("Dame un numero para b");
        b=teclado.nextDouble();
        
        if(a==0){
            System.out.println("No se puede realizar esta ecuacion");
        } else {
            System.out.println("x= " +(-b/a));
        }
        
       
       
    }
}
