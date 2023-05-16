
//Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.

package condicionales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("¿Qué dia necesitas saber?");
        String dia=teclado.nextLine();
        
        if ("lunes".equalsIgnoreCase(dia)){
            System.out.println("Tienes matematica");
        } else {
            if ("martes".equalsIgnoreCase(dia)){
                System.out.println("Tienes lengua");
            } else {
                if ("miercoles".equalsIgnoreCase(dia)){
                    System.out.println("Tienes logica");
                } else {
                    if ("jueves".equalsIgnoreCase(dia)){
                        System.out.println("Tienes ingles");
                    } else {
                        if ("viernes".equalsIgnoreCase(dia)){
                            System.out.println("Tienes fisica");
                        } else {
                            System.out.println("No has elegida un dia correcto");                           
                        }
                        
                    }
                } 
            }
        }
        
    }
}
