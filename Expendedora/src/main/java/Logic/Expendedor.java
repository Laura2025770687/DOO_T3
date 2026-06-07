package Logic;
/**
 * Representa una máquina expendedora que expende cinco clases productos
 * de dos tipos, bebidas y dulces.
 */
public class Expendedor {
    private Deposito<CocaCola> depCocaCola;
    private Deposito<Sprite> depSprite;
    private Deposito<Fanta> depFanta;
    private Deposito<Snickers> depSnickers;
    private Deposito<Super8> depSuper8s;
    private Deposito<Moneda> depMonedasVuelto;
    private DepositoEntrega depEntrega;

    /**
     * Constructor del expendedor, se llenan los depositos de cada producto y
     * se instancia el deposito de las monedas de vuelto.
     * @param llenarDepositos el numero de productos que va a tener cada deposito
     */
    public Expendedor(int llenarDepositos){
        this.depCocaCola = new Deposito<CocaCola>();
        this.depSprite = new Deposito<Sprite>();
        this.depFanta = new Deposito<Fanta>();
        this.depSnickers = new Deposito<Snickers>();
        this.depSuper8s = new Deposito<Super8>();
        this.depMonedasVuelto = new Deposito<Moneda>();
        this.depEntrega = new DepositoEntrega();
        for(int i = 0; i < llenarDepositos; i++){
            this.depCocaCola.addProducto(new CocaCola());
            this.depSprite.addProducto(new Sprite());
            this.depFanta.addProducto(new Fanta());
            this.depSnickers.addProducto(new Snickers());
            this.depSuper8s.addProducto(new Super8());
        }
    }

    /**
     * Compra del producto deseado.
     * @param moneda El dinero para comprar el producto.
     * @param cual El numero identificador del producto que se desea comprar.
     * @throws PagoIncorrectoException Si la moneda recibida es null.
     * @throws PagoInsuficienteException Si el valor de la moneda es menor al precio del producto.
     * @throws NoHayProductoException Si no quedan unidades en el depósito o el depósito no existe.
     * @return El producto comprado.
     */
    public void comprarProducto(Moneda moneda, Constantes cual)
            throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException{
        Producto p = null;
        int vuelto = 0;
        if(moneda == null){
            throw new PagoIncorrectoException("No se ha ingresado una moneda válida (moneda es null).");
        }
        else if(moneda.getValor() < cual.getPrecio()){
            depMonedasVuelto.addProducto(moneda);
            throw new PagoInsuficienteException("El valor de la moneda es inferior al precio del producto.");
        }
        else if(cual.getNumProducto() == Constantes.COCACOLA.getNumProducto()) {
            p = depCocaCola.getProducto();
            if(p == null){
                throw new NoHayProductoException("El producto no está disponible.");

            }
            vuelto = moneda.getValor() - Constantes.COCACOLA.getPrecio();

        }else if(cual.getNumProducto() == Constantes.SPRITE.getNumProducto()){
            p = depSprite.getProducto();
            if(p == null){
                throw new NoHayProductoException("El producto no está disponible.");
            }
            vuelto = moneda.getValor() - Constantes.SPRITE.getPrecio();

        }else if(cual.getNumProducto() == Constantes.FANTA.getNumProducto()){
            p = depFanta.getProducto();
            if(p == null){
                throw new NoHayProductoException("El producto no está disponible.");
            }
            vuelto = moneda.getValor() - Constantes.FANTA.getPrecio();

        }else if(cual.getNumProducto() == Constantes.SNICKERS.getNumProducto()){
            p = depSnickers.getProducto();
            if(p == null){
                throw new NoHayProductoException("El producto no está disponible.");
            }
            vuelto = moneda.getValor() - Constantes.SNICKERS.getPrecio();

        }else if(cual.getNumProducto() == Constantes.SUPER8.getNumProducto()){
            p = depSuper8s.getProducto();
            if(p == null){
                throw new NoHayProductoException("El producto no está disponible.");
            }
            vuelto = moneda.getValor() - Constantes.SUPER8.getPrecio();

        }
        while(vuelto > 0){
            if(vuelto >= 500){
                depMonedasVuelto.addProducto(new Moneda500());
                vuelto -= 500;
            }else{
                depMonedasVuelto.addProducto(new Moneda100());
                vuelto -= 100;
            }
        }
        this.depEntrega.agregar(p);
    }
    /**
     * Retira el producto del depósito de entrega, dejándolo vacío para la siguiente compra.
     * @return El {@link Producto} comprado, o null si la ranura está vacía.
     */
    public Producto getProducto() {
        return this.depEntrega.retirar();
    }
    /**
     * Un getter para obtener las monedas de vuelto de la compra, se tiene
     * que llamar varias veces el metodo hasta sacar todas las monedas.
     * @return las monedas una por una.
     */
    public Moneda getVuelto(){
        return depMonedasVuelto.getProducto();
    }
}
