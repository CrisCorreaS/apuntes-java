//Cristina Correa Segade
/*
Implementar una clase llamada Circulo, que tiene solo la propiedad radio y los métodos
setRadio, getRadio, calcularCircunferencia, calcularSuperficie, calcularDiametro además de un
constructor. Crea un programa que use esta clase creando un par de círculos y usando los métodos
creados. ¿El atributo radio puede ser privado?
Si, no habría problema en este caso
*/

package ccst06;

import java.util.Scanner;


public class CCSt06e07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Círculo 1
        Circulo circulo = new Circulo();
        
        System.out.println("El radio del primer círculo es "+circulo.getRadio());
        System.out.println("¿Qué valor quieres darle al radio del primer círculo?");
        int radio = teclado.nextInt();
        circulo.setRadio(radio);
        
        System.out.println("La circunferencia del primer círculo es "+circulo.calcularCircunferencia());
        System.out.println("La superficie del primer círculo es "+circulo.calcularSuperficie());
        System.out.println("El diámetro del primer círculo es "+circulo.calcularDiametro());
        
        //Círculo 2
        Circulo circulo2 = new Circulo();

        System.out.println("El radio del segundo círculo es " + circulo2.getRadio());
        System.out.println("¿Qué valor quieres darle al radio del segundo círculo?");
        int radio2 = teclado.nextInt();
        circulo2.setRadio(radio);

        System.out.println("La circunferencia del segundo círculo es " + circulo2.calcularCircunferencia());
        System.out.println("La superficie del segundo círculo es " + circulo2.calcularSuperficie());
        System.out.println("El diámetro del segundo círculo es " + circulo2.calcularDiametro());
    }
}
