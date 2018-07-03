/*
Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.
*/
package ejerciciosII;

import java.util.Scanner;

public class Ejercicio02 {
    
    public static void main(String [] args){
        
        String nombre = "";
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        nombre = lector.nextLine();
        System.out.println("Buenos días " + nombre);
    }
    
}
