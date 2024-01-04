//Cristina Correa Segade
/*
Haz un programa como el anterior, pero creando dos cuentas en vez de una. Habrá una
opción de menú nueva que será “Cambiar cuenta activa” para pasar de una cuenta a otra.
Tendremos una variable de tipo CuentaCorriente que le puedes llamar cuentaActiva que unas veces
apuntará a una cuenta y otras veces a la otra
Recuerda que las variables de tipo Objeto, a diferencia de los tipos primitivos, son apuntadores a los
objetos, si tenemos los objetos ‘cuenta1’ y ‘cuenta2’ creados con su constructor, podemos hacer
luego una tercera variable ‘cuentaActiva’ sin constructor y hacer ‘cuentaActiva=cuenta1’ o bien
‘cuentaActiva=cuenta2’ cuando nos interese.
*/

package ccst06;

import java.util.Scanner;


public class CCSt06e04 {
    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        
        //Creación de ambas cuentas
        CuentaCorriente cuenta1 = new CuentaCorriente("ES5489568168731785612783");
        CuentaCorriente cuenta2= new CuentaCorriente("ES5492165582493333274895");
        
        //Creación de la variable cuentaActiva que apunta ahora a cuenta1
        CuentaCorriente cuentaActiva = cuenta1;
        
         //Inicialización de las variables:
        boolean salir = false;
        int opcion, cont=0;
        
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
                    System.out.println("Su saldo actual es de "+cuentaActiva.getSaldo());
                }
                
                case 2 -> {
                    System.out.println("Ha elegido la opción 2");
                    System.out.println("Introduzca el importe que quiera ingresar");
                    float importe = teclado.nextFloat();
                    cuentaActiva.ingresar(importe);
                    cont++;
                    if(cont==3){
                        cont=0;
                        cuentaActiva.ingresar(0.7F);
                    }
                }
                
                case 3 -> {
                    System.out.println("Ha elegido la opción 3");
                    System.out.println("Introduzca la cantidad que quiera retirar");
                    float cantidad = teclado.nextFloat();
                    cuentaActiva.setComision(0.05F,0.02F);
                    if(cuentaActiva.getSaldo()< cantidad){
                        System.out.println("No se puede retirar esa cantidad porque es mayor que su saldo actual");
                    }
                    else{
                        cuentaActiva.retirar(cantidad);
                    }
                    cont=0;
                }
                
                case 4->{
                    System.out.println("Ha elegido la opción 4");
                    System.out.println("Introduce la cuenta que quiera utilizar, si es su primera vez, recuerde que está en cuenta1");
                    int numero = teclado.nextInt();
                    switch(numero){
                        case 1 -> {
                            System.out.println("Usted está en la cuenta1 y va a cambiar a la cuenta2");
                            cuentaActiva=cuenta2;
                        }
                            
                        case 2 -> {
                            System.out.println("Usted está en la cuenta2 y va a cambiar a la cuenta1");
                            cuentaActiva=cuenta1;
                        }
                            
                        default -> System.out.println("La opción que ha marcado no se encuentra disponible");
                        }
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
        System.out.println("OPCIÓN 4 - Cambiar cuenta activa");
        System.out.println("OPCIÓN 0 - Salir");
        try{
            return Integer.parseInt(teclado.nextLine());
        }catch(NumberFormatException e){
            return 999;
        }
    }
}
