/*
Define un array de 12 números enteros con nombre num y asigna los valores
según la tabla que se muestra a continuación. Muestra el contenido de todos
los elementos del array. ¿Qué sucede con los valores de los elementos que no
han sido inicializados?
 */
package array1dimension;

public class Ejercicio1 {

    public static void main(String[] args) {

        int array[] = new int[12];
        array[0] = 39;
        array[1] = -2;
        array[4] = 0;
        array[6] = 14;
        array[8] = 5;
        array[9] = 120;

        for (int i = 0; i < 12; i++) {
            System.out.println("Estoy en el indice " +i);
            System.out.println("Y tiene guardado " +array[i]);
        }
    }
}

//los array que no tienen ningun valor automaticamente se inicializan en 0