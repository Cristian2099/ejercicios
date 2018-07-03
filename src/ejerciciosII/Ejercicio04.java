/*
Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
*/
package ejerciciosII;

import java.util.Scanner;

public class Ejercicio04 {
    
    public static void main(String[] args){
        
        double centigrados = 0.0;
        double farenheit = 0;
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese los grados celsius para convertir en Farenheit: ");
        centigrados = lector.nextDouble();
        farenheit = farenheit(centigrados);
        System.out.println(centigrados + "° grados celsius" + ", son " + farenheit + "F grados Farenheit.");
    }
    
    public static double farenheit(double centigrados){
        
        double farenheit = 32 + ( 9 * centigrados / 5);
        
        return farenheit;
    }
}
