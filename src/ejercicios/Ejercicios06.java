/*
Programa Java que declare una variable C de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si el valor de C es 
positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo.
Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
*/
package ejercicios;

public class Ejercicios06 {

    public static void main (String [] args){
        
        int c = 134;
        String esPositivo = (c >= 0) ? c + " es positivo." : c + " es negativo.";
        String esPar = (c % 2 == 0) ? c + " es par.": c + " es impar.";
        String esMultiDeCinco = (c % 5 == 0) ? c + " es multiplo de 5 y de 10." : c + " no es multiplo de 5 ni de 10.";
        String esMayorCien = (c > 100) ? c + " es mayor que 100." : c + " es menor a 100.";
        System.out.println(esPositivo + "\n" + esPar + "\n" + esMultiDeCinco + "\n" + esMayorCien);
        
    }
}
