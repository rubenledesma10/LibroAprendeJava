/*
Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche.
*/
package condicionales;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("¿Cuánto falta para media noche?");
        System.out.println("Dame la hora actual");
        int hora = teclado.nextInt();
        System.out.println("Dame los minutos actuales");
        int minutos = teclado.nextInt();
        
        int tiempoTranscurrido = (hora*3600) + (minutos*60);
        int tiempoMediaNoche = (24 *3600) - tiempoTranscurrido;
        if (hora<24 && minutos<60){
        System.out.println("Desde las " + hora + ":" + minutos + " hasta la medianoche faltan "
                + tiempoMediaNoche + " segundos.");
        } else {
            System.out.println("Has introducido valores incorrectos");
        }
        
    }
}
