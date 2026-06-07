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
        this.ComAct = new Comprador(5);
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

            case (1):

            case (2):

            case (3):

            case (4):

            case (5):

            case (6):

            case (7):

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
            ComAct.getMonedero().add(this.MonAct);
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
}
