/*
Programa Java que declare una variable A de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si A es par o impar. 
Utiliza el operador condicional ( ? : ) dentro del println para resolverlo. 
*/
package ejercicios;

public class Ejercicios05 {

    public static void main(String [] args){
        int a = 4;
        String resultado = (a % 2 == 0) ? a + " es par": a + " es impar";
        System.out.println(resultado);
    }
}
