//Cristina Correa Segade
//Ejercicio 

package com.mycompany.ccst10;


public class Triangulov9 extends Figura2Dv9 {
    public String estilo;

    Triangulov9(Triangulov9 trian) {
        super(trian.getAncho(), trian.getAlto(),trian.getNombre());
        estilo = trian.estilo;
    }

    Triangulov9(double b, double h, String e,String n) {
        super(b, h,n);
        estilo = e;
    }

    Triangulov9() {
        super();
        estilo = null;
    }

    Triangulov9(double l,String n) {
        super(l,n);
        estilo = "igualBaseAltura";
    }

    @Override
    public double area() {
        double a = (getAncho() * getAlto()) / 2;
        return a;
    }

    public void verEstilo() {
        System.out.println(estilo);
    }
}

