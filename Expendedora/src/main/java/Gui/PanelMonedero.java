package Gui;

import Logic.Moneda;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelMonedero extends JPanel {
    PanelMonederoBotones botones;
    MonedaVisual mon;
    ProxyExp proxy;
    ArrayList<Moneda> monedero1000;
    ArrayList<Moneda> monedero500;
    ArrayList<Moneda> monedero100;
    PanelMonedero(ProxyExp proxy) {
        this.proxy = proxy;
        this.monedero1000 = proxy.ComAct.getMonedero(1000);
        this.monedero500 = proxy.ComAct.getMonedero(500);
        this.monedero100 = proxy.ComAct.getMonedero(100);
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

        for (int i = 0; i < monedero1000.size(); i++) {
            mon = new MonedaVisual(proxy, monedero1000.get(i).getValor(),
                                   monedero1000.get(i).getSerie());

            g.setColor(new Color(255,255,0));
            if (i < 7) {
                mon.setXY(388 - (i + 1) * 50, 24);
                mon.paintComponent(g);
            } else if (i < 14) {
                mon.setXY(388 - (i - 6) * 50, 74);
                mon.paintComponent(g);
            } else {
                g.setColor(Color.BLACK);
                g.setFont(new Font("Arial", Font.BOLD, 12));
                g.drawString("+" + String.valueOf(monedero1000.size() - 14),
                             14,76);
            }
        }

        for (int i = 0; i < monedero500.size(); i++) {
            mon = new MonedaVisual(proxy, monedero500.get(i).getValor(),
                                   monedero500.get(i).getSerie());

            g.setColor(new Color(128,128,128));
            if (i < 7) {
                mon.setXY(388 - (i + 1) * 50, 134);
                mon.paintComponent(g);
            } else if (i < 14) {
                mon.setXY(388 - (i - 6) * 50, 184);
                mon.paintComponent(g);
            } else {
                g.setColor(Color.BLACK);
                g.setFont(new Font("Arial", Font.BOLD, 12));
                g.drawString("+" + String.valueOf(monedero500.size() - 14),
                        14,186);
            }
        }

        for (int i = 0; i < monedero100.size(); i++) {
            mon = new MonedaVisual(proxy, monedero100.get(i).getValor(),
                                   monedero100.get(i).getSerie());

            g.setColor(new Color(175,115,85));
            if (i < 7) {
                mon.setXY(388 - (i + 1) * 50, 244);
                mon.paintComponent(g);
            } else if (i < 14) {
                mon.setXY(388 - (i - 6) * 50, 294);
                mon.paintComponent(g);
            } else {
                g.setColor(Color.BLACK);
                g.setFont(new Font("Arial", Font.BOLD, 12));
                g.drawString("+" + String.valueOf(monedero100.size() - 14),
                        14,296);
            }
        }
    }
}
