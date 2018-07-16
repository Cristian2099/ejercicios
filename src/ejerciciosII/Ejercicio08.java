//Programa que calcula el volumen de una esfera.
package ejerciciosII;

public class Ejercicio08 {

    public static void main(String[] args){
        
        double radio = 1;
        double vEsfera = calcularVolumenEsfera(radio);
        System.out.println("El volumen de la esfera es: " + vEsfera + " metros cúbicos.");
    }
    
    public static double calcularVolumenEsfera(double radio){
        double vEsfera = (4 * Math.PI * Math.pow(radio, 3))/3;
        return vEsfera;
    }
}
