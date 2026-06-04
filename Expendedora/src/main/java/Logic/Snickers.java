package Logic;
/**
 * Representa al dulce con sabor Snickers, extiende el funcionamiento de {@link Dulce}
 * y de {@link Producto}
 */
public class Snickers extends Dulce {
    /**
     * {@inheritDoc}
     * <p>
     * En este caso, el sabor es Snickers
     * @return El sabor del dulce, en este caso Snickers.
     * </p>
     */
    @Override
    public String consumir() {
        return "snickers";
    }
    /**
     * Lo que muestra en pantalla al imprimir un Producto Dulce Snickers
     * @return El tipo de producto, producto y su numero de serie
     */
    @Override
    public String toString() {
        return "Producto: Dulce Snickers," + " Serie: " + super.serie;
    }
}
