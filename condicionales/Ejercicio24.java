/*
Escribe un programa que genere la nómina (bien desglosada) de un empleado
según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
de proyecto), los días que ha estado de viaje visitando clientes durante el
mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado.

 */
package condicionales;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double sueldoBase=0;
        double sueldoVisitas;
        double sueldoBruto;
        double retencion=0;
        double sueldoNeto=0;
        
        
        System.out.println("Introduce el cargo del empleado");
        System.out.println("1. Programador junior");
        System.out.println("2. Programador senior");
        System.out.println("3. Jefe de proyecto");
        int cargoEmpleado = teclado.nextInt();
        
        if (cargoEmpleado == 1){
            sueldoBase = 950;
        } else if (cargoEmpleado == 2){
            sueldoBase = 1200;
        } else if (cargoEmpleado == 3){
            sueldoBase = 1600;
        } else {
            System.out.println("Has elegida una opcion incorrecta");
        }
        
        System.out.println("¿Cuantos dias ha estado de viaje visitando clientes?(Introducir la cantidad de dias en numero)");
        int visitandoClientes = teclado.nextInt();
        
        sueldoVisitas = visitandoClientes * 30;
        
        sueldoBruto = sueldoBase + sueldoVisitas;
        
        
        System.out.println("Introduzca su estado civil en numeros (1 SOLTERO, 2 CASADO");
        int estadoCivil = teclado.nextInt();
        
        if (estadoCivil == 1){
            retencion = 0.25;
            sueldoNeto = sueldoBruto - (sueldoBruto * retencion);
        } else if (estadoCivil ==2){
            retencion = 0.2;
            sueldoNeto = sueldoBruto - (sueldoBruto * retencion);
        }
        
        System.out.println("Sueldo base: " +sueldoBase);
        System.out.printf("Dietas: (%d viajes)  %7.2f\n", visitandoClientes, sueldoVisitas);
        System.out.println("Sueldo bruto: " +sueldoBruto);
        System.out.println("Retencion: " +retencion*100+ "%");
        System.out.println("Sueldo neto: " +sueldoNeto);
        
        
    }
}
