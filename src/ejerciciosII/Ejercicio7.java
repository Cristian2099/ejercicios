package ejerciciosII;

import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args){
        
        float primerCateto = 0.0f;
        float segundoCateto = 0.0f;
        float pitagoras = 0.0f;
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese la longitud del primer cateto: ");
        primerCateto = lector.nextFloat();
        
        System.out.print("Ingrese la longitud del segundo cateto: ");
        segundoCateto = lector.nextFloat();
        
        pitagoras = (float)Math.pow(primerCateto, 2) + (float)Math.pow(segundoCateto, 2);
        System.out.println("La hipotenusa en base al Teorema de Pitágoras es: " + pitagoras);
    }
    
}
