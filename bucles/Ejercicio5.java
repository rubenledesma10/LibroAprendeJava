/*
Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
un bucle while.

 */
package bucles;

public class Ejercicio5 {
    public static void main(String[] args) {
        int contador = 320;
        while(contador>=160){
            System.out.println(contador);
            contador = contador - 20;
        }
    }
}
