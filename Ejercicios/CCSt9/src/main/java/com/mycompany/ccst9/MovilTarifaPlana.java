//Cristina Correa
//Ejercicio 5 y 6

package com.mycompany.ccst9;

import java.util.Scanner;


public class MovilTarifaPlana extends MovilPrepago {
    public MovilTarifaPlana(long nM, float cEL, float cML, float s) {
        super(nM, cEL, cML, 0, s); // Le paso el coste de consumo de MB que es igual a 0
    }

    public void navegar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce los MB usados: ");
        int mb = scanner.nextInt();
        super.navegar(mb);
    }
}
