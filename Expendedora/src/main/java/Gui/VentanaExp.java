package Gui;
import javax.swing.*;

/**
 * Ventana la cual inicia los paneles
 */

public class VentanaExp extends JFrame {
    public VentanaExp(ProxyExp Proxy) {
        JPanel a = new PanelInventario(Proxy);
        Proxy.setInventario(a);
        this.add(a);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Inventario");
        this.setSize(800,830);
        this.setVisible(true);
        this.setResizable(false);
    }

}
