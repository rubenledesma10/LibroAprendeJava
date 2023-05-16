/*
Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h.
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String dia;
        int hora, minutos, diaSemana=1;
        System.out.println("Dame un dia, de lunes a viernes");
        dia = teclado.nextLine();
        switch (dia) {
            case "lunes":
                diaSemana = 1;
                break;
            case "martes":
                diaSemana = 2;
                break;
            case "miercoles":
                diaSemana = 3;
                break;
            case "jueves":
                diaSemana = 4;
                break;
            case "viernes":
                diaSemana = 5;
                break;
            default:
                System.out.println("Has untroducido un dia incorrecto");
        }
        
        System.out.println("Decime la hora actual");
        hora = teclado.nextInt();
        System.out.println("Decime los minutos actuales");
        minutos = teclado.nextInt();
        
        int minutosTotal = (5 * 24 * 60) + (15*60); //dia semana total * 24 hs * 60 hs + hora*minutos
        int minutosActuales = (diaSemana * 24 * 60) + (hora * 60) + minutos;
        
        int minutosRestantes = minutosTotal - minutosActuales;
        
        System.out.println("Faltan " +minutosRestantes+ " minutos para llegar al fin de semana");
        
        
        

    }
}
