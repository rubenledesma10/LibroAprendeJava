/*
Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
hacia la derecha
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("PIRAMIDE");

        System.out.println("Dame el caracter con el cual te gustaria que se haga la piramide");

        String caracter = teclado.nextLine();

        System.out.println("Como quieres la forma de la piramide?");
        System.out.println("1. Vertifce para arriba");
        System.out.println("2. Vertifce para la derecha");
        System.out.println("3. Vertifce para abajo");
        System.out.println("4. Vertifce para la izquierda");

        int forma = teclado.nextInt();

        switch (forma) {
            case 1:
                System.out.println("  " + caracter);
                System.out.println(" " + caracter + caracter + caracter);
                System.out.println(caracter + caracter + caracter + caracter + caracter);
                break;

            case 2:
                System.out.println(caracter + caracter + caracter + caracter + caracter);
                System.out.println(" " + caracter + caracter + caracter);
                System.out.println("  " + caracter);
                break;
            case 3:
                System.out.println("    " + caracter);
                System.out.println("  " + caracter + " " + caracter);
                System.out.println(caracter + " " + caracter + " " + caracter);
                System.out.println("  " + caracter + " " + caracter);
                System.out.println("    " + caracter);
                break;
            case 4:
                System.out.println(caracter);
                System.out.println(caracter + " " + caracter);
                System.out.println(caracter + " " + caracter + " " + caracter);
                System.out.println(caracter + " " + caracter);
                System.out.println(caracter);
                break;
            default:
                System.out.println("Has elegida una opcion invalida");
        }

    }
}
