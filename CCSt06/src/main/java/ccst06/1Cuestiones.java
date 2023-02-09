/*
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