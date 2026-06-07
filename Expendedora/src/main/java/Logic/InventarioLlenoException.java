package Logic;

/**
 * Excepción lanzada cuando el comprador intenta retirar un producto de la máquina
 * pero su inventario personal (mochila) ya alcanzó la capacidad máxima permitida.
 */
public class InventarioLlenoException extends RuntimeException {
    public InventarioLlenoException(String message) {
        super(message);
    }
}
