package Gui;

import Logic.Producto;

import javax.swing.*;
import java.awt.*;

public class PanelCompInv extends JPanel {
    //Requiere inventario de comprador
    Producto prod;
    public PanelCompInv(ProxyExp proxy) {
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(170,170,170));
        g.fillRect(10,540,440,202);

        g.setColor((Color.BLACK));
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Inventario:", 179,566);

        g.setColor(new Color(70,70,200));
        g.fillRect(75,580,140,140);
        g.fillRect(245,580,140,140);

        g.setColor(new Color(120,120,200));
        g.fillRect(80,585,130,130);
        g.fillRect(250,585,130,130);
    }
}
