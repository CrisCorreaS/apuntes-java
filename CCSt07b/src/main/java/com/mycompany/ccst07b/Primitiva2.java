//Cristina Correa Segade

//Ejercicio 17

package com.mycompany.ccst07b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Primitiva2 {
    private static final ArrayList<Integer> numeros = new ArrayList<>();
    public void setNumeros() {
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            numeros.add(random.nextInt(49) + 1);
          
                if (numeros.contains(numeros.get(i))) {
                     numeros.remove(i);
                    numeros.add(random.nextInt(49) + 1);
                   
                }
            }
        Collections.sort(numeros);
        }

    

    public int getNumeros(int i) {

        return numeros.get(i);
    }

    public int comprobarBoleto(ArrayList<Integer> boleto) {

        int acierto = 0;
        for (int i = 0; i < 6; i++) {
            
            if (numeros.contains(boleto.get(i))){
                acierto++;
            }
        }
        return acierto;
    }

    public ArrayList <Integer> generarBoletoAlAzar() {

        Random random = new Random();
         ArrayList<Integer> boletoAzar = new ArrayList<>();
    
        for (int i = 0; i < 6; i++) {
            boletoAzar.add(random.nextInt(49) + 1);
         
                if (numeros.contains(boletoAzar.get(i))) {
                    boletoAzar.remove(i);
                    boletoAzar.add (random.nextInt(49) + 1);
                } 
            }
        Collections.sort(boletoAzar);
        
        return boletoAzar;

    }
}
