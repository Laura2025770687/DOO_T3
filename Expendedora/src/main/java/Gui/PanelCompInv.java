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
        g.fillRect(10,540,480,202);

        g.setColor((Color.BLACK));
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Inventario:", 204,566);

        g.setColor(new Color(70,70,200));
        g.fillRect(100,580,140,140);
        g.fillRect(270,580,140,140);

        g.setColor(new Color(120,120,200));
        g.fillRect(105,585,130,130);
        g.fillRect(275,585,130,130);
    }
}
