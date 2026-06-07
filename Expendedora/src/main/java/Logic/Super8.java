package Logic;
/**
 * Representa al dulce con sabor Super8, extiende el funcionamiento de {@link Dulce}
 * y de {@link Producto}
 */
public class Super8 extends Dulce {
    /**
     * {@inheritDoc}
     * <p>
     * En este caso, el sabor es Super8
     * @return El sabor del dulce, en este caso Super8.
     * </p>
     */
    @Override
    public String consumir() {
        return "super8";
    }
    /**
     * Lo que muestra en pantalla al imprimir un Producto Dulce Super8
     * @return El tipo de producto, producto y su numero de serie
     */
    @Override
    public String toString() {
        return "Producto: Dulce Super8," + " Serie: " + super.serie;
    }
}
