/*
 CUESTIONES PREVIAS
 * a) Crea un programa con estas instrucciones e interpreta el resultado,
 * obteniendo conclusiones
 * sobre precedencia de operadores, qué hacer el operador %, división entre
 * enteros, etc.
 * int a = 2 * 3 + 4; System.out.println(a);
 * int b = 4 + 2 * 3; System.out.println(b);
 * int c = 5 – 10 % 2; System.out.println(c);
 * float d = 5 / 2; System.out.println(d);
 * float e = 5f / 2; System.out.println(e);

 * b) Resuelve a mano, sin programa ni calculadora, las siguientes expresiones:
 * -4 * 7 + 20 % 3 / 2 – 5
 * ( ( 3 + 2 ) % 2 – 15 ) / 2 * 5
 * 3 + 6 * 14 % 3;
 * d =8 + 7 * 3 + 4 * 6 / 2 % 4

 * c) ¿Qué hace este programa? ¿Puede producirse algún error?
 * int a,b,c;
 * Scanner teclado = new Scanner(System.in);
 * System.out.print("Introduce valor a: ");
 * a = teclado.nextInt();
 * System.out.print("Introduce valor b: ");
 * b = teclado.nextInt();
 * c = a * b;
 * System.out.println("Resultado: " + c);

 * d) ¿Qué hace este programa? Corrígelo sus errores. ¿Qué ocurre para la
 * variable ‘b’ introducimos
 * cero?
 * int a,b,c;
 * Scanner teclado = new Scanner(System.in);
 * System.out.print("Introduce valor a: ");
 * a = teclado.nextInt();
 * System.out.print("Introduce valor b: ");
 * b = teclado.nextInt();
 * c = a / b;
 * System.out.println("Resultado: " + c);

 * e) Expresar, utilizando operadores aritméticos, (en una sola línea, como en
 * la cuestión ‘b’ las
 * siguientes expresiones matemáticas:
 * (m+n)/n
 * [(m+n)/p]/[(p-r)/s]
 * (c*r*t/100)/[(m^2+n^2)/(p+q)]
 
 * f) Indicar el valor de las variables enteras ‘a’, ‘b’ y ‘c’, ‘d’ sobre las
 * que se efectúan consecutivamente
 * las operaciones:
 * a=3; b=2; c=a*b-b; d=b*b; a=b-a; b++; d+=2;
 * 
 * -----------------------------------------------------------------------------
 * -----------
 * RESPUESTAS
 * 
 * 1
 * a) 10
 * b) 10
 * c) 5
 * d) 2.0 // Da 2.0 y no 2.5 porque 2 y 5 son enteros así que el float solo
 * sirve para poner el punto
 * e) 2.5 // El float es la f que está al lado del 5 así que esto si que da 2.5
 * 
 * 2
 * a) -32
 * b) -35
 * c) 3
 * d) d = 29
 * 
 * 3
 * Este programa se supone que pide dos valores a un usuario y al introducirlos
 * da el resultado de su multiplicación. Pero tiene los siguientes errores:
 * En el código, se hace antes la definición de variables que escribir
 * "Scanner teclado = new Scanner(System.in);"
 * En vez de usar "System.out.println()" usa el "System.out.print()"
 * Funciona pero funciona mal ya que las preguntas van sin texto y al
 * responderlas al finalizar te da los textos de preguntas y el resultado
 * No contempla divisiones de números con decimales
 * 
 * 
 * 4
 * Este programa se supone que pide dos valores a un usuario y al introducirlos
 * da el resultado de su división. Pero tiene los siguientes errores:
 * Si introducimos la variable b como 0 da un error
 * Solo da números enteros por lo que si el denominador es menor que el
 * denominador da 0
 * En el código, se hace antes la definición de variables que escribir
 * "Scanner teclado = new Scanner(System.in);"
 * En vez de usar "System.out.println()" usa el "System.out.print()"
 * Funciona pero funciona mal ya que las preguntas van sin texto y al
 * responderlas al finalizar te da los textos de preguntas y el resultado
 * 
 * 5
 * a) (m+n)/n
 * b) ((m+n)/p)/((p-r)/s)
 * c) (c*r*t/10)/((m^2+n^2)/(p+q)) //Aunque también se podría hacer:
 * ((c*r*t)/10)/((m^2+n^2)/(p+q))
 * 
 * 6
 * a) a=3
 * b) b=2
 * c) c=4
 * d) d=4
 * e) a=-1
 * f) b=3
 * g) d=7
 * 
 */