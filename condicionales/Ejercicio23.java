/*
Escribe un programa que calcule el precio final de un producto según su
base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
reducido o superreducido) y el código promocional. Los tipos de IVA general,
reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
respectivamente que no se aplica promoción, el precio se reduce a la mitad,
se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
muestran los valores correctos, aunque los números no estén tabulados.
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double base_imponible;
        String tipoIva;
        String cod_promocional;
        double precioIva;
        double precioCodPromo;
        double total = 0;
        double totalIva = 0;
        double ivaPorcentaje = 0;
        double totalCodProm = 0;

        System.out.println("Introduzca la base imponible");
        base_imponible = teclado.nextDouble();

        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido)");
        teclado.nextLine();
        tipoIva = teclado.nextLine();

        if (tipoIva.equalsIgnoreCase("general")) {
            ivaPorcentaje = base_imponible * 0.21;

            totalIva = base_imponible + ivaPorcentaje;

        } else if (tipoIva.equalsIgnoreCase("reducido")) {
            ivaPorcentaje = base_imponible * 0.1;

            totalIva = base_imponible + ivaPorcentaje;

        } else if (tipoIva.equalsIgnoreCase("superreducido")) {
            ivaPorcentaje = base_imponible * 0.04;

            totalIva = base_imponible + ivaPorcentaje;

        }

        System.out.println("Introduzca el codigo promocional (nopro, mitad, menos5 o 5porc)");
        cod_promocional = teclado.nextLine();

        if (cod_promocional.equalsIgnoreCase("nopro")) {
            totalCodProm = 0;
        } else if (cod_promocional.equalsIgnoreCase("mitad")) {
            totalCodProm = totalIva / 2;
        } else if (cod_promocional.equalsIgnoreCase("menos5")) {
            totalCodProm = totalIva - (totalIva - 5);
        } else if (cod_promocional.equalsIgnoreCase("5porc")) {
            totalCodProm = totalIva - (totalIva - 0.05);
        }

        total = totalIva - totalCodProm;

        System.out.println("Base imponible: " + base_imponible);
        System.out.println("Tipo de iva: " + tipoIva);
        System.out.println("Codigo promocional: " + cod_promocional);
        System.out.println("IVA: " + ivaPorcentaje);
        System.out.println("Precios con IVA: " + totalIva);
        System.out.println("Cod. promocional " + totalCodProm);
        System.out.println("Total : " + total);

    }
}
