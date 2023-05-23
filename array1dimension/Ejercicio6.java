/*
Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
 */
package array1dimension;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int array[] = new int[15];

        System.out.println("Dame 15 numeros");

        for (int i = 0; i < 15; i++) { //cargar vectores

            array[i] = teclado.nextInt();

        }

        int aux = array[14]; //variable auxiliar para rotar vectores

        for (int i = 13; i >= 0; i--) { //rotar vectores a la derecha

            array[i + 1] = array[i];

        }
        array[0] = aux;// reemplazar variable auxiliar para que se muestre al principio

        for (int i = 0; i < 15; i++) { //mostrar variable auxiliar

            System.out.println(array[i]);
        }

    }
}
