
package ejercicio4;

/**
 *CAMBIO PRUEBA GIT
 * @author adrian
 */
public class DemonioReciclable extends Genio{
    
	/** Para saber si es reciclado o no. */
	private boolean reciclado = false;

	/**
	 * @param limite numero max de deseos a conceder.
	 */
	public DemonioReciclable(int limite) {
		super(limite);
	}

	/**

	 * @return devuelve true si ha sido reciclado
	 */
	@Override
	public boolean puedeConcederDeseo() {
		return !reciclado;
	}

	/**
	 * @return devuelve si ha sido reciclado.
	 */
	public boolean reciclado() {
		return reciclado;
	}


	public void recicla() {
		reciclado = true;
	}


	@Override
	public String toString() {
		return reciclado ? "El Deomonio ha sido reciclado." : "Demonio reciclado concedido "
				+ getDeseosConcedidos() + " deseos.";
	}

}
