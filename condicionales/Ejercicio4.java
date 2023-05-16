/*
Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.

 */
package condicionales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int salarioSemanal;
        System.out.println("¿Cuantas horas trabajaste esta semana?");
        int hora = teclado.nextInt();
        
        if (hora<=40){
           salarioSemanal = hora*12;
            System.out.println("Tu sueldo de esta semana es " +salarioSemanal);
        } else {
            if (hora>=41){
                salarioSemanal = (40*12) + ((hora-40)*16); 
                System.out.println("Tu sueldo de esta semana es " +salarioSemanal);
            }
        }
        
        
    }
}
