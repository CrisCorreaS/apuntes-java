package com.mycompany.ccst02;
//Cristina Correa Segade

import java.util.Scanner;

    public class CCSt02e11simple {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                //Empezamos calculando las variables
                
                int dia, mes, year, diasmes;
                 System.out.println("Introduce el día: ");
                 dia = teclado.nextInt();
                 
                 System.out.println("Introduce el mes: ");
                 mes = teclado.nextInt();
                 
                 System.out.println("Introduce el año: ");
                 year = teclado.nextInt();
                
                boolean bisiesto;
                bisiesto = year%4==0 && year%100!=0 || year%400==0;
                 
                
                //Empezamos calculando los días del mes de cada uno
                
                if (bisiesto==true && mes==2) {
                    diasmes=29;
                }
                else {
                    if (bisiesto==false && mes==2) {
                        diasmes=28;
                    }
                    else {
                        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
                            diasmes=31;
                        }
                        else {
                            diasmes=30;
                        }
                    }
                }
                
                //Ahora calculamos el día siguiente
                if (dia>31 || dia<=0 || mes>12 || mes<=0) {
                    System.out.println("La fecha no es correcta");
                }
                else {
                    if (dia<=29 && mes!=2 ||
                        dia<=30 && diasmes==31 ||
                        dia<=28 && diasmes==29 ||
                        dia<=27 && diasmes==28) {
                        int tomorrow;
                        tomorrow=dia+1;
                        System.out.println("Mañana será " + tomorrow + " del " + mes + " del " + year);
                    }
                    else {
                        if (dia==30 && diasmes==30 ||
                            dia==31 && diasmes==31 && mes!=12 ||
                            dia==28 && diasmes==28 ||
                            dia==29 && diasmes==29) {
                            int nextmonth;
                            nextmonth=mes+1;
                            System.out.println("Mañana será 1 del " + nextmonth + " del " + year);
                        }
                        else {
                            if (dia==31 && mes==12) {
                                int nextyear;
                                nextyear=year+1;
                                System.out.println("Mañana será 1 del 1 del " + nextyear);
                            }
                        }
                    }
                }
       }
}