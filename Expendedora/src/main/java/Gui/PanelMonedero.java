package Gui;

import javax.swing.*;
import java.awt.*;

public class PanelMonedero extends JPanel {
    PanelMonederoBotones botones;
    PanelMonedero(ProxyExp proxy) {
        this.setLayout(new BorderLayout());
        this.setMaximumSize(new Dimension(440, 360));

        botones = new PanelMonederoBotones(proxy);

        this.add(botones, BorderLayout.EAST);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(170,170,170));
        g.fillRect(0, 0,470,360);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Monedero:", 175,20);

        //Requiere depósito de monedas
    }
}
