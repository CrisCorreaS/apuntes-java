//Ahorcado Cristina Correa
package ccst06;
import java.util.Scanner;

public class Ahorcado {
    private final String fraseAdivinar;
    private final String pista;
    private final int MAX_ERRORS;
    private int intentos;
    private StringBuilder fraseActual;
   
public Ahorcado (String f, String  p ){
      fraseAdivinar=f;
      pista=p; 
      MAX_ERRORS = 10;
      intentos = 0;
      
      fraseActual = new StringBuilder (f);
      for (int i=0; i< fraseActual.length(); i++){
           if (fraseActual.charAt(i)!=' ') fraseActual.setCharAt(i, '.');
      }
      
}

public Ahorcado (String f ){
       this (f, "");    
}

public boolean probarLetra (char p){
       String temp;
                  
       if (fraseAdivinar.indexOf(p)==-1){
           intentos ++;
           return false;
       }
       else {
           for (int i=0;i<fraseAdivinar.length();i++) {
                 if (fraseAdivinar.charAt(i)== p) 
                    fraseActual.setCharAt(i,p);     
           }
           return true;
       }
}
       
public boolean adivinada (){
    if (fraseAdivinar.equals(fraseActual.toString())) 
         return true;
     else
         return false;        
}

public boolean perdio () {
    if (intentos ==MAX_ERRORS) return true; else return false;
}

public char leerLetra () {
    System.out.println ("Introduce letra:");
    String entradaTeclado; char letraEntrada;
    Scanner entradaEscaner = new Scanner (System.in);
    entradaTeclado = entradaEscaner.nextLine ();
    return entradaTeclado.charAt(0);
}

public void pintar (){
System.out.print("\n----------------------------------------------------\n");
System.out.println("Estado actual:" + fraseActual);
System.out.println("Pista        :" + pista);
System.out.println("Llevas " + intentos + " fallos  de " + MAX_ERRORS);
switch (intentos) {
    case 10: 
        System.out.println(".-----.");
        System.out.println(".|...|.");
        System.out.println(".O...|.");
        System.out.println("-|-..|.");
        System.out.println("/.\\..|.");
        System.out.println(".....|.");
        System.out.println("-------");
        break;
    case 9: 
        System.out.println(".-----.");
        System.out.println(".|...|.");
        System.out.println(".O...|.");
        System.out.println("-|-..|.");
        System.out.println("/....|.");
        System.out.println(".....|.");
        System.out.println("-------");
        break;
    case 8: 
        System.out.println(".-----.");
        System.out.println(".|...|.");
        System.out.println(".O...|.");
        System.out.println("-|-..|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println("-------");
		break;    
    case 7: 
        System.out.println(".-----.");
        System.out.println(".|...|.");
        System.out.println(".O...|.");
        System.out.println("-|...|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println("-------");
       break;
    case 6: 
        System.out.println(".-----.");
        System.out.println(".|...|.");
        System.out.println(".O...|.");
        System.out.println(".|...|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println("-------");        
        break;
    case 5: 
        System.out.println(".-----.");
        System.out.println(".|...|.");
        System.out.println(".O...|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println("-------");              
        break;
    case 4: 
        System.out.println(".-----.");
        System.out.println(".|...|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println("-------");        
        break;
    case 3: 
        System.out.println(".-----.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println("-------");        
        break;
    case 2: 
        System.out.println(".......");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println(".....|.");
        System.out.println("-------");        
        break;
    case 1: 
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println("-------");        
        break;
    case 0: 
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");        
        break;
   }
} //pintar

} //fin clase

