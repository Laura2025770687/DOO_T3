package Gui;
import javax.swing.*;

/**
 * Ventana la cual crea el invetario
 */
public class VentanaExp extends JFrame {
    /**
     * @param Proxy lo hereda al Jpanel inventario
     */
    public VentanaExp(ProxyExp Proxy) {
        JPanel a = new PanelInventario(Proxy);
        Proxy.setInventario(a);
        this.add(a);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Inventario");
        this.setSize(1200,830);
        this.setVisible(true);
        this.setResizable(false);
    }
}
