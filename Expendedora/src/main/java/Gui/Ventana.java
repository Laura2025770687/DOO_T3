package Gui;
import javax.swing.*;

/**
 * Ventana la cual inicia los paneles
 */
public class Ventana extends JFrame {
    /**
     * Crea el panel principal
     */
    public Ventana() {
        JPanel a = new PanelPrincipal();
        this.add(a);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Expendedor");
        this.setSize(1000,830);
        this.setVisible(true);
        this.setResizable(false);
    }
}
