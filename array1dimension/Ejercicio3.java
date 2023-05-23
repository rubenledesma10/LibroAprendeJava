package array1dimension;


import java.util.Arrays;
import java.util.Scanner;

/*
Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int vector [] = new int [10];
        
        
        for (int i = 0; i<vector.length;i++){ //cargar los valores al array
            System.out.println("Dame un numero");
            vector[i] = teclado.nextInt();
        }
        
        for (int i = 9; i>=0; i--){ //la inicializo en 9, asi arranca desde el final, cuando llega a 0 pare, y que vaya decrementando en 1
            System.out.println("Este es el orden reverso del que introdujo los numeros usted");
            System.out.println(vector[i]);
        }
            
        
        
        
        
    }
}
