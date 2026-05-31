package Gui;
import Logic.*;

/**
 * info para desarrollar el resto del equipo:
 * La idea es que este proxy funcione como mediador entre PanelCLiente, Panel Expendedor y Consumirdor/Comprador
 * Este proxy se crea al crear Elpanel principal y todos los paneles asociados lo reciben al ser creados
 */

public class ProxyExp {
    Expendedor Expen;
    Moneda MonAct = null;
    Comprador ComAct = null;
    public ProxyExp(int num){
        this.Expen = new Expendedor(num);
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


}
