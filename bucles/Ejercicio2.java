/*
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 */
package bucles;

public class Ejercicio2 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador<=100){
                       
            contador++;
            if(contador%5==0){
                System.out.println(contador);
            }
            
        }
    }
}
