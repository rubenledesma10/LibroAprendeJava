/*
Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura.
 */
package arraybidimensionales;

/**
 *
 * @author ledes
 */
public class Ejercicio1 {
    public static void main(String[] args) {
               
        int num[][] =new int [3][6];
        num[0][0]=0;
        num[0][1]=30;
        num[0][2]=2;
        num[0][5]=5;
        num[1][0]=75;
        num[1][4]=0;
        num[2][2]=-2;
        num[2][3]=9;
        num[2][5]=11;
        
        for (int f = 0; f<3;f++){
            for (int c = 0; c<6;c++){
                System.out.println(num[f][c]);
            }
        }
                
    }
}
