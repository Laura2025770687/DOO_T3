package Logic;
/**
 * Representa a la bebida con sabor Sprite, extiende el funcionamiento de {@link Bebida}
 * y de {@link Producto}
 */
public class Sprite extends Bebida {
    /**
     * {@inheritDoc}
     * <p>
     * En este caso, el sabor es Sprite
     * @return El sabor de la bebida, en este caso Sprite.
     * </p>
     */
    @Override
    public String consumir() {
        return "sprite";
    }
    /**
     * Lo que muestra en pantalla al imprimir un Producto Bebida Sprite
     * @return El tipo de producto, producto y su numero de serie
     */
    @Override
    public String toString() {
        return "Producto: Bebida Sprite," + " Serie: " + super.serie;
    }
}
