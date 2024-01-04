//Cristina Correa Segade

package com.mycompany.ccst15;

import java.time.LocalDate;
import java.util.Objects;


public class Persona  {
    protected String nombre;
    protected String telefono;
    protected String email;
    protected LocalDate fechaNacimiento;

    Persona (String nombre,String telefono,String email,LocalDate fechaNacimiento) {
        this.nombre=nombre;
        this.telefono=telefono;
        this.email=email;
        this.fechaNacimiento=fechaNacimiento;
  
    }   

    public void setNombre(String nombre){
            this.nombre=nombre;
        }
    public String getNombre (){
        return nombre;
    }
    public void setTelefono(String tlf){
            this.telefono=tlf;
        }
    public String getTelefono (){
        return telefono;
    }
    public void setEmail(String email){
            this.email=email;
        }
    public String getEmail (){
        return email;
    }
    public void setfNacimiento(LocalDate nacimiento){
            this.fechaNacimiento=nacimiento;
        }
    public LocalDate getfNacimiento(){
        
        return fechaNacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}