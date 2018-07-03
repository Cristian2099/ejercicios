/*
Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.
*/
package ejerciciosII;

import java.util.Scanner;

public class Ejercicio03 {
    
    public static void main( String[] args){
        
        int num = 0;
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        num = lector.nextInt();
        System.out.println("El doble de " + num + " es: " + (num * 2));
        System.out.println("El triple de " + num + " es: " + (num * 3));
    }
}
