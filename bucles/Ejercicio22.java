/*
Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos
 */
package bucles;

public class Ejercicio22 {
    public static void main(String[] args) {
        
        System.out.println("A continuacion, te voy a mostrar todos los numeros primos entre 2 y 100");
        
        for (int i = 1; i<100; i++){
            
            int contador=0;
            
            for (int j = 1; j<=i; j++){
                if (i%j==0){
                    contador++;
                }
            }
            
            if (contador ==2){
                System.out.println(i);
            }

        }
        
    }
}
