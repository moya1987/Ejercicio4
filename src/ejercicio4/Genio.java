package ejercicio4;

/**
 *
 * @author adrian
 */
public abstract class Genio {

    /**
     * Numero maximo de deseos.
     */
    private int limite;

    /**
     * Numero de deseos concedidos.
     */
    private int concedidos;

    /**
     * @param limite num max de deseos concedidos
     */
    protected Genio(int limite) {
        limite = limite;
    }

    /**
     * @return numero de deseos concedidos.
     */
    public int getDeseosConcedidos() {
        return concedidos;
    }

    public void aumentaConcedidos() {
        concedidos++;
    }

    /**
     * @return numero maximo de deseos.
     */
    public int getLimite() {
        return limite;
    }

    /**
     *
     * @return devuelve si puede conceder deseo o no.
     */
    public boolean puedeConcederDeseo() {
        return concedidos < limite;
    }

    /**
     *
     * @return devuelve si el genio concede o no el deseo.
     */
    public boolean concederDeseo() {
        if (puedeConcederDeseo()) {
            aumentaConcedidos();
            concedeDeseo();
            return true;
        }
        return false;
    }

    public void concedeDeseo() {
    }

}
