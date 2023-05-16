//Escribe un programa que ordene tres números enteros introducidos por teclado.
package condicionales;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("ORDENAR NUMEROS DE MENOR A MAYOR");
        System.out.println("Dame el primer numero");
        int n1 = teclado.nextInt();
        System.out.println("Dame el segundo numero");
        int n2 = teclado.nextInt();
        System.out.println("Dame el tercer numero");
        int n3 = teclado.nextInt();
        
        if (n1>=n2 && n2>=n3){
            System.out.println(n1+ " " +n2+" " +n3);
        } else if (n1>=n3 && n3>=n2){
            System.out.println(n1+" " +n3+ " " +n2);
        } else if (n2>=n3 && n3>=n1){
            System.out.println(n2+ " " +n3+" " +n1);
        } else if (n3>=n1 && n1>=n2){
            System.out.println(n3+" "+n1+" "+n2);
        } else {
            System.out.println(n3+" " +n2+ " " +n1);
        }
                
        
    }
}
