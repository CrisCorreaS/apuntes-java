//Cristina Correa Segade
/*
Este código es erróneo ¿Qué mostraría por pantalla? ¿Por qué?
public static void main(String[] args) {
float saldo = 500f;
saldo = ingresar(saldo, 400f);
if (ingresar(saldo, 400f)>1000f)
System.out.println("Ya tienes más de 1000 euros: " + saldo);
else System.out.println("No tienes más de 1000 euros: " + saldo);
}
static float ingresar (float saldo, float increm){ return saldo+increm;}
*/
//El programa imprimiría "Ya tienes más de 1000 euros: 1300.0" ya que 500 + 400 + 400 = 1300.