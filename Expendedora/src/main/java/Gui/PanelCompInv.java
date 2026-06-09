package Gui;

import javax.swing.*;
import java.awt.*;

public class PanelCompInv extends JPanel {
    ProxyExp proxy;
    Image imgCo;
    Image imgSp;
    Image imgFa;
    Image imgS8;
    Image imgSn;
    public PanelCompInvBotones botones;

    public PanelCompInv(ProxyExp proxy) {
        this.setLayout(null);
        this.setMinimumSize(new Dimension(460, 220));
        this.setMaximumSize(new Dimension(460, 220));
        this.setPreferredSize(new Dimension(460, 220));

        this.proxy = proxy;
        imgCo = new ImageIcon("DOO_T3/Imagenes/").getImage();
        imgSp = new ImageIcon("DOO_T3/Imagenes/").getImage();
        imgFa = new ImageIcon("DOO_T3/Imagenes/").getImage();
        imgS8 = new ImageIcon("DOO_T3/Imagenes/").getImage();
        imgSn = new ImageIcon("DOO_T3/Imagenes/").getImage();

        botones = new PanelCompInvBotones(proxy);
        botones.setBounds(80, 40, 300, 130);
        this.add(botones);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(196, 196, 190));
        g.fillRect(0, 0, 460, 220);

        g.setColor(new Color(170, 170, 170));
        g.fillRect(10, 0, 440, 210);

        g.setColor((Color.BLACK));
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Inventario:", 179, 24);

        g.setColor(new Color(70, 70, 200));
        g.fillRect(75, 35, 140, 140);
        g.fillRect(245, 35, 140, 140);

        g.setColor(new Color(120, 120, 200));
        g.fillRect(80, 40, 130, 130);
        g.fillRect(250, 40, 130, 130);

        for (int i = 0; i < proxy.ComAct.getInventario().size(); i++) {
            int idenClase = proxy.identificarClase(proxy.ComAct.getInventario().get(i));
            int X;
            if (i == 0) X = 80;
            else X = 250;

            switch (idenClase) {
                case(0):
                    g.drawImage(imgCo, X, 40, 130, 130, null);
                case(1):
                    g.drawImage(imgSp, X, 40, 130, 130, null);
                case(2):
                    g.drawImage(imgFa, X, 40, 130, 130, null);
                case(3):
                    g.drawImage(imgS8, X, 40, 130, 130, null);
                case(4):
                    g.drawImage(imgSn, X, 40, 130, 130, null);
            }
        }
    }
}
