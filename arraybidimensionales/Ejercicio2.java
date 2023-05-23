/*
Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.
 */
package arraybidimensionales;

import java.util.Scanner;

/**
 *
 * @author ledes
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int matriz[][] = new int[4][5];
        
        int sumaFila = 0;
        int sumaCol = 0;
        
        for (int f = 0; f < 4; f++) { //carga de matriz
            for (int c = 0; c < 5; c++) {
                System.out.println("Dame un numero");
                matriz[f][c] = teclado.nextInt();
            }
        }
        
        for (int f = 0; f<4; f++){ //recorrder matriz y sumar filas
            sumaFila = 0; //para que no se acumule los resultados
            for (int c=0;c<5;c++){
                sumaFila = sumaFila + matriz[f][c];
            }
            System.out.println("La suma de la fila " +f+ " es de " +sumaFila); //mostrar suma fila
        }
        
        for (int c=0;c<5;c++){ //recorrer matriz y sumar columnas
            sumaCol = 0; //para que no se acumule los resultados
            for (int f=0; f<4;f++){
                sumaCol = sumaCol + matriz[f][c];
            }
            System.out.println("La suma de la columna " +c+ " es de " +sumaCol); //mostrar suma columnas
        }
 
    }
}
