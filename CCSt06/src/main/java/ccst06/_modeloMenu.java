//Modelo Menú Cristina Correa
package ccst06;

import java.util.Scanner;

public class _modeloMenu {
    
    static Scanner teclado;
    
    public static void main(String[] args) {
        
        teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do {
           opcion=pintarMenu ();
           switch (opcion) {
               case 1: System.out.println("\tElegiste opción 1"); break;
               case 2: System.out.println("\tElegiste opción 2"); break;
               case 3: System.out.println("\tElegiste opción 3"); break;   
               case 4: System.out.println("\tElegiste opción 4"); break;    
               case 0: salir=true; break;    
               default: System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }  // fin main    
    
   private static int pintarMenu (){
      System.out.println("\n\n\n");  
      System.out.println("Elija una opción:");  
      System.out.println("1 Opción 1");  
      System.out.println("2 Opción 2");  
      System.out.println("3 Opción 3");  
      System.out.println("4 Opción 4");  
      System.out.println("0 Salir del programa");  
      try {                  //si introduce un valor no entero haría return 999
        return Integer.parseInt (teclado.nextLine());
      } catch (Exception e ) {return 999;}
   }

    
}
