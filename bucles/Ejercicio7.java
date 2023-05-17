/*
Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
package bucles;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int contraseniaCajaFuerte = 1234;
        int contraseniaUsu;
        int intentos = 1;
        
        while (intentos<=4){
            System.out.println("Introduce la contraseña");
            contraseniaUsu = teclado.nextInt();
            if(contraseniaUsu==contraseniaCajaFuerte){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            } else {
                intentos++;
                System.out.println("Lo siento, esa no es la combinacion");              
            }
        }
        
        
    }
}
