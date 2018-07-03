/*
Programa Java que declare una variable B de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si el valor de B es 
positivo o negativo. Consideraremos el 0 como positivo. Utiliza el operador condicional (? : ) dentro del println para resolverlo.
*/
package ejercicios;

public class Ejercicios07 {

    public static void main(String [] args){
        int b = -1;
        System.out.println((b >= 0 )? b + " es positivo" : b + " es negativo");
    }
}
