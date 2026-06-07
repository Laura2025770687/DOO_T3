package Logic;
/**
 * Representa a la bebida con sabor CocaCola, extiende el funcionamiento de {@link Bebida}
 * y de {@link Producto}
 */
public class CocaCola extends Bebida {
    /**
     * {@inheritDoc}
     * <p>
     * En este caso, el sabor es CocaCola
     * @return El sabor de la bebida, en este caso CocaCola.
     * </p>
     */
    @Override
    public String consumir() {
        return "cocacola";
    }
    /**
     * Lo que muestra en pantalla al imprimir un Producto Bebida CocaCola
     * @return El tipo de producto, producto y su numero de serie
     */
    @Override
    public String toString() {
        return "Producto: Bebida CocaCola," + " Serie: " + super.serie;
    }
}
