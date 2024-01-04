//Cristina Correa Segade
/*
Desarrolla la clase CuentaCorriente que te proporcionó el profesor para ejercicios anteriores
y compárala con la proporcionada.

Hago una clase que tiene los mismos atributos pero todos privados con setters y getters en los atributos que pienso que son
necesarios; para mí, las comisiones son fijadas para todos los clientes y no hay un mínimo.
Hago una clase un poco más diferente también en este package para practicar
*/

package ccst06;


public class CCSt06e11 {

    private String IBAN;
    private float saldo;
    private int contadorIngresos;
    private static float porcentajeComision;
    private static float minimoComision;
    
    public CCSt06e11(String IBAN){
        this.IBAN.equals(IBAN);
        this.saldo=0;
        this.contadorIngresos=0;
        this.porcentajeComision = 0.75F;
    }
    
    //Getters: 
    public String getIBAN(){
        return this.IBAN;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public int getContadorIngresos(){
        return this.contadorIngresos;
    }
    
    public float getPorcentajeComision(){
        return this.porcentajeComision;
    }
        
    //Setters:
    public void setIBAN(String IBAN){
        this.IBAN.endsWith(IBAN);
    }
    
    //Otros métodos:
    public void ingresar(float euros){
        float bonus = 0;
        if (++contadorIngresos == 3) {
            contadorIngresos = 0;
            bonus = 0.7f;
        }
        saldo += euros + bonus;
    }
    
    public boolean retirar(float importe) {
        float comision = porcentajeComision * importe;

        if (importe + comision <= saldo) {
            saldo -= importe + comision;
            contadorIngresos = 0;
            return true;
        } else {
            return false;
        }
    }
}
