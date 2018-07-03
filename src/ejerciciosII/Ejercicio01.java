package ejerciciosII;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String [] args){
        
        int num1 = 0;
        int num2 = 0;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del primer número: ");
        num1 = lector.nextInt();
        System.out.println("Ingrese el valor del segundo número: ");
        num2 = lector.nextInt();
        
        System.out.println("El valor del primer número es: " + num1 + "\nEl valor del segundo número es: " + num2);
    }
}
