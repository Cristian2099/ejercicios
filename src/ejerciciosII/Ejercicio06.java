/*
Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
*/
package ejerciciosII;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio06 {
    
    public static void main(String[] args){
        
        Scanner lector = new Scanner(System.in);
        int kmHora;
        double mSegundo;
        System.out.print("Ingrese el valor en km/h: ");
        
        kmHora= lector.nextInt();
        mSegundo = kmHora / 3.6;
        System.out.println(kmHora + "km/h han sido convertidos a " + mSegundo + "m/s.");
        
    }
}
