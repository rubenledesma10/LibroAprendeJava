/*
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 */
package bucles;

/**
 *
 * @author ledes
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int cont = 0;
        do {
            cont++;
            if(cont%5==0){
                System.out.println(cont);
            }
        } while (cont<=100);
    }
}
