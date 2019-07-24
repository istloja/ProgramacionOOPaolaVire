
package calcular;

public class CalcularSeno {
 double CalculoGrados(double grados) {
        grados = Math.toRadians(grados);
        return grados;
    }

    double CalculoSeno(double valor) {
        valor = Math.sin(valor);
        return valor;

    }   
}
