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
    private Deposito<Moneda> depMonedasUsadas;
    private DepositoEntrega depEntrega;
    private Moneda monedaEnRanura = null;

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
        this.depMonedasUsadas = new Deposito<Moneda>();
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
     * Permite depositar una moneda en la ranura de espera de la máquina.
     * @param m La moneda que se introduce.
     * @throws PagoIncorrectoException Si ya hay una moneda en la ranura.
     */
    public void insertarMonedaEnRanura(Moneda m) throws PagoIncorrectoException {
        if (this.monedaEnRanura != null) {
            throw new PagoIncorrectoException("Ya hay una moneda en la ranura. Elíja un producto.");
        }
        if (m == null) {
            throw new PagoIncorrectoException("No tienes ninguna moneda en la mano.");
        }
        this.monedaEnRanura = m;
    }

    /**
     * Compra del producto deseado.
     * @param cual El numero identificador del producto que se desea comprar.
     * @throws PagoIncorrectoException Si la moneda recibida es null.
     * @throws PagoInsuficienteException Si el valor de la moneda es menor al precio del producto.
     * @throws NoHayProductoException Si no quedan unidades en el depósito o el depósito no existe.
     * @throws DepositoEntregaLlenoException Si la ranura de entrega de productos esta ocupada.
     */
    public void comprarProducto(Constantes cual)
            throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException, DepositoEntregaLlenoException{
        if (this.monedaEnRanura == null) {
            throw new PagoIncorrectoException("No se ha introducido ninguna moneda en la ranura.");
        }
        Moneda moneda = this.monedaEnRanura;
        Producto p = null;
        int vuelto = 0;

        if (this.depEntrega.getProducto() != null) {
            throw new DepositoEntregaLlenoException("La ranura de entrega de productos esta Llena, por favor retirar el producto.");
        } else if(moneda.getValor() < cual.getPrecio()){
            depMonedasVuelto.addProducto(moneda);
            this.monedaEnRanura = null;
            throw new PagoInsuficienteException("El valor de la moneda es inferior al precio del producto.");
        }
        else if(cual.getNumProducto() == Constantes.COCACOLA.getNumProducto()) {
            p = depCocaCola.getProducto();
            if(p == null){
                depMonedasVuelto.addProducto(moneda);
                this.monedaEnRanura = null;
                throw new NoHayProductoException("El producto no está disponible.");

            }
            vuelto = moneda.getValor() - Constantes.COCACOLA.getPrecio();

        }else if(cual.getNumProducto() == Constantes.SPRITE.getNumProducto()){
            p = depSprite.getProducto();
            if(p == null){
                depMonedasVuelto.addProducto(moneda);
                this.monedaEnRanura = null;
                throw new NoHayProductoException("El producto no está disponible.");
            }
            vuelto = moneda.getValor() - Constantes.SPRITE.getPrecio();

        }else if(cual.getNumProducto() == Constantes.FANTA.getNumProducto()){
            p = depFanta.getProducto();
            if(p == null){
                depMonedasVuelto.addProducto(moneda);
                this.monedaEnRanura = null;
                throw new NoHayProductoException("El producto no está disponible.");
            }
            vuelto = moneda.getValor() - Constantes.FANTA.getPrecio();

        }else if(cual.getNumProducto() == Constantes.SUPER8.getNumProducto()){
            p = depSuper8s.getProducto();
            if(p == null){
                depMonedasVuelto.addProducto(moneda);
                this.monedaEnRanura = null;
                throw new NoHayProductoException("El producto no está disponible.");
            }
            vuelto = moneda.getValor() - Constantes.SUPER8.getPrecio();

        }else if(cual.getNumProducto() == Constantes.SNICKERS.getNumProducto()){
            p = depSnickers.getProducto();
            if(p == null){
                depMonedasVuelto.addProducto(moneda);
                this.monedaEnRanura = null;
                throw new NoHayProductoException("El producto no está disponible.");
            }
            vuelto = moneda.getValor() - Constantes.SNICKERS.getPrecio();

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
        depMonedasUsadas.addProducto(monedaEnRanura);
        this.monedaEnRanura = null;
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

    /**
     * Un getter para obtener los depositos
     * @param Dep Cual deposito
     * @return Deposito deseado
     */
    public Deposito getDeposito(int Dep){
        switch (Dep){
            case (1):
                return depCocaCola;
            case (2):
                return depSprite;
            case (3):
                return depFanta;
            case (4):
                return depSnickers;
            case (5):
                return depSuper8s;
            case (6):
                return depMonedasVuelto;
            case (7):
                return depMonedasUsadas;
        }
        return null;
    }
}
