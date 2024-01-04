//Cristina Correa Segade
/*
Implementar una clase llamada EjemplarLibro que se va a usar en una biblioteca y que tiene
los siguientes atributos:
- Título de libro (se le pone en el momento del alta)
- Fecha de adquisición (es la fecha del sistema en el momento del alta)
- Número de ejemplar: 1, 2, 3, etc. (de un mismo libro, la biblioteca tiene varios ejemplares)
- Prestado (sí /no). Inicialmente no está prestado.
Además, tiene los siguientes métodos:
- Constructor 1: cuando es el primer ejemplar de un determinado título, se le pasa como parámetro solo
el título del libro. El resto de datos los puede calcular él.
- Constructor 2: se le pasa como parámetro un libro y copia todos sus atributos salvo el número de
ejemplar que será 1 más el del libro pasado.
- Prestar (): si no está prestado lo marca como prestado y devuelve true ̧ si está prestado no hace nada
y devuelve false.
- Devolver (): si está prestado lo marca como no prestado y devuelve true ̧ si no está prestado no hace
nada y devuelve false.
- toString (): Genera un String con el nombre, la fecha entre paréntesis y el número de ejemplar entre
corchetes. Este método se usará para sacar por pantalla de forma cómoda los datos de un libro.

Haz un main() que cree 4 libros (probando ambos constructores), que realice algún préstamo y
devolución, y finalmente muestre los libros -con toString()-.
 */
package ccst06;

import java.util.Scanner;

public class CCSt06e08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Títulos de las obras
        String titulo1 = "1984";
        String titulo2 = "Historia de dos ciudades";
        String titulo3 = "Rebelión en la granja";
        
        //Creación de los libros, voy a hacer 2 libros con 2 ejemplares cada uno y uno con un único ejemplar
        EjemplarLibro libro1 = new EjemplarLibro(titulo1);
        EjemplarLibro libro2 = new EjemplarLibro(titulo2);
        EjemplarLibro libro3 = new EjemplarLibro(titulo3);
        EjemplarLibro ejemplarLibro1 = new EjemplarLibro(libro1);
        EjemplarLibro ejemplarLibro2 = new EjemplarLibro(libro2);
        
        //Mostrar libros disponibles
        System.out.println("Los libros que se encuentran ahora disponibles son los siguientes:");
        libro1.Convierte();
        ejemplarLibro1.Convierte();
        libro2.Convierte();
        ejemplarLibro2.Convierte();
        libro3.Convierte();
        
        //Libros para prestar(como no hago un bucle, solo dejo coger uno)
        System.out.println("Si quieres pedir prestado cualquier libro escribe su nombre");
        String nombrePrestar = teclado.nextLine();
        
        if(nombrePrestar.equals(libro1.titulo)){
            libro1.Prestar();
        }
        else{
            if(nombrePrestar.equals(libro2.titulo)){
                libro2.Prestar();
            }
            else{
                if(nombrePrestar.equals(libro3.titulo)){
                    libro3.Prestar();
                }
                else{
                    System.out.println("No hay un libro que se corresponda con el título introducido");
                }
            }
        }
        
        //Libros para devolver
        System.out.println("Si quieres devolver un libro prestado escribe su nombre");
        String nombreDevolver = teclado.nextLine();
        
        if(nombreDevolver.equals(libro1.titulo)){
            libro1.Prestar();
        }
        else{
            if(nombreDevolver.equals(libro2.titulo)){
                libro2.Prestar();
            }
            else{
                if(nombreDevolver.equals(libro3.titulo)){
                    libro3.Prestar();
                }
                else{
                    if(!nombreDevolver.isEmpty()){
                        System.out.println("No hay un libro que se corresponda con el título introducido");
                    }
                }
            }
        }
        
        //Mostrar disponibilidad de libros otra vez
        System.out.println("Los libros que se encuentran ahora disponibles son los siguientes:");
        if(!libro1.prestado){
            libro1.Convierte();
        }
        ejemplarLibro1.Convierte();
        if(!libro2.prestado){
            libro2.Convierte();
        }
        ejemplarLibro2.Convierte();
        if(!libro3.prestado){
            libro3.Convierte();
        }
        
    }
}
