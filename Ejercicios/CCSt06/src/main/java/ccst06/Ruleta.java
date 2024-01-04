//Ruleta Cristina Correa Segade
package ccst06;

import java.util.Random;


public class Ruleta {
    private final Random random = new Random();
    private int casillaGanadora;
    
    public Ruleta(){
        this.casillaGanadora=random.nextInt(36)+1;
    }
    
    public void girarRuleta(){
        this.casillaGanadora=random.nextInt(37);
    }
    
    public int getCasillaGanadora() {
        return casillaGanadora;
    }
    
    public boolean jugarAPar() {
        return casillaGanadora % 2 == 0;
    }
}
