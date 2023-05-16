/*
Realiza un minicuestionario con 10 preguntas tipo test sobre la selección argentina. Cada pregunta acertada sumará
10 puntos. El programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
en las diferentes asignaturas del curso.
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;
        int cont = 0;

        System.out.println("Bienvenido al examen sobre la seleccion argentina");
        System.out.println("Son 10 preguntas, en la cual cada pregunta acertada vale 10 puntos");
        System.out.println("Al final del examen tendras el puntaje total");

        System.out.println("PREGUNTAS");
        System.out.println("Pregunta 1");
        System.out.println("A. Maximo goleador");
        System.out.println("1. Messi");
        System.out.println("2 Maradona");
        System.out.println("3. Batistuta");
        System.out.println("4. Di Maria");
        opcion = teclado.nextInt();
        if (opcion == 1) {
            cont = cont + 10;
        }
        System.out.println("Pregunta 2");
        System.out.println("B. Años de campeonatos mundiales");
        System.out.println("1. 78, 86, 23");
        System.out.println("2. 78,86,22");
        System.out.println("3. 76,88, 22");
        System.out.println("4. 76, 88, 14");
        opcion = teclado.nextInt();
        if (opcion == 2) {
            cont = cont + 10;
        }
        System.out.println("Pregunta 3");
        System.out.println("C. Gol hecho por la mano de Maradona, a que pais se lo hizo?");
        System.out.println("1. Alemania");
        System.out.println("2. Brasil");
        System.out.println("3. Italia");
        System.out.println("4. Inglaterra");
        opcion = teclado.nextInt();
        if (opcion == 4) {
            cont = cont + 10;
        }
        System.out.println("Pregunta 4");
        System.out.println("D. ¿Cuantas finales perdio Messi?");
        System.out.println("1. 3");
        System.out.println("2. 2");
        System.out.println("3. 1");
        System.out.println("4. 4");
        opcion = teclado.nextInt();
        if (opcion == 4) {
            cont = cont + 10;
        }
        System.out.println("Pregunta 5");
        System.out.println("E. ¿Quienes hicieron los goles contra la Final de Francia en Qatar?");
        System.out.println("1. Di Maria y Messi");
        System.out.println("2. Messi y Molina");
        System.out.println("3. Alavarez y Messi");
        System.out.println("4. MacAllister y Di Maria");
        opcion = teclado.nextInt();
        if(opcion==1){
            cont = cont + 10;
        }
        System.out.println("Pregunta 6");
        System.out.println("F. ¿A que pais le gano Argentina la final del mundo en México?");
        System.out.println("1. Alemania");
        System.out.println("2. Italia");
        System.out.println("3. Brasil");
        System.out.println("4. Holanda");
        opcion = teclado.nextInt();
        if(opcion==1){
            cont = cont + 10;
        }
        System.out.println("Pregunta 7");
        System.out.println("G. Con respecto al mundial anterior, quien le dio el pase a Maradona para el mejor gol de los mundiales?");
        System.out.println("1. Ruggeri");
        System.out.println("2. Burruchaga");
        System.out.println("3. Enriquez");
        System.out.println("4. Ninguna de las anteriores");
        opcion = teclado.nextInt();
        if(opcion==3){
            cont = cont + 10;
        }
        System.out.println("Pregunta 8");
        System.out.println("H. A que pais le gano Argentina en la final del mundo que se jugo en Argentina?");
        System.out.println("1. Peru");
        System.out.println("2. Italia");
        System.out.println("3. Holanda");
        System.out.println("4. Alemania");
        
        opcion = teclado.nextInt();
        if(opcion==3){
            cont = cont + 10;
        }
        System.out.println("Pregunta 9");
        System.out.println("I. ¿Cuantos titulos gano Messi con la seleccion?");
        System.out.println("1. 1");
        System.out.println("2. 2");
        System.out.println("3. 3");
        System.out.println("4. 4");
        opcion = teclado.nextInt();
        if(opcion==4){
            cont = cont + 10;
        }
        System.out.println("Pregunta 10");
        System.out.println("J. Maximo asistidor");
        System.out.println("1. Messi");
        System.out.println("2. Di maria");
        System.out.println("3. Maradona");
        System.out.println("4. Burrachaga");
        opcion = teclado.nextInt();
        if(opcion==1){
            cont = cont + 10;
        }
        
        System.out.println("Tu puntaje de este examente es de " +cont+"/100");

    }
}
