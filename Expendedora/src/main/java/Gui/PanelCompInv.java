package Gui;

import Logic.Producto;

import javax.swing.*;
import java.awt.*;

public class PanelCompInv extends JPanel {
    //Requiere inventario de comprador
    Producto prod;
    public PanelCompInvBotones botones;
    public PanelCompInv(ProxyExp proxy) {
        this.setLayout(null);
        this.setMinimumSize(new Dimension(460,220));
        this.setMaximumSize(new Dimension(460,220));
        this.setPreferredSize(new Dimension(460,220));

        botones = new PanelCompInvBotones(proxy);
        botones.setBounds(80,40,300,130);
        this.add(botones);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(196,196,190));
        g.fillRect(0,0,460,220);

        g.setColor(new Color(170,170,170));
        g.fillRect(10,0,440,210);

        g.setColor((Color.BLACK));
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Inventario:", 179,0);

        g.setColor(new Color(70,70,200));
        g.fillRect(75,35,140,140);
        g.fillRect(245,35,140,140);

        g.setColor(new Color(120,120,200));
        g.fillRect(80,40,130,130);
        g.fillRect(250,40,130,130);
    }
}
