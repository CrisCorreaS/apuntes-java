//PistolaCristina Correa Segade
package ccst06;

import java.util.Random;

public class Pistola {
    Random random = new Random();

    //Atributos
    private int bala;
    private int cargador = 1;

    //Constructor
    Pistola() {
        this.bala = random.nextInt(6) + 1;
    }

    //Método
    public boolean disparar() {
        if (this.cargador == this.bala) {
            return true;
        } else {
            this.cargador++;
            return false;
        }
    }
}
