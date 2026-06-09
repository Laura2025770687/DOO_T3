package Logic;
import java.util.ArrayList;

/**
 * Representa a un depósito genérico de la máquina expendedora, donde se almacenarán
 * las monedas y los productos por separado.
 * @param <T> El tipo objetos que entrarán en el depósito.
 */
public class Deposito<T> {
    private ArrayList<T> dep;

    /**
     * Constructor de Deposito, crea el depósito genérico
     */
    public Deposito() {
        dep = new ArrayList();
    }

    /**
     * Añade un objeto al depósito
     * @param Producto El objeto que se quiere agregar con un T genérico.
     */
    public void addProducto(T Producto) {
        dep.add(Producto);
    }


    /**
     * Extrae un objeto del depósito, si está vacío, no extrae nada
     * @return El objeto extraído, en el caso que no extraiga nada, null.
     */
    public T getProducto() {
        if (dep.size() != 0)
            return dep.remove(0);
        else
            return null;
    }

    //funciones argregadas
    /**
     * Da el producto sin sacarlo de su expendedor
     * @param i num del producto que sacamos
     * @return producto deseado
     */
    public T askProducto(int i) {
        if (dep.size() > i)
            return dep.get(i);
        else
            return null;
    }
    public int size(){
        return dep.size();
    }
}
