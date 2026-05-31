package Logic;
/**
 * Depósito de una sola ranura para el producto comprado
 */
public class DepositoEntrega {
    private Producto producto;
    /**
     * Inicializa el depósito vacío
     */
    public DepositoEntrega (){
        this.producto = null;
    }
    /**
     * Agrega el producto tras una compra exitosa
     * @param p Producto a depositar
     */
    public void agregar(Producto p) { this.producto = p; }
    /**
     * Retira el producto y vacía el depósito
     * @return El producto retirado
     */
    public Producto retirar() {
        Producto aux = this.producto;
        this.producto = null; // Queda vacío al retirar.
        return aux;
    }
    /**
     * Devuelve el producto actual
     * @return El producto en la ranura.
     */
    public Producto getProducto() { return this.producto; }
}
