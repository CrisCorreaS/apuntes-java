package com.mycompany.ccst02;
//Cristina Correa Segade

import java.util.Scanner;

    public class CCSt02e11 {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int dia, mes, year;
                 System.out.println("Introduce el día: ");
                 dia = teclado.nextInt();
                 
                 System.out.println("Introduce el mes: ");
                 mes = teclado.nextInt();
                 
                 System.out.println("Introduce el año: ");
                 year = teclado.nextInt();
                
                if (dia>31 || mes>12 || mes<=0) {
                    System.out.println("La fecha no es correcta");
                }
                      
                else {
                    if (dia<=31 && (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10)) {
                        if (dia<31) {
                            int tomorrow1;
                            tomorrow1 = dia+1;
                            System.out.println("Mañana va a ser " + tomorrow1 + " del " + mes + " del " + year);
                        }
                        else {
                            int messig1;
                            messig1=mes+1;
                            System.out.println("Mañana va a ser " + 1 + " del " + messig1 + " del " + year);
                        }
                    }
                    else {
                        if (dia<=30 && (mes==4 || mes==6 || mes==9 || mes==11)) {
                            if (dia<30) {
                                int tomorrow2;
                                tomorrow2 = dia+1;
                                System.out.println("Mañana va a ser" + tomorrow2 + " del " + mes + " del " + year);
                            }
                            else {
                                int messig2;
                                messig2=mes+1;
                                System.out.println("Mañana va a ser " + 1 + " del " + messig2 + " del " + year);
                            }
                        }
                        
                        else {
                            if (year%4==0 && year%100!=0 || year%400==0 && dia<=29 && mes==2) {
                                if (dia<29) {
                                    int tomorrow3;
                                    tomorrow3= dia+1;
                                    System.out.println("Mañana va a ser " + tomorrow3 + " del " + mes + " del " + year);
                                }
                                else{
                                    int messig3;
                                    messig3=mes+1;
                                    System.out.println("Mañana va a ser " + 1 + " del " + messig3 + " del " + year);
                                }
                            }
                            
                            else {
                                if (year%4!=0 && dia<=28 && mes==2) {
                                  if (dia<28) {
                                    int tomorrow4;
                                    tomorrow4= dia+1;
                                    System.out.println("Mañana va a ser " + tomorrow4 + " del " + mes + " del " + year);
                                    }
                                    else{
                                        int messig4;
                                        messig4=mes+1;
                                        System.out.println("Mañana va a ser " + 1 + " del " + messig4 + " del " + year);
                                    }  
                                }
                                
                                else {
                                    if (dia<=31 && mes==12) {
                                        if (dia<31) {
                                            int tomorrow5;
                                            tomorrow5=dia+1;
                                            System.out.println("Mañana va a ser " + tomorrow5 + " del " + mes + " del " +year);
                                        }
                                        else {
                                            int nextyear;
                                            nextyear=year+1;
                                            System.out.println("Mañana va a ser 1 del 1 del " + nextyear);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
       }
}