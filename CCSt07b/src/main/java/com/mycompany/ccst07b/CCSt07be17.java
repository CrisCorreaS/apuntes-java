//Cristina
/**
Realiza una clase llamada Primitiva2 similar a la clase Primitiva, pero empleando ahora una
ArrayList, y aprovechando los métodos de los que dispone para simplificar la generación de números
sin repetidos. Además, los números premiados se mantendrán ordenados y, por último, la búsqueda
de los números jugados en el ArrayList de los premiados se requiere que se haga de forma
dicotómica. Rehacer los 3 programas del ejercicio anterior de la Primitiva pero usando esta nueva
clase.
• Programa que el usuario introduzca los 6 números de su boleto y le diga cuantos acertó.
• Programa en el que se generen 1000 boletos al azar y nos informe de cuantos boletos
hay con 3, 4, 5 y 6 aciertos (a lo mejor es necesario crear un nuevo método en la clase
Primitiva para generar boletos al azar).
• Programa con un bucle que genere boletos hasta que acierte los 6 números ¿Cuántos
boletos has tenido que crear?
 */
package com.mycompany.ccst07b;

import java.util.ArrayList;


public class CCSt07be17 {

    public static void main(String[] args) {
        int aciertos;
        ArrayList<Integer> boleto = new ArrayList<>();
        Primitiva2 premiado = new Primitiva2();
        premiado.setNumeros();

        boleto = premiado.generarBoletoAlAzar();
        aciertos = premiado.comprobarBoleto(boleto);
        System.out.println("El total de aciertos es " + aciertos);
        
        int tresAciertos = 0;
        int cuatroAciertos = 0;
        int cincoAciertos = 0;
        int seisAciertos = 0;
        for (int i = 0; i < 1000; i++) {
            aciertos = 0;
            boleto = premiado.generarBoletoAlAzar();
            aciertos = premiado.comprobarBoleto(boleto);
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

        seisAciertos = 0;
        int jugada = 0;
        do {
            boleto = premiado.generarBoletoAlAzar();
            aciertos = premiado.comprobarBoleto(boleto);
            if (aciertos == 6) {
                seisAciertos++;
            }
            jugada++;
        } while (seisAciertos != 1);
        System.out.println("El numero de boletos comprados hasta conseguir 6 aciertos es " + jugada);
    }
}
