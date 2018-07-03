/*
Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la 
circunferencia. Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2  
*/
package ejerciciosII;

import java.util.Scanner;

public class Ejercicio05 {
    
    public static void main(String[] args){
        double radio = 0;
        Scanner lector = new Scanner(System.in);
        
        System.out.print("ingresa el radio de la circunferencia: ");
        radio = lector.nextDouble();
        String msjlongitud = calcularLongitud(radio);
        String msjArea = calcularArea(radio);
        System.out.println(msjlongitud + "\n" + msjArea);
    }
    
    public static String calcularLongitud(double radio){
        double longitud = 2*Math.PI*radio;
        return "La longitud de la circunferencia con radio " + radio + " es: "+ longitud;
    }
    
    public static String calcularArea(double radio){
        double area = Math.PI * Math.pow(radio, 2);
        return "El área de la circunferencia de radio " + radio + " es: " + area;
    }
}
