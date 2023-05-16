/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author ledes
 */
public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Resolver la siguiente ecuacion de 2do grado ax^2 + bx + c = 0");

        System.out.println("Dame el valor de a");
        double a = teclado.nextDouble();
        System.out.println("Dame el valor de b");
        double b = teclado.nextDouble();
        System.out.println("Dame el valor de c");
        double c = teclado.nextDouble();

        // 0x^2 + 0x + 0 = 0
        if ((a == 0) && (b == 0) && (c == 0)) {
            System.out.println("La ecuación tiene infinidad de soluciones.");
        }

        // 0x^2 + 0x + c = 0  con c distinto de 0
        if ((a == 0) && (b == 0) && (c != 0)) {
            System.out.println("La ecuación no se puede resolver");
        }

        // ax^2 + bx + 0 = 0  con a y b distintos de 0
        if ((a != 0) && (b != 0) && (c == 0)) {
            System.out.println( (-b / a));
        }

        // 0x^2 + bx + c = 0  con b y c distintos de 0
        if ((a == 0) && (b != 0) && (c != 0)) {
            System.out.println((-c / b));
        }

        // ax^2 + bx + c = 0  con a, b y c distintos de 0
        if ((a != 0) && (b != 0) && (c != 0)) {

            double discriminante = b * b - (4 * a * c);

            if (discriminante < 0) {
                System.out.println("La ecuación no tiene soluciones reales");
            } else {
                System.out.println("x1 = " + (-b + Math.sqrt(discriminante)) / (2 * a));
                System.out.println("x2 = " + (-b - Math.sqrt(discriminante)) / (2 * a));
            }
        }
    }
}
