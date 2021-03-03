
package ejercicio4;

/**
 *
 * @author adrian
 */
public class GenioAmistoso extends Genio{
    /**
	 * @param limite max num de deseos a conceder.
	 */
	public GenioAmistoso(int limite) {
		super(limite);
	}

	/**
	 * @return devuelve el num de deseos que quedan por conceder.
	 */
	public int getDeseosRestantes() {
		return getLimite() - getDeseosConcedidos();
	}


	@Override
	public String toString() {
		return "Genio Amistoso ha concedido " + getDeseosConcedidos() + " deseos y todavia tiene "
				+ getDeseosRestantes() + " para conceder.";
	}
}
