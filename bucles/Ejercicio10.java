/*
Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.

 */
package bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        
        int contador = 0;
        int suma = 0;
        System.out.println("Dame los numeros para calcular la media ");
        int numero = teclado.nextInt();
        
        while (numero>=0){
            contador++;
            suma = suma + numero;
            System.out.println("El resultado de la suma de los numeros es de " +suma);
            System.out.println("Dame otro numero");
            numero = teclado.nextInt();
        }

        if (contador>1){
            double media = suma / contador;
            System.out.println("La media de los numeros introducidos es de " +media);
        } 
        
        
    }
}
