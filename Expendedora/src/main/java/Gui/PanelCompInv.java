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
        imgCo = new ImageIcon("DOO_T3/Imagenes/CocaColaProd.png").getImage();
        imgSp = new ImageIcon("DOO_T3/Imagenes/SpriteProd.png").getImage();
        imgFa = new ImageIcon("DOO_T3/Imagenes/FantaProd.png").getImage();
        imgS8 = new ImageIcon("DOO_T3/Imagenes/Super8Prod.png").getImage();
        imgSn = new ImageIcon("DOO_T3/Imagenes/SnickersProd.png").getImage();

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
            if (i == 0) X = 70;
            else X = 239;

            switch (idenClase) {
                case(0):
                    g.drawImage(imgCo, X - 5, 26, 160, 160, null);
                    break;
                case(1):
                    g.drawImage(imgSp, X - 5, 26, 160, 160, null);
                    break;
                case(2):
                    g.drawImage(imgFa, X - 5, 26, 160, 160, null);
                    break;
                case(3):
                    g.drawImage(imgS8, X - 1, 31, 150, 150, null);
                    break;
                case(4):
                    g.drawImage(imgSn, X - 1, 31, 150, 150, null);
                    break;
            }
        }
    }
}
