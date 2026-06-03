package Gui;
import javax.swing.*;
import java.awt.*;

/**
 * Esqueleto de panel cliente parte integrante 2
 */
public class PanelComprador extends JPanel {
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    public PanelComprador(ProxyExp Proxy) {
        this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        this.setMaximumSize(new Dimension(470, 790));
        this.setBackground(new Color(190,196,196));

        panel2.setBackground(Color.cyan);
        panel3.setBackground(Color.blue);

        this.add(new PanelInstrucciones(Proxy));
        this.add(panel2);
        this.add(panel3);
    }
}