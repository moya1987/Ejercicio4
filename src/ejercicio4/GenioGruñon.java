
package ejercicio4;

/**
 *
 * @author adrian
 */
public class GenioGruñon extends  Genio{
    
	/**
	 * @param limite num max de deseos a conceder.
	 */
	public GenioGruñon(int limite) {
		super(1);
	}


	@Override
	public String toString() {
		return (getDeseosConcedidos() == 1) ? "Genio Gruñon ha concedido un deseo."
				: "Genio Gruñon tiene deseo a conceder.";
	}
}
