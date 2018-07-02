package ejercicios;
/*
Programa java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y asigna a 
cada una un valor. A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la diferencia de A - N, el valor numérico 
correspondiente al carácter que contiene la variable C.
*/
public class Ejercicios {
    
    public static void main(String[] args) {
       
        int n = 3;
        double a = 5.2;
        char c = 'a';
        String valores = mostrarValores(n, a, c);;
        double suma = suma(n,a);
        double resta = resta(a, n);
        int ascii = ascii(c);
        
        System.out.println(valores + "\n");
        System.out.println("El resultado de sumar " + n + " + " + a +" es: " + suma);
        System.out.println("El resultado de restar " + a + " - " + n +" es: " + resta);
        System.out.println("El ascii de la letra " + c + " es: " + ascii);
    }
    
    public static String mostrarValores(int n, double a, char c){
        return "El valor de n es: " + n + "\nEl valor de a es: " + a + "\nEl valor de c es: " + c;
    }
    
    public static double suma(int num1, double num2){
        
        return num1 + num2;
    }
    
    public static double resta(double num1, int num2){
        return num1 - num2;
    }
 
    public static int ascii(char character){
        return (int) character;
    }
}
