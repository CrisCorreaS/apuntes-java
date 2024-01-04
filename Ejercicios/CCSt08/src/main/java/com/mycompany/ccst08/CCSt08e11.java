//Crsitina Correa Segade
/*
Crear una clase llamada Trabajador con los atributos privados: id, nombre, fecha de
nacimiento y salario base.
• Dispondrá también de un constructor que inicialice todos sus campos, getters, setters,
método toString () y equals (), sabiendo que dos trabajadores son iguales si tienen el mismo
‘id’.
• Crear una subclase de Trabajador llamada Asalariado que añade un nuevo atributo llamado
salarioFinal y otro llamado horasExtra.
• El constructor de esta nueva clase Asalariado incorpora la inicialización a cero de las horas
extra y el salario final igual al salario base.
• La clase Asalariado también incorpora setter y getter para las horas extra y un método
llamado calcularSalarioFinal() al que se le pasa a cuanto se paga la hora extra en ese
momento y calcula el salario final del empleado siendo su salario base más el importe de
las horas extras trabajadas.
• Crear una subclase de Trabajador llamada ConsultorExterno que añade un nuevo atributo
llamado horasTrabajadas y salarioFinal.
El constructor de esta nueva clase ConsultorExterno incorpora la inicialización a cero de las
horas trabajadas, salario base y salario final.
• La clase ConsultorExterno también incorpora setter y getter para las horas trabajadas y un
método llamado calcularSalarioFinal() al que se le pasa a cuanto se paga la hora a los
consultores en ese momento y calcula el salario final del consultor solo en función de las
horas trabajadas (el salario base de estos trabajadores es cero).
• Haz un programa que cree un ArrayList de Asalariados y otro de ConsultoresExternos e
introduce “a mano” dos o tres empleados en ambos ArrayList.
o Después modifica el contenido de ambos ArrayList añadiendo también “a mano” las
horas extra/horas trabajadas respectivamente para todos los empleados.
o Fijar el importe de hora extra a 20 euros y la hora de consultor a 100 euros y
modificar de nuevo los ArrayList calculando el salario final de cada trabajador.
o Finalmente, recorriendo con un for-each ambos ArrayList, obtener el total que
gastará la empresa en salarios.
o ¿Sería útil tener un ArrayList que pudiese contener instancias de ambas clases?
 */

package com.mycompany.ccst08;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class CCSt08e11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Asalariado> asalariados = new ArrayList<>();
        ArrayList<ConsultorExterno> consultoresExternos = new ArrayList<>();

        asalariados.add(new Asalariado(1, "Juan", LocalDate.of(1970, 12, 18), 1000F));
        asalariados.add(new Asalariado(2, "Laura", LocalDate.of(1980, 2, 12), 1200F));
        asalariados.add(new Asalariado(3, "Maria", LocalDate.of(1990, 4, 23), 800F));

        consultoresExternos.add(new ConsultorExterno(4, "Antonio", LocalDate.of(1975, 5, 30)));
        consultoresExternos.add(new ConsultorExterno(5, "Lucia", LocalDate.of(1985, 9, 14)));
        consultoresExternos.add(new ConsultorExterno(6, "Martin", LocalDate.of(1995, 11, 21)));

        float gastoSalarios = 0;

        for (Asalariado asal : asalariados) {
            float salario = asal.calcularSalarioFinal(20);
            System.out.println(asal.toString());
            System.out.println("Su salario total es: " + salario);
            gastoSalarios += salario;
        }

        for (ConsultorExterno consultor : consultoresExternos) {
            float salario = consultor.calcularSalarioFinal(100);
            System.out.println(consultor.toString());
            System.out.println("Su salario total es: " + salario);
            gastoSalarios += salario;
        }

        System.out.println("El gasto total en salarios es: " + gastoSalarios);
    }
}