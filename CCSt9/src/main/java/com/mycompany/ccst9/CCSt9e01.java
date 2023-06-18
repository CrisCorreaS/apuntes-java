//Cristina Correa Segade
/*
Realiza un programa con una variable de tipo Figura2D_v8, y sobre ella llama a uno de los
constructores de Triangulo_v8. Muestra sus dimensiones y el cálculo del área.
*/

package com.mycompany.ccst9;

public class CCSt9e01 {

    public static void main(String[] args) {
        Figura2Dv8 figura = new Triangulov8(2.5, 3, "isosceles", "fig1");
        figura.verDim();
        System.out.println(((Triangulov8) figura).area());
    }
}
