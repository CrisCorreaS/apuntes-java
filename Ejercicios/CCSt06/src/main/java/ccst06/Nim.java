//Nim Cristina Correa
package ccst06;

import java.util.Random;

public class Nim {
    public int [] palillos = {3,5,7};
    
public Nim (){}

public boolean juega (int fila, int cantidad){
    if (fila <0 || fila > 2) return false; 
    if (palillos[fila]< cantidad)  return false;
    palillos[fila]-=cantidad;
    return true;
}

public boolean fin (){
    if (palillos[0]+palillos[1]+palillos[2] <= 1) return true; 
    return false;
}

public int piensa () {
    int MENOR; int MAYOR; int MEDIO;
    
    try {Thread.sleep(3000);} catch (InterruptedException e) {}
    //ordenar
    if (palillos[0] > palillos [1] && palillos[0] > palillos [2]){
       MAYOR = 0;  if (palillos[1] > palillos [2]) {MEDIO= 1; MENOR = 2; }
                   else {MEDIO= 2; MENOR = 1;}
    }
    else {
       if (palillos[1] > palillos [2]) {
           MAYOR = 1; if (palillos[0] > palillos [2]) { MEDIO= 0; MENOR = 2;}
                      else  { MEDIO= 2; MENOR = 0;} 
       }
       else {
           MAYOR = 2; if (palillos[0] > palillos [1]) { MEDIO= 0; MENOR = 1;}
                      else  { MEDIO= 1; MENOR = 0;} 
       }
    }
    //elegir la combinacion correcta
    if (palillos[MENOR] == 0 && palillos[MEDIO]==0) 
       { /*REDUCIR A UNO EL TERCERO Y FIN*/ return MAYOR*10+palillos[MAYOR]-1;}
    if (palillos[MENOR] == 0 && palillos[MEDIO] == 1 && palillos[MAYOR] > 1)
       { /*REDUCIR A 0 1 0 y gano*/ return MAYOR*10+palillos[MAYOR];}
    if (palillos[MENOR] == 0 && palillos[MEDIO] < palillos[MAYOR]) 
       { /*IGUALAR TERCERO A SEGUNDO*/ return MAYOR*10 +(palillos[MAYOR]-palillos[MEDIO]);}
    if (palillos[MENOR] == 1 && palillos[MEDIO] == 1 && palillos[MAYOR] > 1)
       { /*REDUCIR A 1 1 1*/ return MAYOR*10+palillos[MAYOR]-1;}
    if (palillos[MENOR] == palillos[MEDIO])
       { /*REDUCIR A CERO EL TERCERO*/ return MAYOR*10+palillos[MAYOR];}
    if (palillos[MAYOR] == palillos[MEDIO] && palillos[MENOR]!=0) 
       { /*REDUCIR A CERO EL PRIMERO*/ return MENOR*10+palillos[MENOR];}
        
    if (palillos[MENOR] == 1 && palillos[MEDIO] == 2 && palillos[MAYOR] > 3 ) 
       { /*IGUALAR TERCERO A 3*/ return MAYOR*10+palillos[MAYOR]-3;}
    if (palillos[MENOR] == 1 && palillos[MEDIO] == 3 ) 
       { /*DEJAR TERCERO A 2*/ return MAYOR*10+palillos[MAYOR]-2;}
    if (palillos[MENOR] == 1 && palillos[MEDIO] == 4 && palillos[MAYOR] > 5 ) 
       { /*IGUALAR TERCERO A 5*/ return MAYOR*10+palillos[MAYOR]-5;}
    if (palillos[MENOR] == 1 && palillos[MEDIO] == 5 && palillos[MAYOR] > 4 ) 
       { /*IGUALAR TERCERO A 5*/ return MAYOR*10+palillos[MAYOR]-4;}
    if (palillos[MENOR] == 2 && palillos[MEDIO] == 3 ) 
       { /*IGUALAR TERCERO A 1*/ return MAYOR*10+palillos[MAYOR]-1;}
    if (palillos[MENOR] == 2 && palillos[MEDIO] == 4 && palillos[MAYOR] == 5 ) 
       { /*IGUALAR PRIMERO A 1*/ return MENOR*10+palillos[MENOR]-1;}
    if (palillos[MENOR] == 2 && palillos[MEDIO] == 5 && palillos[MAYOR] == 6 ) 
       { /*IGUALAR SEGUNDO A 4*/ return MEDIO*10+palillos[MEDIO]-4;}
    if (palillos[MENOR] == 3 && palillos[MEDIO] == 4 && palillos[MAYOR] == 5 ) 
       { /*IGUALAR PRIMERO A 1*/ return MENOR*10+palillos[MENOR]-1;}
    if (palillos[MENOR] == 3 && palillos[MEDIO] == 4 && palillos[MAYOR] == 6 ) 
       { /*IGUALAR PRIMERO A 2*/ return MENOR*10+palillos[MENOR]-2;}
    if (palillos[MENOR] == 3 && palillos[MEDIO] == 5 && palillos[MAYOR] == 7 ) 
       { /*QUITAR UNO AL AZAR */ 
           Random r = new Random();
           int pos = r.nextInt(3);
           return pos*10+1;}
    /*resto de posibilidades: quitar uno del mayor.*/
    return MAYOR*10+1;
}
} //fin clase
