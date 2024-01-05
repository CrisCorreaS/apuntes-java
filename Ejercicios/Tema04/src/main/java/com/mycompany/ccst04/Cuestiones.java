/*
PREGUNTAS:
Cuestiones previas 
Primero haz en el ordenador el ejercicio 4.1. para tomar contacto con los String y luego explica que 
hacen los siguientes fragmentos de código, suponiendo que las variables utilizadas están definidas 
previamente y están inicializadas con un valor cualquiera:  

a) if (cad.substring(0,2).equals(cad.substring(cad.length()-2,cad.length()))) 

b) b=false;  
for (int i=0;i<= cad.length()-2;i++)  
if(cad.charAt(i)==cad.charAt(i+1)) b = true; 
¿Por qué el bucle va hasta length()-2 en vez de hasta length(), o length()-1 ? 

c) res = nom.toUpperCase().charAt(0) +"." + ape1.toUpperCase().charAt(0)+"." + 
ape2.toUpperCase().charAt(0) +".";


--------------------------------------------------------------------------------------------------------------------

RESPUESTAS
a)if (cad.substring(0,2).equals(cad.substring(cad.length()-2,cad.length())))
Si el número de caracteres del subconjunto de cadena de longitud 
entre 0 y 2 es igual al número de caracteres de este con una longitud 
comprendida entre su propia longitud menos 2 y su longitud. 


b)b=false;//se inicia un boolean b que es falso
  for (int i=0;i<= cad.length()-2;i++) //Se inicia un bucle que va de 0 hasta la longitud de la cadena -2
                                       //y contando de 1 en 1
    if(cad.charAt(i)==cad.charAt(i+1)) b = true;//Si el caracter de la posicion i en la cadena es igual al
                                                //caracter de la posición i+1; b es true


¿Por qué el bucle va hasta length()-2 en vez de hasta length(), o length()-1 ?
Porque la cadena empieza en 0 y no en 1


c)res = nom.toUpperCase().charAt(0) + //la variable res es igual al primer caracter en mayúsculas de la cadena nom 
"." + ape1.toUpperCase().charAt(0)+"." + //un punto más el primer caracter en mayúsculas  de la cadena ape1 más un punto
ape2.toUpperCase().charAt(0) +".";//más el primer caracter en mayúsculas de la cadena ape2 más un punto

*/