/*Cristina Correa Segade
Realizar un programa que solicite la entrada de una cadena de 6 posiciones, que 
todas sean dígitos y sin repetidos. Si no cumple esas condiciones, el usuario 
deberá introducirla de nuevo hasta que lo haga correctamente.
 */
import java.util.Scanner; 

public class CCSt04e12 { 

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in); 

        String cadena;
        int totalPosiciones=6, contadorPosiciones=0, contadorNoRepeticion=0, contadorComparacion=0; 
        boolean posiciones = false;
        boolean noRepeticion = false;
        
        System.out.println("Intoduce una cadena de 6 posiciones que todas sean dígitos sin repetidos");
        cadena = teclado.nextLine();
        
        //Uso el do while para que por lo menos el bucle se ejecute una vez
        
        do{
            for(int cont=0; cont<cadena.length(); cont++){
                if(Character.isDigit(cadena.charAt(cont))){
                    contadorPosiciones++;
                }
            }
            
            for(int i=0; i<cadena.length()-1; i++){
                for(int j=i+1; j<cadena.length(); j++){
                    if(cadena.charAt(i)!= cadena.charAt(j)){
                       contadorNoRepeticion++; 
                    }
                    contadorComparacion++;
                }
            }
            
            if(contadorNoRepeticion == contadorComparacion){
                noRepeticion = true;
            }
            
            if(contadorPosiciones == totalPosiciones){
                posiciones = true;
            }
            
            if(noRepeticion==false || posiciones==false){
                contadorPosiciones = 0;
                posiciones = false;
                contadorNoRepeticion = 0;
                noRepeticion = false;
                contadorComparacion = 0;
                
                System.out.println("No has introducido una cadena que cumple las condiciones. Introduce otra, por favor");
                cadena = teclado.nextLine();
            }
            else {
                if(noRepeticion && posiciones){
                    System.out.println("La cadena que has introducido cumple las condiciones");
                }
            }
            
        }while(noRepeticion==false || posiciones==false);
    }
}