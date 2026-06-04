package Logic;
/**
 * Representa un artículo cualquiera que puede ser almacenado y vendido por la máquina
 * expendedora, define el comportamiento base para los productos consumibles.
 */
public abstract class Producto {
    private static int contadorSerie = 1;
    protected int serie;

    /**
     * Constructor por defecto que inicializa un nuevo producto.
     * Asigna un número de serie único de forma secuencial utilizando
     * el contador interno y luego incrementa dicho contador para la próxima instancia.
     */
    public Producto() {
        this.serie = this.contadorSerie;
        this.contadorSerie++;
    }

    /**
     * Un getter para conseguir el número de serie de cualquier producto
     * @return El número de serie del producto actual
     */
    public int getSerie() {
        return this.serie;
    }

    /**
     * Consume el producto, lo deben implementar todas las subclases para definir lo que pasa
     * al consumir el artículo.
     * @return El sabor del producto consumido.
     */
    public abstract String consumir();
}
