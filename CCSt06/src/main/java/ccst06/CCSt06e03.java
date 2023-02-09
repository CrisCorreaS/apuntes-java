//Cristina Correa Segade
/*
A partir de la clase CuentaCorriente que te proporcionará el profesor, crea un programa en el
que se creen una cuenta corriente (siempre se crean con saldo inicial cero) y mediante un menú le
permita al usuario hacer operaciones como ingresar, retirar y consultar saldo en la cuenta. El único
atributo público de la cuenta es el IBAN (String de 24 dígitos/letras). Otros atributos privados son saldo,
contadorIngresos, porcentajeComision y minimoComision, pero como son privados, no tenemos acceso a
ellos. Los métodos son:
- constructor (String Iban): se le pasa el nombre de la cuenta y fija saldo inicial a cero.
- void ingresar (float importe): aumenta el saldo. Si se hacen 3 ingresos consecutivos, sin ninguna
retirada en medio, se regala 0,7 euros al usuario.
- boolean retirar (float importe): reduce el saldo si es posible, no puede quedar negativo (devuelve si se
ha efectuado la retirada o no). Cada retirada tiene una comisión asociada.
- float getSaldo (): devuelve el saldo actual en la cuenta.
- setComision (float porcentaje, float impMinimo). Fija la comisión de retirada, para todas las cuentas.
- getPorcentajeComision() devuelve un float con el porcentaje de comisión a aplicar en retiradas.
- getMinimoComision() devuelve un float con el importe mínimo de comisión a aplicar en retiradas.
*/

package ccst06;


import java.util.Scanner;


public class CCSt06e03 {
    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        //Creación de la cuenta
        CuentaCorriente cuenta = new CuentaCorriente("9AP565456BNK41346560255B");
        
        //Inicialización de las variables:
        boolean salir = false;
        int opcion, cont=0;
        cuenta.setComision(0.05F,0.02F);
        
        //Bucle do while
        do{
            opcion=Menu();
            switch(opcion){
                case 0 -> { 
                    System.out.println("Ha elegido la opción 0");
                    salir=true;
                }
                
                case 1 -> {
                    System.out.println("Ha elegido la opción 1");
                    System.out.println("Su saldo actual es de "+cuenta.getSaldo());
                }
                
                case 2 -> {
                    System.out.println("Ha elegido la opción 2");
                    System.out.println("Introduzca el importe que quiera ingresar");
                    float importe = teclado.nextFloat();
                    cuenta.ingresar(importe);
                    cont++;
                    if(cont==3){
                        cont=0;
                        cuenta.ingresar(0.7F);
                    }
                }
                
                case 3 -> {
                    System.out.println("Ha elegido la opción 3");
                    System.out.println("Introduzca la cantidad que quiera retirar");
                    float cantidad = teclado.nextFloat();
                    if(cuenta.getSaldo()< cantidad){
                        System.out.println("No se puede retirar esa cantidad porque es mayor que su saldo actual");
                    }
                    else{
                        cuenta.retirar(cantidad);
                    }
                    cont=0;
                }
                
                default -> System.out.println("La opción que ha marcado es incorrecta");
            }
        
        }while(!salir);
        
    }
    
    private static int Menu(){
        System.out.println("Bienvenida al menú de opciones");
        System.out.println("Elija una de las siguientes opciones");
        System.out.println("OPCIÓN 1 - Consultar saldo");
        System.out.println("OPCIÓN 2 - Ingresar");
        System.out.println("OPCIÓN 3 - Retirar");
        System.out.println("OPCIÓN 0 - Salir");
        try{
            return Integer.parseInt(teclado.nextLine());
        }catch(NumberFormatException e){
            return 999;
        }
    }
}
