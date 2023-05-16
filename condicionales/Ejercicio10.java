package condicionales;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int mes, dia;
        
        System.out.println("Adivinar de el signo del horosocopo");
        System.out.println("Dame el mes en que naciste (1-12)");
        mes = teclado.nextInt();
        System.out.println("Dame el dia en que naciste");
        dia = teclado.nextInt();
        
        if (dia>31 || dia<=0 || mes<=0 || mes>12){
            System.out.println("Has introducido valores incorrectos");
        } else if ((dia>=21 && mes ==3) || (dia<=21 && mes ==4)){
            System.out.println("Aries");
        } else if ((dia>=20 && mes==4) || (dia<=20 && mes==5)){
            System.out.println("Tauro");
        } else if ((dia>=21 && mes==5) || (dia<=20 && mes==6)){
            System.out.println("Geminis");
        } else if ((dia>=21 && mes==6) || (dia<=22 && mes==7)){
            System.out.println("Cancer");
        } else if ((dia>=23 && mes==7) || (dia<=22 && mes==8)){
            System.out.println("Leo");
        } else if ((dia>=23 && mes==8) || (dia<=22 && mes==9)){
            System.out.println("Virgo");
        } else if ((dia>=23 && mes==9) || (dia<=22 && mes==10)){
            System.out.println("Libra");
        } else if ((dia>=23 && mes==10) || (dia<=21 && mes==11)){
            System.out.println("Escorpio");
        } else if ((dia>=22 && mes==11) || (dia<=21 && mes==12)){
            System.out.println("Sagitario");
        } else if ((dia>=22 && mes==12) || (dia<=19 && mes==1)){
            System.out.println("Capricornio");
        } else if ((dia>=20 && mes==1) || (dia<=18 && mes==2)){
            System.out.println("Acuario");
        } else if ((dia>=19 && mes==2) || (dia<=20 && mes==3)){
            System.out.println("Piscis");
        }

    }
}
