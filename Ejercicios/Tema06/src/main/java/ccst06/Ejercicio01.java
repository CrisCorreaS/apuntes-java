//Cristina Correa Segade
/*
6.1. A partir de la clase MovilPrepago que te proporcionará el profesor, haz un programa en el que
se cree un teléfono con unas características determinadas y luego ejecute una serie de actividades
como recargar 10 euros, llamar 30 segundos, navegar 10MB, etc. Viendo cómo se va modificando el
saldo.
Las propiedades de un móvil prepago son:
- int numeroMovil (13 dígitos)
- float costeEstablecLlamada (euros, con dos decimales)
- float costeMinutoLlamada (euros, con dos decimales)
- float costeConsumoMB (euros, con dos decimales)
- float saldo (euros, con dos decimales)
Los métodos son:
- void efectuarLlamada (int segundos): reduce el saldo. Si el saldo no es suficiente, se corta la llamada
- void navegar(int MB) análogo a efectuar una llamada
- boolean recargar (int importe): aumenta el saldo, debe ser múltiplo de 5 euros, sino devuelve false
- float consultarSaldo ()

Lo primero de debemos hacer es crear una instancia de un móvil (con el constructor) con 
unos valores cualesquiera, por ejemplo: 
MovilPrepago miMovil = new MovilPrepago(900900900L, 0.1f, 0.5f, 10f); 
y después llamar a los métodos y mostrar por pantalla el atributo saldo del móvil.  
 */
package ccst06;

public class Ejercicio01 {

    public static void main(String[] args) {
        //Creación del objeto teléfono a partir de la clase MovilPrepago (Con el primer constructor)
        MovilPrepago telefono = new MovilPrepago(34698713662654L, 0.25F, 0.05F, 0.50F, 50F);
        System.out.println("El saldo actual es de " + telefono.consultarSaldo());

        //Recargar 10€
        System.out.println("Recargamos 10€");
        telefono.recargar(10);
        System.out.println("El saldo actual es de " + telefono.consultarSaldo());

        //Efectuar llamada de 30s
        System.out.println("Efectuamos una llamada de 30s");
        telefono.efectuarLlamada(30);
        System.out.println("El saldo actual es de " + telefono.consultarSaldo());

        //Navegar 10MB
        System.out.println("Navegamos consumiendo 10MB");
        telefono.navegar(10);
        System.out.println("El saldo actual es de " + telefono.consultarSaldo());

    }
}
