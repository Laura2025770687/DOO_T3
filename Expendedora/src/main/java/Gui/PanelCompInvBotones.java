package Gui;

import javax.swing.*;
import java.awt.*;

/**
 * JPanel que crea los JButtons para consumir los productos en sus respectivas ranuras del
 * inventario del comprador
 */
public class PanelCompInvBotones extends JPanel {
    public JButton consumir1 = new JButton();
    public JButton consumir2 = new JButton();

    /**
     * Método que inicializa el JPanel y añade sus botones invisibles para consumir los productos.
     * Usa Grid Layout para los botones con una separación horizontal de 40 píxeles
     * para que se alinee con las ranuras del inventario (cuadros azules)
     * @param proxy el proxy que conecta el presionar un JButton con una función dentro de la lógica
     */
    public PanelCompInvBotones(ProxyExp proxy) {
        this.setLayout(new GridLayout(1,2,40,0));
        this.setOpaque(false);

        consumir1.setContentAreaFilled(false);
        consumir1.setBorderPainted(false);

        consumir2.setContentAreaFilled(false);
        consumir2.setBorderPainted(false);

        consumir1.setToolTipText("Consumir primer producto del inventario");
        consumir2.setToolTipText("Consumir segundo producto del inventario");

        consumir1.addActionListener(new ClickBottonExp(11, proxy));
        consumir2.addActionListener(new ClickBottonExp(12, proxy));

        this.add(consumir1);
        this.add(consumir2);
    }
}
