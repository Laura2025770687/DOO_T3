package Gui;
import Logic.*;

import javax.swing.*;

/**
 * info para desarrollar el resto del equipo:
 * La idea es que este proxy funcione como mediador entre PanelCLiente, Panel Expendedor y Consumirdor/Comprador
 * Este proxy se crea al crear Elpanel principal y todos los paneles asociados lo reciben al ser creados
 */

public class ProxyExp {
    Expendedor Expen;
    Moneda MonAct = null;
    Comprador ComAct;
    public ProxyExp(int numProd){
        this.ComAct = new Comprador(17);
        this.Expen = new Expendedor(numProd);
    }

    /**
     * El hacer click en un botton llama a esta funcion, el action listener manda un int de los casos que se pueden pedir
     * - el 0 es para insertar monedas, el cual depende de Panel Cliente (MonAct)
     * - 1-5 tienen los mismos numeros que los productos del expendedor, se deveria crear un consumidor con el MonAct
     * y ComAct
     * - el 6-7 retornan los getter del Consumidor creado y se los mandaria a PanelCliente
     * @param Botton
     */
    public void actionBotton(int Botton){
        switch (Botton){

            case (10):
                seleccionarMonedaDesdeGUI(100);
                break;

            case (50):
                seleccionarMonedaDesdeGUI(500);
                break;

            case (100):
                seleccionarMonedaDesdeGUI(1000);
                break;

            case (0):
                try {
                    Expen.insertarMonedaEnRanura(this.MonAct);
                    this.MonAct = null;

                    JOptionPane.showMessageDialog(null, "Moneda introducida con éxito. Seleccione su producto.", "Expendedor", JOptionPane.INFORMATION_MESSAGE);
                } catch (PagoIncorrectoException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;

            case (1):
                procesarCompra(Constantes.COCACOLA);
                break;

            case (2):
                procesarCompra(Constantes.SPRITE);
                break;

            case (3):
                procesarCompra(Constantes.FANTA);
                break;

            case (4):
                procesarCompra(Constantes.SUPER8);
                break;

            case (5):
                procesarCompra(Constantes.SNICKERS);
                break;

            case (6):
                ComAct.recogerVuelto(Expen);
                int vueltoRecogido = ComAct.getVuelto();

                if (vueltoRecogido > 0) {
                    JOptionPane.showMessageDialog(null,
                            "Has retirado $" + vueltoRecogido + " en monedas de la máquina. ¡Guardadas en tu monedero!",
                            "Ranura de Vuelto",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "La ranura de vuelto está vacía. No hay monedas que retirar.",
                            "Ranura de Vuelto",
                            JOptionPane.WARNING_MESSAGE);
                }
                break;

            case (7):
                try {
                    ComAct.guardarProducto(Expen);

                    JOptionPane.showMessageDialog(null,
                            "¡Producto retirado de la máquina y guardado en tu inventario con éxito! (Espacio utilizado: " + ComAct.getInventario().size() + "/2)",
                            "Inventario",
                            JOptionPane.INFORMATION_MESSAGE);

                } catch (InventarioLlenoException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Mochila Llena", JOptionPane.WARNING_MESSAGE);

                } catch (NoHayProductoException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Ranura Vacía", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case(11):
                break;
            case(12):
                break;
        }
    }

    /**
     * Helper metodológico para gestionar la selección de monedas desde la GUI.
     * Si el usuario ya tenía una moneda en la mano, esta se devuelve automáticamente
     * al monedero antes de extraer la nueva denominación solicitada.
     * * @param valor Denominación de la moneda solicitada ($100, $500, $1000).
     */
    private void seleccionarMonedaDesdeGUI(int valor) {
        if (this.MonAct != null) {
            if (this.MonAct.getValor() == 1000) {
                ComAct.getMonedero(1000).add(this.MonAct);
            } else if (this.MonAct.getValor() == 500) {
                ComAct.getMonedero(500).add(this.MonAct);
            } else if (this.MonAct.getValor() == 100) {
                ComAct.getMonedero(100).add(MonAct);
            }
            this.MonAct = null;
        }

        try {
            this.MonAct = ComAct.seleccionarMoneda(valor);
            JOptionPane.showMessageDialog(null,
                    "Moneda de $" + valor + " seleccionada. ¡Lista para insertar!",
                    "Monedero",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (PagoIncorrectoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error de Fondos", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Procesa la transacción de compra interactuando con el expendedor lógico.
     * Centraliza el flujo de la moneda en la mano y el control visual de excepciones.
     * * @param producto La constante o Enum que identifica la bebida/dulce solicitado.
     */
    private void procesarCompra(Constantes producto) {
        try {
            ComAct.comprarProducto(producto, this.Expen);

            this.MonAct = null;

            JOptionPane.showMessageDialog(null,
                    "¡Compra exitosa! El producto se encuentra en la ranura de entrega.",
                    "Máquina Expendedora",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (PagoInsuficienteException | NoHayProductoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " Por favor retire el dinero", "Saldo Insuficiente", JOptionPane.ERROR_MESSAGE);

            this.MonAct = null;

        } catch (PagoIncorrectoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error en la Compra", JOptionPane.ERROR_MESSAGE);
        }
    }
}
