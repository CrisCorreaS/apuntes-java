//Cristina Correa Segade
/*
Partiendo de la función del programa anterior, hacer un programa al que se le introduzcan
dos fechas del mismo año y nos informe de los días comprendidos entre ellas (no usar clases Java
de fechas)
*/
package com.mycompany.ccst05;

import java.util.Scanner;

public class CCSt05e04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe dos fechas del mismo año");
        System.out.println("Escribe el mes de la primera fecha");
        int mes1=teclado.nextInt();
        
        System.out.println("Escribe el día de la primera fecha");
        int dia1=teclado.nextInt();
        
        System.out.println("Escribe el mes de la segunda fecha");
        int mes2=teclado.nextInt();
        
        System.out.println("Escribe el día de la segunda fecha");
        int dia2=teclado.nextInt();
        
        System.out.println("Escribe el año");
        int año=teclado.nextInt();
        
        if((mes1>12||mes1<0)||(mes2>10||mes2<0)||(dia1>31||dia1<0)||(dia2>31||dia2<0)|| dia1>calcularDiasMes(año,mes1)||dia2>calcularDiasMes(año,mes2)){
            System.out.println("Has introducido una fecha incorrecta");
        }
        else{
            if(mes1>mes2&&dia1>dia2){
                System.out.println("Hay "+diasEntreFechas(mes1,dia1,mes2,dia2,año)+ " dias de diferencia");
            }
            else{
                if(mes1>mes2 && dia1>dia2){
                    System.out.println("Hay "+diasEntreFechas(mes1,dia2,mes2,dia1,año)+ " dias de diferencia");
                }
                else{
                    if(mes1<mes2&&dia1<dia2){
                        System.out.println("Hay "+diasEntreFechas(mes2,dia2,mes1,dia1,año)+ " dias de diferencia");
                   }
                    else{
                        if(mes1<mes2&&dia1>dia2){
                        System.out.println("Hay "+diasEntreFechas(mes2,dia1,mes1,dia2,año)+ " dias de diferencia");
                        }
                        else{
                            if(mes1==mes2&&dia1==dia2){
                                System.out.println("No hay ningún día de diferencia");
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static int diasEntreFechas(int mesMayor, int diaMayor, int mesMenor, int diaMenor, int año){
        int restaDias = diaMayor-diaMenor;
        int totalDias=restaDias;
        for(int i=mesMenor; i<mesMayor; i++){
            switch(i){
                case 1: totalDias+=calcularDiasMes(año,i);break;
                case 2: totalDias+=calcularDiasMes(año,i);break;
                case 3: totalDias+=calcularDiasMes(año,i);break;
                case 4: totalDias+=calcularDiasMes(año,i);break;
                case 5: totalDias+=calcularDiasMes(año,i);break;
                case 6: totalDias+=calcularDiasMes(año,i);break;
                case 7: totalDias+=calcularDiasMes(año,i);break;
                case 8: totalDias+=calcularDiasMes(año,i);break;
                case 9: totalDias+=calcularDiasMes(año,i);break;
                case 10: totalDias+=calcularDiasMes(año,i);break;
                case 11: totalDias+=calcularDiasMes(año,i);break;
                case 12: totalDias+=calcularDiasMes(año,i);break;
            }
        }
        return totalDias;
    }
    
    public static int calcularDiasMes(int año, int mes){
        if(mes>12 || mes<0){
            return 0;
        } 
        else{
            if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes== 10 || mes==12){
                return 31;
            }
            else{
                if(mes==4 || mes== 6 || mes==9 || mes==10){
                    return 30;
                }
                else{
                    if(añoBisiesto(año) && mes==2){
                        return 29;
                    }
                    else{
                        if(añoBisiesto(año)==false && mes==2){
                            return 28;
                        }
                    }
                }
            } 
        }
        return 0;
    }
    
    public static boolean añoBisiesto(int año){
        if((año%4==0 && año%100!=0)|| año % 400 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}

