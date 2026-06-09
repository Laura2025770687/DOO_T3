package Gui;
import javax.swing.*;

/**
 * Ventana la cual inicia los paneles
 */

public class VentanaExp extends JFrame {
    public VentanaExp(ProxyExp Proxy) {
        JPanel a = new PanelInventario(Proxy);
        this.add(a);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Inventario");
        this.setSize(830,830);
        this.setVisible(true);
        this.setResizable(false);
    }

}
