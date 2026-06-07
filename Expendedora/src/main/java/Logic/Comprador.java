package Logic;
/**
 * Representa un comprador cualquiera de producto para la máquina expendedora.
 */
public class Comprador {
    private String sabor;
    private int vuelto;
    /**
     * Constructor del comprador, se hace la compra en el mismo constructor.
     * @param moneda El dinero para comprar algún profucto.
     * @param cual El tipo de producto que se desea comprar.
     * @param exp El expendedor en el cual se comprará el producto.
     * @throws PagoInsuficienteException si el valor de la moneda es menor al precio del producto
     * @throws PagoIncorrectoException si la moneda es nula
     * @throws NoHayProductoException si no hay producto disponible en el depósito
     */
    public Comprador(Moneda moneda, Constantes cual, Expendedor exp)
            throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException{
        this.sabor = null;
        this.vuelto = 0;

        try {
            exp.comprarProducto(moneda, cual);
            Producto p = exp.getProducto();
            if( p != null){
                this.sabor = p.consumir();
            }
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            Moneda mVuelto;
            while ((mVuelto = exp.getVuelto()) != null) {
                this.vuelto += mVuelto.getValor();
            }

        }
        Moneda mVuelto;
        while ((mVuelto = exp.getVuelto()) != null){
            this.vuelto += mVuelto.getValor();
        }
    }

    /**
     * Un getter para obtener la cantidad de vuelto de la compra.
     * @return la cantidad de vuelto de la compra.
     */
    public int getVuelto(){ return this.vuelto; }

    /**
     * Un getter para obtener el sabor del producto que se compró.
     * @return el sabor del producto comprado.
     */
    public String getSabor(){ return this.sabor; }
}
