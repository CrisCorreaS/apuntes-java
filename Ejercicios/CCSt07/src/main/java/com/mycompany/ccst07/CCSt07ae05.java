//Cristina Correa Segade
/*
Realizar una clase Primitiva que tenga definido un Array privado de 6 elementos con el
resultado de un sorteo de la primitiva (serán 6 enteros con valores comprendidos entre 1 y 49 y sin
repetidos). La clase dispondrá de un constructor en el que se generan y almacenen esos números
al azar, también tendrá un método al que se le pase una combinación jugada como parámetro (no
necesariamente ordenada) y devuelva el número de aciertos. Realiza tres programas distintos que
usen esa clase:
• Programa que el usuario introduzca los 6 números de su boleto y le diga cuantos acertó.
• Programa en el que se generen 1000 boletos al azar y nos informe de cuantos boletos
hay con 3, 4, 5 y 6 aciertos (a lo mejor es necesario crear un nuevo método en la clase
Primitiva para generar boletos al azar).
• Programa con un bucle que genere boletos hasta que acierte los 6 números ¿Cuántos
boletos has tenido que crear?
 */

package com.mycompany.ccst07;


public class CCSt07ae05 {

    public static void main(String[] args) {
        int aciertos;
        int[] boleto = new int[6];
        Primitiva primitivaPremio = new Primitiva();
        primitivaPremio.setNumeros();

        // Programa 1
        boleto = primitivaPremio.generarBoletoAlAzar();
        aciertos = primitivaPremio.comprobarBoleto(boleto);
        System.out.println("El numero de aciertos es " + aciertos);
        
        //Programa 2
        int tresAciertos = 0;
        int cuatroAciertos = 0;
        int cincoAciertos = 0;
        int seisAciertos = 0;
        for (int i = 0; i < 1000; i++) {
            aciertos = 0;
            boleto = primitivaPremio.generarBoletoAlAzar();
            aciertos = primitivaPremio.comprobarBoleto(boleto);
            switch (aciertos) {
                case 3->
                    tresAciertos++;
                case 4->
                    cuatroAciertos++;
                case 5->
                    cincoAciertos++;
                case 6->
                    seisAciertos++;
            }

        }
        System.out.println("El numero de boletos con 3 aciertos es " + tresAciertos);
        System.out.println("El numero de boletos con 4 aciertos es " + cuatroAciertos);
        System.out.println("El numero de boletos con 5 aciertos es " + cincoAciertos);
        System.out.println("El numero de boletos con 6 aciertos es " + seisAciertos);
        
        // Programa 3
        seisAciertos = 0;
        int vecesJugadas = 0;
        do {
            boleto = primitivaPremio.generarBoletoAlAzar();
            aciertos = primitivaPremio.comprobarBoleto(boleto);
            if (aciertos == 6) {
                seisAciertos++;
            }
            vecesJugadas++;
        } while (seisAciertos != 1);
        System.out.println("El numero de boletos generados hasta conseguir los 6 aciertos es de " + vecesJugadas + " boletos");
    }
}
