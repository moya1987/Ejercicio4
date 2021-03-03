
package ejercicio4;

/**
 *
 * @author adrian
 */
public class LamparaMagica {
    
    /**
	 * Num max de deseos.
	 */
	private int limite;

	/** Numero de veces a frotar la lampara.
         */
	private int totalRub;

	/** Numero de veces frotada desde la ultima vez que se ha cargado la lampara.
         */
	private int rub;

	/** Numero de recargas.
         */
	private int demonios;

	/**
	 * @param limite numero de genios que pueden aparecer.
	 */
	public LamparaMagica(int limite) {
		limite = limite;
	}

	/**
	 * @return Max num de genios.
	 */
	public int getLimite() {
		return limite;
	}

	/**
	 * @return devuelve cuantas veces se ha frotado desde la ultima carga.
	 */
	public int getRub() {
		return rub;
	}

	
	/**
	 * @return numero de genios disponibles
	 */
	public int getGenios() {
		return getLimite() - getRub();
	}

	/**
	 * @return numero de demonios.
	 */
	public int getDemonios() {
		return demonios;
	}

        /**
	 * @return numero de veces frotada totales.
	 */
	public int getTotalRub() {
		return totalRub;
	}
        
	/**
	 * @param deseos max num de deseos que el genio puede conceder.
	 * 
	 * @return devuelve un genio.
	 */
	public Genio rub(int deseos) {
		if (rub < limite) {
			rub++;
			totalRub++;
			if (totalRub % 2 == 0)
				return new GenioAmistoso(deseos);
			return new GenioGruñon(deseos);
		}
		return new DemonioReciclable(deseos);
	}

	/**
	 * Recarga la lampara
	 * 
	 * @param demonio el demonio reciclado
	 *            
	 */
	public void daDemonio(DemonioReciclable demonio) {
		if (!demonio.reciclado()) {
			demonio.recicla();
			rub = 0;
			demonios++;
		}
	}


	@Override
	public boolean equals(Object o) {
		return o instanceof LamparaMagica && equals((LamparaMagica) o);
	}

	/**
	 * @return devuelve verdado si hay capadidad y genio, sino falso.
	 */
	public boolean equals(LamparaMagica l) {
		return getLimite() == l.getLimite() && getGenios() == l.getGenios()
				&& getDemonios() == l.getDemonios();
	}

    
}
