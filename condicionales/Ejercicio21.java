/*
Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior.
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame la nota del primer control");
        double nota1 = teclado.nextInt();
        System.out.println("Dame la nota del segundo control");
        double nota2 = teclado.nextInt();
        double promedio = (nota1 + nota2) / 2;

        if (promedio >= 5) {
            System.out.println("Aprobado con " + promedio);
        } else if (promedio < 5) {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? Contesta poniendo apto/no apto");
            teclado.nextLine();
            String recu = teclado.nextLine();
            if (recu.equalsIgnoreCase("apto")) {
                System.out.println("Tu nota es de 5 ");
            } else if (recu.equalsIgnoreCase("no apto")) {
                System.out.println("Tu nota es de " + promedio);
            }

        }

    }
}
