//Crsitina Correa Segade
/*
A partir de la clase MovilPrepago que te proporcionará el profesor realiza las siguientes
operaciones:
• Crea una subclase llamada MovilPlus igual que la anterior pero que al efectuar llamadas no
se le aplica ningún coste por el establecimiento de llamada y tiene una nueva funcionalidad
llamada videollamada a la que se le pasa los segundos de la videollamada y reduce el saldo
de forma similar a ‘navegar’. En este caso, cada segundo de llamada son 2 MB de datos
(recuerda que los atributos de MovilPrepago son privados, esto puede ser un problema a
resolver).
• Crea constructor para la nueva clase, que llame al constructor de la clase padre.
• Sobrescribe el método toString () en la superclase para que muestre el número y el saldo del
móvil.
• Añade una nueva subclase de MovilPrepago llamada MovilTarifaPlana ̧ en la que se redefine
el método navegar para no reducir el saldo y además en el constructor fija el coste de
navegación a cero.
• Haz un programa que cree una instancia de MovilPrepago, otra de MovilPlus y otra de
MovilTarifaPlana, y realicen diversas operaciones sobre los mismos: llamar, navegar,
videollamar, etc. mostrando como se reduce su saldo con el nuevo método toString ().
 */

package com.mycompany.ccst08;

import java.util.Scanner;

public class CCSt08e10 {

    public static void main(String[] args) {
        MovilPrepago telefonoA = new MovilPrepago(34550880600L, 0.20F, 0.01F, 0.15F, 5F);
        MovilPlus telefonoB = new MovilPlus(3466605670L, 0.20f, 0.01f, 0.15f, 10f);
        MovilTarifaPlana telefonoC = new MovilTarifaPlana(38943624332L, 0.20f, 0.01f, 15f);

        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Elegiste la opción 1");
                    System.out.println("Movil Prepago: " + telefonoA);
                    System.out.println("Movil Plus: " + telefonoB);
                    System.out.println("Movil Tarifa Plana: " + telefonoC);
                }
                case 2 -> {
                    System.out.println("Elegiste la opción 2");
                    System.out.print("Introduce el importe a recargar: ");
                    int num = teclado.nextInt();
                    System.out.print("Movil Prepago: ");
                    telefonoA.recargar(num);
                    System.out.print("Movil Plus: ");
                    telefonoB.recargar(num);
                    System.out.print("Movil Tarifa Plana: ");
                    telefonoC.recargar(num);
                }
                case 3 -> {
                    System.out.println("Elegiste la opción 3");
                    System.out.print("Introduce los segundos de la llamada: ");
                    int seg = teclado.nextInt();
                    telefonoA.efectuarLlamada(seg);
                }
                case 4 -> {
                    System.out.println("Elegiste la opción 4");
                    System.out.print("Introduce los MB usados: ");
                    int mb = teclado.nextInt();
                    telefonoA.navegar(mb);
                    telefonoB.navegar(mb);
                    telefonoC.navegar(mb);
                }
                case 5 -> {
                    System.out.println("Elegiste la opción 5");
                    System.out.print("Introduce los segundos de la videollamada: ");
                    int sg = teclado.nextInt();
                    telefonoB.videollamada(sg);
                    telefonoC.navegar(sg);
                }
                case 0 ->
                    salir = true;
                default ->
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una opción:");
        System.out.println("1 Consultar saldo");
        System.out.println("2 Recargar saldo");
        System.out.println("3 Hacer llamada");
        System.out.println("4 Navegar");
        System.out.println("5 Hacer videollamada");
        System.out.println("0 Salir del programa");
        try {                  
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }
}
