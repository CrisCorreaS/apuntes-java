//Crsitina Correa Segade
/*
A partir de la clase CuentaCorriente que te proporcionará el profesor realiza las siguientes
operaciones:
• Estudia los métodos: ‘ingresar’ y ‘retirar’ y añádeles un comentario a cada método explicando
su funcionamiento (bonificaciones y comisiones).
• Crea una clase hija llamada CuentaPlazo igual que la anterior, pero sin comisiones. Además,
tiene un nuevo atributo, que es la fecha de creación.
• Esta nueva clase ya no permitirá que haya subclases de ella.
• Crea constructor para la nueva clase que incorpore la inicialización de la fecha de creación
al día en curso.
• Sobrescribe el método retirar () para que no que no calcule comisiones. Revisa los
modificadores de acceso de atributos y quizás tengas que crear algún getter/setter.
• Haz un programa que cree inicialmente una cuenta a plazo y luego, mediante un menú,
permita ingresar, retirar y consultar el saldo.
 */

package com.mycompany.ccst08;

import java.util.Scanner;

public class CCSt08e09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CuentaPlazo cc = new CuentaPlazo("ES34123412341258");

        boolean salir = false;
        int opcion, i = 0;
        boolean ok;
        float pc = 0.02F;
        float mc = 0.01F;
        CuentaCorriente.setComision(pc, mc);
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Elegiste opción 1");
                    System.out.print("Introduce el importe a ingresar: ");
                    float ing = teclado.nextFloat();
                    cc.ingresar(ing);
                    i++;
                    if (i == 3) {
                        cc.ingresar(0.7F);
                    }
                 }
                case 2 -> {
                    System.out.println("Elegiste opción 2");
                    System.out.print("Introduce el importe a retirar: ");
                    float ret = teclado.nextFloat();
                    ok = cc.retirar(ret);
                    if (!ok) {
                        System.out.print("El importe a retirar es mayor que el saldo disponible");
                    }
                    i = 0;
                 }
                case 3 -> {
                    System.out.println("Elegiste opción 3");
                    System.out.println("El saldo actual es: " + cc.getSaldo());
                 }
                case 0 -> salir = true;
                default -> System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elije una opción:");
        System.out.println("1 Ingresar");
        System.out.println("2 Retirar");
        System.out.println("3 Consultar saldo");
        System.out.println("0 Salir del programa");
        try {
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }
}
