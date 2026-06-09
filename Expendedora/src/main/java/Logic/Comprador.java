package Logic;

import java.util.ArrayList;

/**
 * Representa un comprador cualquiera de producto para la máquina expendedora.
 */
public class Comprador {
    private ArrayList<Moneda> monedero1000;
    private ArrayList<Moneda> monedero500;
    private ArrayList<Moneda> monedero100;
    private ArrayList<Producto> inventario;
    private String sabor;
    private int vuelto;

    /**
     * Constructor de la clase Comprador. Inicializa las colecciones de pertenencias
     * y genera un set inicial equitativo de monedas de diferentes denominaciones.
     * @param cantidadMonedas Cantidad de ciclos de monedas (100, 500, 1000) con las que iniciará el cliente.
     */
    public Comprador(int cantidadMonedas){
        this.monedero1000 = new ArrayList<>();
        this.monedero500 = new ArrayList<>();
        this.monedero100 = new ArrayList<>();
        this.inventario = new ArrayList<>();
        this.inventario.add(null);
        this.inventario.add(null);
        this.sabor = null;
        this.vuelto = 0;

        for (int i = 0; i < cantidadMonedas; i++) {
            this.monedero1000.add(new Moneda1000());
        }

        for (int i = 0; i < cantidadMonedas; i++) {
            this.monedero500.add(new Moneda500());
        }

        for (int i = 0; i < cantidadMonedas; i++) {
            this.monedero100.add(new Moneda100());
        }
    }

    /**
     * Busca y extrae una moneda del monedero que coincida exactamente con el valor solicitado.
     * Permite al usuario elegir qué tipo de moneda gastar en la interfaz gráfica.
     * @param valor El valor entero de la moneda que se desea seleccionar (e.g., 100, 500, 1000).
     * @return La {@link Moneda} extraída del monedero lista para ser utilizada.
     * @throws PagoIncorrectoException Si no quedan monedas de la denominación especificada en el monedero.
     */
    public Moneda seleccionarMoneda(int valor) throws PagoIncorrectoException {
        if (valor == 1000 && monedero1000.size() != 0) {
            return monedero1000.remove(0); // Remueve y retorna la moneda encontrada
        } else if (valor == 500 && monedero500.size() != 0) {
            return monedero500.remove(0);
        } else if (valor == 100 && monedero100.size() != 0) {
            return monedero100.remove(0);
        }
        throw new PagoIncorrectoException("¡No te quedan monedas de $" + valor + "!");
    }

    /**
     * Intenta iniciar el proceso de compra de un producto en el expendedor.
     * @param cual El identificador o constante del producto que se desea adquirir.
     * @param exp La instancia de la máquina expendedora donde se realiza la transacción.
     * @throws PagoIncorrectoException Si la moneda ingresada es nula.
     * @throws PagoInsuficienteException Si el valor de la moneda es menor al precio del producto.
     * @throws NoHayProductoException Si el depósito del producto seleccionado no cuenta con stock.
     */
    public void comprarProducto( Constantes cual, Expendedor exp)
            throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException, DepositoEntregaLlenoException {
        exp.comprarProducto(cual);
    }

    /**
     * Retira el producto que se encuentra en la ranura de entrega del expendedor
     * y lo almacena en el inventario personal del comprador.
     * @param exp La instancia de la máquina expendedora desde donde se retira el objeto.
     * @throws InventarioLlenoException Si el inventario del comprador ya alcanzó su capacidad máxima de 2 elementos.
     * @throws NoHayProductoException Si se intenta retirar un producto pero la ranura de entrega está vacía.
     */
    public int guardarProducto(Expendedor exp) throws InventarioLlenoException, NoHayProductoException {
        if (this.inventario.get(0) != null && this.inventario.get(1) != null) {
            throw new InventarioLlenoException("¡Mochila llena! Debes consumir un producto antes de poder retirar otro.");
        }
        Producto p = exp.getProducto();
        if (p == null) {
            throw new NoHayProductoException("La ranura de entrega está vacía. No hay ningún producto para retirar.");
        }
        int indice = 0;
        if(this.inventario.get(0) == null){
            this.inventario.set(0, p);
            indice = 1;
        }else if(this.inventario.get(1) == null){
            this.inventario.set(1, p);
            indice = 2;
        }
        return indice;
    }

    /**
     * Extrae de forma secuencial todas las monedas de vuelto depositadas en la máquina,
     * acumulando su valor monetario e integrando las monedas físicas de regreso al monedero.
     * @param exp La instancia de la máquina expendedora de donde se extraerá el vuelto.
     */
    public void recogerVuelto(Expendedor exp) {
        this.vuelto = 0;
        Moneda mVuelto;
        while ((mVuelto = exp.getVuelto()) != null) {
            this.vuelto += mVuelto.getValor();
            if (mVuelto.getValor() == 500) {
                this.monedero500.add(mVuelto);
            } else if (mVuelto.getValor() == 100) {
                this.monedero100.add(mVuelto);
            }
        }
    }

    /**
     * Consume un producto del inventario según su posición indexada, actualizando
     * la variable del último sabor percibido.
     * @param indice La posición del producto dentro del ArrayList de inventario (0 o 1).
     * @throws RanuraInventarioVaciaException Si el índice proporcionado es inválido o el inventario está vacío.
     */
    public void consumirProducto(int indice) throws RanuraInventarioVaciaException {
        if (inventario.get(indice) == null) {
            throw new RanuraInventarioVaciaException("No hay ningún producto en la ranura seleccionada de la mochila.");
        }
        Producto p = this.inventario.get(indice);
        this.inventario.set(indice, null);
        this.sabor = p.consumir();
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

    /**
     * Obtiene la lista completa de monedas que el comprador posee actualmente en su monedero.
     * Útil para que la interfaz gráfica pueda contabilizar y dibujar el stock de dinero.
     * @return Un {@link ArrayList} que contiene las monedas disponibles.
     */
    public ArrayList<Moneda> getMonedero(int valor) {
        if (valor == 1000) {
            return this.monedero1000;
        } else if (valor == 500) {
            return this.monedero500;
        } else if (valor == 100) {
            return this.monedero100;
        }
        return null;
    }

    /**
     * Obtiene los productos guardados en la mochila que aún no han sido consumidos.
     * @return Un {@link ArrayList} con los productos en posesión del cliente (máximo 2).
     */
    public ArrayList<Producto> getInventario() {
        return this.inventario;
    }
}
