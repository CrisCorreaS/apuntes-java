//Cristina Correa Segade
/*
¿Qué mostraría este código por pantalla? ¿Por qué?
public static void main(String[] args) {
float saldo = 500f;
ingresar(saldo, 600f);
if (saldo > 1000f) System.out.println("Ya tienes más de 1000 euros: " + saldo);
else System.out.println("No tienes más de 1000 euros: "+ saldo);
}
static void ingresar(float saldo, float increm) {saldo += increm; }
*/

/*Este código muestra "No tienes más de 1000 euros: 500.0" por pantalla. 
La razón es que la variable saldo en la función ingresar es una copia local
de la variable saldo en el main. Por lo tanto, la suma de saldo + increm
en la función ingresar no afecta a la variable saldo en la función main*/