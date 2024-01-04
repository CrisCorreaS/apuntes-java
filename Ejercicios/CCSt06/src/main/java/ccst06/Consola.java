//Consola Cristina Correa
package ccst06;
import java.util.Scanner;
public class Consola {  
      
public Consola (){}

public static int leerEntero (String texto) {
    int valor=-1;  boolean error;
    do  {   
        error = false;
        Scanner teclado = new Scanner(System.in);
        System.out.print(texto);
        String txt = teclado.nextLine();
        txt = txt.replaceAll("\\s","");
        try {
          valor = Integer.parseInt(txt);
        }  catch( Exception e ) {System.out.println("> Valor incorrecto."); error=true;}
    }  while (error);
    return valor;
}

public static void pintarTablero (Nim tablero){
    int i,j;
    
    System.out.println ("\n-------TABLERO-----------" );
    for (i=0;i<=2;i++) {
        System.out.print ("Fila " + (i+1) + "(" + tablero.palillos[i]+"):  " );
        for (j=1;j<=tablero.palillos[i];j++)System.out.print("O ");
        System.out.print ("\n");
    }
    System.out.println ("-------------------------\n" );
}

} //fin clase
