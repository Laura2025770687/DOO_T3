package Logic;
/**
 * Representa a una moneda cualquiera usada para comprar un producto en la máquina
 * expendedora, define los comportamientos base de cualquier moneda.
 */
public abstract class Moneda implements Comparable<Moneda> {
    private static int contadorSerie = 1;
    private int serie;

    /**
     * Constructor por defecto que inicializa una nueva moneda.
     * Asigna un número de serie único de forma secuencial utilizando
     * el contador interno y luego incrementa dicho contador para la próxima instancia.
     */
    public Moneda(){
        this.serie = this.contadorSerie;
        this.contadorSerie++;
    }
    /**
     * Todas las subclases debe implementarlo para saber el valor de la moneda
     * @return El valor de la moneda actual
     */
    public abstract int getValor();

    /**
     * Sobreescritura de compareTo
     * @param mon el elemento a ser comparado.
     * @return retorna un valor para organizar mas adelante
     */
    @Override
    public int compareTo(Moneda mon) {
        if (this.getValor() < mon.getValor())
            return -1;
        else if (this.getValor() > mon.getValor())
            return 1;
        else
            return 0;
    }

    /**
     * Lo que muestra en pantalla al imprimir una moneda
     * @return El valor de la moneda y su serie
     */
    @Override
    public String toString() {
        return "Valor moneda: " + this.getValor() + ", Serie: " + this.serie;
    }
}
