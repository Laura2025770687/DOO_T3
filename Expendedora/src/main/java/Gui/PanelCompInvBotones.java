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

        // Tooltips para indicarle al usuario qué hace el click invisible
        consumir1.setToolTipText("Consumir primer producto del inventario");
        consumir2.setToolTipText("Consumir segundo producto del inventario");

        // Conexion con el proxy
        consumir1.addActionListener(new ClickBottonExp(11, proxy));
        consumir2.addActionListener(new ClickBottonExp(12, proxy));

        this.add(consumir1);
        this.add(consumir2);
    }
}
