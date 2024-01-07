//Movil Prepago Cristina Correa
package ccst06;

public class MovilPrepago {

    public long numeroMovil;
    final private float COSTE_ESTABLECER_LLAMADA;
    final private float COSTE_MINUTO_LLAMADA;
    final private float COSTE_CONSUMO_MB;
    private float saldo;

    MovilPrepago(long nM, float cEL, float cML, float cMB, float s) {
        numeroMovil = nM;
        COSTE_ESTABLECER_LLAMADA = cEL;
        COSTE_MINUTO_LLAMADA = cML;
        COSTE_CONSUMO_MB = cMB;
        saldo = s;
    }

    MovilPrepago(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    MovilPrepago() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void efectuarLlamada(int segundos) {
        saldo -= Math.round(
                (COSTE_ESTABLECER_LLAMADA + COSTE_MINUTO_LLAMADA / 60f * segundos) * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }

    public void navegar(int mb) {
        saldo -= Math.round(COSTE_CONSUMO_MB * mb * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }

    public boolean recargar(int importe) {
        if (importe % 5 == 0) {
            saldo += importe;
            return true;
        } else {
            return false;
        }
    }

    public float consultarSaldo() {
        return saldo;
    }
} //fin 
