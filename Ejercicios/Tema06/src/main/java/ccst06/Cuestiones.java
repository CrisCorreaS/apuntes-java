/*
PREGUNTAS:

Cuestiones: 
Examina la clase Producto y contesta a las siguientes cuestiones: 
 
public class Producto { 
    public String nombre; 
    public double precio; 
    public double IVA; 
    public double descuento; 
     
    public Producto (String nom, double p, double IVA) { 
        this.nombre = nom; 
        this.precio = p; 
        this.IVA = IVA; 
        this.descuento=0; 
    } 
 
    public double calcularPrecioFinal () { 
        double prFin= this.precio + (this.precio * this.IVA); 
        double prFinDesc = prFin - (prFin * this.descuento); 
        return prFinDesc; 
    } 
    public void setDescuento (double desc) { 
        this.descuento = desc; 
    } 
} 
 
a) ¿Cuántos atributos tiene? 
b) ¿Cuántos constructores tiene? 
c) ¿Cuántos métodos tiene? 
d) ¿Cómo harías para crear en el main() de un programa dos productos? Por ejemplo, ‘p1’ que 
sea un ordenador, que tiene un impuesto del 21% y ‘p2’ una barra de pan, que tiene el 4%   
e) ¿Con qué descuento se crean? 
f) ¿Cómo mostrarías por pantalla el precio final de ambos productos creados? 
g) Aplícale un descuento del 10% al ordenador y muestra de nuevo el precio final. 
h) Cambia el nombre a la barra de pan. 
i) ¿Qué ocurre si hago en el main: p1.IVA = p2.IVA; ? 
j) ¿Qué ocurre si hago en el main: p1.descuento = p2.descuento; ? 
k) ¿Qué ocurre si hago en el main: p1 = p2; ?  
l) ¿Cómo harías para que el objeto p1 tuviese el mismo contenido que p2 pero fuesen variables 
independientes que puedan tomar valores diferentes más adelante? 
m) ¿Qué ocurre si hago if (p1 ==p2) System.out.println("Iguales"); ? 
n) Haz un main con el siguiente código: 
Producto p3 = new Producto ("impresora",50d, 0.21d); 
Producto p4 = p3; 
p3.precio = 60; 
System.out.println(p4.precio); 
¿Qué mostrará por pantalla?¿Por qué?

---------------------------------------------------------------------------------------------

RESPUESTAS:

A) 4 atributos

B) 1 constructor

C) 2 métodos

D) Haría lo siguiente:
    producto p1 = new Producto("ordenador", 1000, 0.21d);
    producto p2 = new Producto("barra de pan", 1d, 0.04d);

E) Con ningún descuento

F) El precio final de ambos productos lo mostraría: 
    double precioFinal; 
    precioFinal=(p1.precio-p1.precio * p1.descuento)*(1+p1.IVA);
    System.out.println("El precio final del primer producto es: " +precioFinal);
    precioFinal=(p2.precio-p2.precio * p2.descuento)*(1+p2.IVA);
    System.out.println("El precio final del segundo producto es: " + precioFinal);

G) p1.descuento=0.1d;
   precioFinal=(p1.precio-p1.precio * p1.descuento)*(1+p1.IVA);
   System.out.println(precioFinal);

H) p2.nombre="barra";

I) A p1.IVA se le asigna lo que había en p2.IVA

J) A p1.descuento se le asigna lo que había en p2.descuento

K) A p1 se le asigna lo que tenía p2. Ambos apuntarán a la barra de pan

L) Tenemos que ir asignando de atributo en atributo:
    p1.nombre= p2.nombre;
    p1.precio= p2.precio;
    p1.descuento= p2.descuento;

M) Da False porque comparamos las referencias de memoria, no el contenido

N) 60, porque p4 apunta a la misma dirección que p3, que da 60.
*/