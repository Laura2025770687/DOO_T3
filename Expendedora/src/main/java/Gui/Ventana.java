package Gui;
import javax.swing.*;

/**
 * Ventana la cual inicia los paneles
 */

public class Ventana extends JFrame {
    public Ventana() {
        JPanel a = new PanelPrincipal();
        this.add(a);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setName("Expendedor");
        this.setSize(1080,830);
        this.setVisible(true);
        this.setResizable(false);

    }

}
