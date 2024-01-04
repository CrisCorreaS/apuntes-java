//Circulo Cristina Correa
package ccst06;

public class Circulo {

    private static int radio;
    public double calcularCircunferencia;
    public double calcularSuperficie;
    public int calcularDiametro;

   

    public static int getRadio() {
        return radio;
    }

    public static void setRadio(int rad) {
        radio = rad;
    }

    public double calcularCircunferencia() {
        double circunferencia = Math.PI * radio * 2;
        return circunferencia;
    }

    public double calcularSuperficie() {

        double superficie = Math.PI * Math.pow(radio, 2);
        return superficie;
    }

    public int calcularDiametro() {

        int diametro = 2 * radio;
        return diametro;
    }
}
