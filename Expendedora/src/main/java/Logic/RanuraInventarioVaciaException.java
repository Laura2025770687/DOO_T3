package Logic;

/**
 * Excepción lanzada cuando el comprador intenta consumir un producto de una
 * posición de su inventario que se encuentra vacía o no es válida.
 */
public class RanuraInventarioVaciaException extends RuntimeException {
    public RanuraInventarioVaciaException(String message) {
        super(message);
    }
}
