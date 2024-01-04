/*
a) int [] a = new int [] {1,2,3,4,5};
    int p=0,i=0;
    for (int x=0;x<a.length;x++)
        if (x%2==0) p+=a[x]; else i+=a[x];
    System.out.printf("%d-%d\n",p,i);
No tiene errores.

b) int [] arr = new int [] {1,2,3,4,5}; //Mal
   int [] arr = new int [] {1,2,3,4,5}; //Mal
   int [] arr = new int [] {1,2,3,4,5}; //Mal
   int [] arr = new int [] {1,2,3,4,5}; //No tiene errores
   int [] arr = new int [5];   //No tiene errores

c) int [] arr = new int [] {1,2,3,4,5};
   int aux=arr[0];
   for (int i=0; i<= arr.length-2;i++)    //Creamos un Array y luego creamos un Array modificado poniendo en cada posicion lo que tenga en la siguiente posicion
      arr[i]=arr[i+1];         //Cuando estamos en la ultima posicion da error porque intentamos acceder a una posicion que no existe
      arr[4]=aux;   
 System.out.println(Arrays.toString(arr));
*/
