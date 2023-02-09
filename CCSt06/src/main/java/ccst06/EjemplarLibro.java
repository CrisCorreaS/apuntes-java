//Ejemplar Libro Cristina Correa
package ccst06;

import java.time.LocalDate;

public class EjemplarLibro {

    public String titulo;
    LocalDate fecha;
    public int numEjemplar;
    public boolean prestado = false;

    EjemplarLibro(String tit) {
        titulo = tit;
        fecha = LocalDate.now();
        numEjemplar = 1;
        prestado = false;
    }

    EjemplarLibro(EjemplarLibro lib) {
        titulo = lib.titulo;
        fecha = LocalDate.now();
        numEjemplar = lib.numEjemplar + 1;
        prestado = false;
    }

    public boolean Prestar() {
        if (prestado) {
            return false;
        }
        prestado = true;
        return true;
    }

    public boolean Devolver() {
        if (prestado) {
            prestado = false;
            return true;
        }
        return false;
    }

    public void Convierte() {

        String datos = titulo + " (" + String.valueOf(fecha) + ") " + "[" + String.valueOf(numEjemplar) + "]";
        System.out.println(datos);

    }

}
