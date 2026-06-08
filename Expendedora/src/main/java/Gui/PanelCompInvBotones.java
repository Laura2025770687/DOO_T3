package Gui;

import javax.swing.*;
import java.awt.*;

public class PanelCompInvBotones extends JPanel {
    public JButton consumir1 = new JButton();
    public JButton consumir2 = new JButton();
    public PanelCompInvBotones(ProxyExp proxy) {
        this.setLayout(new GridLayout(1,2,40,0));
        this.setOpaque(false);

        consumir1.setContentAreaFilled(false);
        consumir1.setBorderPainted(false);

        consumir2.setContentAreaFilled(false);
        consumir2.setBorderPainted(false);

        this.add(consumir1);
        this.add(consumir2);
    }
}
