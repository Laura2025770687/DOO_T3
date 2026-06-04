package Logic;
/**
 * Representa a la bebida con sabor Fanta, extiende el funcionamiento de {@link Bebida}
 * y de {@link Producto}
 */
public class Fanta extends Bebida {
    /**
     * {@inheritDoc}
     * <p>
     * En este caso, el sabor es Fanta
     * @return El sabor de la bebida, en este caso Fanta.
     * </p>
     */
    @Override
    public String consumir() {
        return "fanta";
    }
    /**
     * Lo que muestra en pantalla al imprimir un Producto Bebida Fanta
     * @return El tipo de producto, producto y su numero de serie
     */
    @Override
    public String toString() {
        return "Producto: Bebida Fanta," + " Serie: " + super.serie;
    }
}
