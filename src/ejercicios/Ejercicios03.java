/*
Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor acada una. A continuación realiza las instrucciones necesarias 
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.
*/
package ejercicios;

public class Ejercicios03 {

    public static void main(String[] args){
        
        int a = 3;
        int b = 12;
        int c = 35;
        int d = 4;
        String actuales;
        actuales = mostrarValores(a, b, c, d);
        System.out.println(actuales);
        System.out.println("-----------------------------------------------");
        
        int bActual = b;
        b = c;
        c = a;
        a = d;
        d = bActual;
        
        actuales = mostrarValores(a, b, c, d);
        System.out.println(actuales);
    }
    
    public static String mostrarValores(int num1, int num2, int num3, int num4){
        
        return "a : " + num1 + "\nb : " + num2 + "\nc : " + num3 + "\nd : " + num4;
    }
}
