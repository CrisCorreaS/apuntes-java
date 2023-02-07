package com.mycompany.ccst03;
//Cristina Correa Segade
/*DiseÃ±ar un algoritmo al que se le introduzcan las notas de un alumno en los nueve mÃ³dulos
de un ciclo y nos informe si puede ir a la FCT (todos aprobados). Â¿HabrÃ­a que solicitarle al usuario
siempre las notas de los nueve mÃ³dulos?
*/
import java.util.Scanner;

    public class CCSt03e17 {
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
               int cont;
               float nota;
               boolean irFCT = true;
               
               
               for (cont=0; cont<=8; cont++) {
                    System.out.println("Introduce las notas de todos los módulos de un alumno");
                    System.out.println("Si un módulo está¡ suspenso no podrá¡ ir al FCT");
                    nota=teclado.nextFloat();
                   if (nota>=5 && nota<=10) {
                       System.out.println("¡Has aprobado esta asignatura!");
                    }
                   else {
                       if (nota<5) {
                           System.out.println("Has suspendido esta asignatura");
                           irFCT = false;
                       }
                       else {
                           System.out.println("Esta nota no es una nota válida");
                        }
                    }
                }
               if (irFCT) {
                   System.out.println("¡Puedes ir al FCT!");
               }
               else {
                   System.out.println("Lo siento pero no puedes ir al FCT");
               }
    }
}