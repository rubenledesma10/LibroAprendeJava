/*
Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Por favor, elige un numero entre el 1 y 7 y te dire que dia de la semana es");
        int numero = teclado.nextInt();
        String dia;
        switch(numero){
            case 1: dia="Lunes";
            break;
            case 2: dia="Martes";
            break;
            case 3: dia="Miercoles";
            break;
            case 4: dia="Jueves";
            break;
            case 5: dia="Viernes";
            break;
            case 6: dia="Sábado";
            break;
            case 7: dia="Domingo";
            break;
            default: dia="Has introducido un numero no valido";            
        }
        System.out.println(dia);
    }
}
