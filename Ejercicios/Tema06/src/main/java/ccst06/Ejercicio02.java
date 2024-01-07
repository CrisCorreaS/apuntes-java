//Cristina Correa Segade
/*
6.2. A partir de la clase MovilPrepago del ejercicio anterior, crea un programa en el que el usuario
dé de alta un teléfono con unas características determinadas y luego le permita mediante un menú
hacer operaciones como consultar saldo, recarga, hacer llamada, navegar. Se proporciona un
modelo (modeloMenu) a modo de esqueleto, con el menú y las funciones necesarias, en las que solo
tienes rellenar los huecos.

Es similar al anterior, primero creamos un móvil: 
MovilPrepago miMovil = new MovilPrepago(900900900L, 0.1f, 0.5f, 10f); 
O pidiéndole los datos al usuario. Luego ya el menú sobre ese móvil. 
 */
package ccst06;

//import static ccst06._modeloMenu.teclado;
import java.util.Scanner;

public class Ejercicio02 {

    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);

        //Creación dle teléfono
        MovilPrepago telefono = new MovilPrepago(655625375968345L, 0.25F, 0.05F, 0.5F, 20F);

        //Inicialización de variables
        int opcion;
        boolean salir = false;

        //Bucle do while
        do {
            opcion = Menu();
            
            switch (opcion) {
                case 0 -> {
                    System.out.println("Ha elegido la opción 0");
                    salir = true;
                }
                
                case 1 -> {
                    System.out.println("Ha elegido la opción 1");
                    System.out.println("El saldo actual es de " + telefono.consultarSaldo());
                }

                case 2 -> {
                    System.out.println("Ha elegido la opción 2");
                    System.out.println("Introduzca el importe que quiera recargar");
                    int importe = teclado.nextInt();
                    
                    if (telefono.recargar(importe)) {
                        System.out.println("La recarga ha sido completada con éxito");
                    } else {
                        System.out.println("La recarga solo puede ser de múltiplos de 5");
                    }
                }

                case 3 -> {
                    System.out.println("Ha elegido la opción 3");
                    
                    if (telefono.consultarSaldo() <= 0) {
                        System.out.println("No se puede efectuar una llamada porque no dispone de saldo");
                    } else {
                        System.out.println("Introduzca los segundos de la llamada a efectuar");
                        int segundos = teclado.nextInt();
                        
                        telefono.efectuarLlamada(segundos);
                    }
                }

                case 4 -> {
                    System.out.println("Ha elegido la opción 4");
                    
                    if (telefono.consultarSaldo() <= 0) {
                        System.out.println("No se puede navegar porque no dispone de saldo");
                    } else {
                        System.out.println("Introduzca los mb con los que desee navegar");
                        int mb = teclado.nextInt();
                        
                        telefono.navegar(mb);
                    }
                }

                default ->
                    System.out.println("Has introducido una opción errónea");
            }
        } while (!salir);

    }

    private static int Menu() {
        System.out.println("Bienvenida al menú de opciones");
        System.out.println("Elija una de las siguientes opciones");
        System.out.println("OPCIÓN 1 - Consultar saldo");
        System.out.println("OPCIÓN 2 - Recargar saldo");
        System.out.println("OPCIÓN 3 - Hacer llamada");
        System.out.println("OPCIÓN 4 - Navegar");
        System.out.println("OPCIÓN 0 - Salir");
        try {
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }

}
