//Cristina
/**
Realiza un programa que tenga un ArrayList llamado alturaAlumnos que mantenga una lista
con las alturas de los alumnos de un centro. Serán valores positivos entre 0,50 y 2,50 redondeados
a dos decimales. El programa tendrá las siguientes funciones (accesibles mediante un menú):
a. Añadir altura.
b. Mostrar lista actual con el número de posición
c. Eliminar por posición. Se le pasa como parámetro una posición y elimina la altura en dicha
posición.
d. Eliminar por valor. Se le pasa como parámetro una altura y elimina todas las posiciones
en las que se encuentre dicha altura. Devuelve la cantidad de eliminaciones.
e. Ordenar la lista.
f. Vaciar la lista.
 */
package com.mycompany.ccst07b;

import java.util.ArrayList;
import java.util.Scanner;


public class CCSt07be15 {

    public static void main(String[] args) {
        ArrayList<Float> alturaAlumnos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        
        while (!salir) {
            int opcion = pintarMenu();
            
            switch (opcion) {
                case 1 -> {
                    System.out.println("Añade la altura: ");
                    float altura = teclado.nextFloat();
                    if (validarAltura(altura)) {
                        alturaAlumnos.add(altura);
                        System.out.println("Altura añadida correctamente");
                    } else {
                        System.out.println("Altura inválida. Debe estar entre 0,50 y 2,50");
                    }
                }
                
                case 2 -> {
                    System.out.println("La lista actual es: ");
                    for (int i = 0; i < alturaAlumnos.size(); i++) {
                        System.out.println("La altura del alumno con posición " + i + " es: " + alturaAlumnos.get(i));
                    }
                }
                
                case 3 -> {
                    System.out.print("Introduce la posición a eliminar: ");
                    int pos = teclado.nextInt();
                    if (pos >= 0 && pos < alturaAlumnos.size()) {
                        alturaAlumnos.remove(pos);
                        System.out.println("Altura eliminada correctamente");
                    } else {
                        System.out.println("Posición no encontrada");
                    }
                }
                
                case 4 -> {
                    System.out.print("Introduce el valor a eliminar: ");
                    float valor = teclado.nextFloat();
                    int eliminaciones = eliminarPorValor(alturaAlumnos, valor);
                    System.out.println(eliminaciones + " la altura ha sido eliminada correctamente");
                }
                
                case 5 -> {
                    ordenarLista(alturaAlumnos);
                    System.out.println("La lista ha sido ordenada");
                }
                
                case 6 -> {
                    vaciarLista(alturaAlumnos);
                    System.out.println("La lista ha sido vaciada");
                }
                
                case 0 -> salir = true;
                
                default -> System.out.println("Opción incorrecta");
            }
            
        }
        
        teclado.close();
    }

    private static int pintarMenu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("BIENVENIDO");
        System.out.println("Elija una opción:");
        System.out.println("1 Añadir altura");
        System.out.println("2 Mostrar lista actual");
        System.out.println("3 Eliminar por posición");
        System.out.println("4 Eliminar por valor");
        System.out.println("5 Ordenar la lista");
        System.out.println("6 Vaciar la lista");
        System.out.println("0 Salir del programa");
        try {
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }
    
    private static boolean validarAltura(float altura) {
        return altura >= 0.50f && altura <= 2.50f;
    }
    
    private static int eliminarPorValor(ArrayList<Float> lista, float valor) {
        int eliminaciones = 0;
        for (int i = lista.size() - 1; i >= 0; i--) {
            if (Float.compare(lista.get(i), valor) == 0) {
                lista.remove(i);
                eliminaciones++;
            }
        }
        return eliminaciones;
    }
    
    private static void ordenarLista(ArrayList<Float> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (Float.compare(lista.get(i), lista.get(j)) > 0) {
                    float temp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                }
            }
        }
    }
    
    private static void vaciarLista(ArrayList<Float> lista) {
        lista.clear();
    }
}
