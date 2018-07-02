/*
Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor. 
A continuación reliza y muestra muestra por pantalla una serie de operaciones entre ellas. 
*/
package ejercicios;

public class Ejercicios01 {
    
    public static void main (String [] args){
        
        int x = 1;
        int y = 2;
        double n = 3.1;
        double m = 3.2;
        double suma = suma(x,y);
        double resta = resta(m,x);
        double multi = multi(y,n);
        double div = div(n,m);
        
        System.out.println("El resultado de sumar " + x + " + " + y + " es: " + suma);
        System.out.println("El resultado de restar " + m + " - " + x + " es: " + resta);
        System.out.println("El resultado de multiplicar " + y + " * " + n + " es: " + multi);
        System.out.println("El resultado de dividir " + n + " / " + m + " es: " + div);
    }
    
    public static double suma(double num1, double num2){
        return num1+num2;
    }
    
    public static double resta(double num1, double num2){
        return num1-num2;
    }
 
    public static double multi(double num1, double num2){
        return num1*num2;
    }
    
    public static double div(double num1, double num2){
        return num1/num2;
    }
    
}
