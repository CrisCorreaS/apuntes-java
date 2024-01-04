//Cristina Correa Segade
/*
Desarrolla la clase MovilPrepago que te proporcionó el profesor para ejercicios anteriores y
compárala con la proporcionada.

Voy a hacer el MóvilPrepago pero con todos los atributos privados y creando sus getters y setters correspondientes; también
crearé un constructor al que se le tenga que pasar únicamente el númeroMovil y el resto de parámetros vengan por defecto;
también he hecho un método de recarga para importes múltiplos de 10; hice dos métodos, uno para saber el precio de efectuar
una llamada y otro para saber el precio de navegar x megas; por último hice los métodos de hacer una llamada y de navegar.
Hago que el coste para establecer una llamada, el coste por minuto y el coste de consumo de MB sea el mismo para todos
los clientes.
Hago una clase un poco más diferente también en este package para practicar
*/

package ccst06;

import java.util.Scanner;


public class CCSt06e10 {

    private long numeroMovil;
    private static float costeEstablecLlamada;
    private static float costeMinutoLlamada;
    private static float costeConsumoMB;
    private float saldo;
    
    public CCSt06e10(long numeroMovil){
        this.numeroMovil = numeroMovil;
        this.costeEstablecLlamada=0.95F;
        this.costeMinutoLlamada = 0.25F;
        this.costeConsumoMB=0.05F;
        this.saldo=0;
    }
    
    //Getters:
    public long getNumeroMovil(){
        return this.numeroMovil;
    }
    
    public float getCosteEstablecLlamada(){
        return this.costeEstablecLlamada;
    }
    
    public float getCosteMinutoLlamada(){
        return this.costeMinutoLlamada;
    }
    
    public float getCosteConsumoMB(){
        return this.costeConsumoMB;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    //Setters:
    public void setNumeroMovil(long numeroMovil){
        this.numeroMovil=numeroMovil;
    }
    
    //Otros métodos:
    //Recargar el dinero introducido si es múltiplo de 10
    public void recargar(int euros){
        if(euros%10==0){
            this.saldo+=euros;
        }
    }
    
    //Método para saber el coste de la llamada
    public float costeLlamada(int minutos){
        float total=this.costeEstablecLlamada+this.costeMinutoLlamada*minutos;
        if(total>this.saldo){
            return 0;
        }
        else{
            return total;
        }
    }
    
    //Método para efectuar la llamada
    public float efectuarLlamada(int minutos){
        float costeLlamada = this.costeEstablecLlamada + this.costeMinutoLlamada * minutos;
        if(costeLlamada>this.saldo){
            return 0;
        }
        else{
            this.saldo-=costeLlamada;
            return this.saldo;
        }
    }
    
    //Método para saber el coste de la navegación de x mb
    public float costeNavegar(int mb){
        float total = this.costeConsumoMB*mb;
        if(total>saldo){
            return 0F;
        }
        else{
            return total;
        }
    }
    
    //Método para navegar x mb
    public float navegar(int mb){
        float costeNavegar = this.costeConsumoMB * mb;
        if (costeNavegar > saldo) {
            return 0F;
        } else {
            this.saldo-=costeNavegar;
            return this.saldo;
        }
    }
}
