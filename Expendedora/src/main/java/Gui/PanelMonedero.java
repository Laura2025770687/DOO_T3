package Gui;

import javax.swing.*;
import java.awt.*;

/**
 * JPanel que representa el monedero del comprador, incluye:
 * Las vistas de todas las monedas que quedan con su respectivo valor y número de serie.
 * Los botones para seleccionar una moneda
 */
public class PanelMonedero extends JPanel {
    PanelMonederoBotones botones;
    MonedaVisual mon;
    ProxyExp proxy;

    /**
     * Método que inicializa el JPanel y añade los botones para seleccionar una moneda,
     * usa Border Layout en un área de 440 píxeles de ancho por 360 píxeles de alto.
     * @param proxy el proxy que conecta el JPanel con la lógica
     */
    public PanelMonedero(ProxyExp proxy) {
        this.proxy = proxy;
        this.setLayout(new BorderLayout());
        this.setMaximumSize(new Dimension(440, 360));

        botones = new PanelMonederoBotones(proxy);
        this.add(botones, BorderLayout.EAST);
    }

    /**
     * Este método pinta el fondo del monedero, escribe "Monedero:" arriba del área pintada,
     * posiciona cada moneda del inventario del comprador y las pinta según su valor en el área designada.
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(170,170,170));
        g.fillRect(0, 0,470,360);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Monedero:", 175,20);

        for (int i = 0; i < proxy.ComAct.getMonedero(1000).size(); i++) {
            mon = new MonedaVisual(proxy.ComAct.getMonedero(1000).get(i).getValor(),
                    proxy.ComAct.getMonedero(1000).get(i).getSerie());

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
                g.drawString("+" + String.valueOf(proxy.ComAct.getMonedero(1000).size() - 14),
                             14,76);
            }
        }

        for (int i = 0; i < proxy.ComAct.getMonedero(500).size(); i++) {
            mon = new MonedaVisual(proxy.ComAct.getMonedero(500).get(i).getValor(),
                    proxy.ComAct.getMonedero(500).get(i).getSerie());

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
                g.drawString("+" + String.valueOf(proxy.ComAct.getMonedero(500).size() - 14),
                        14,186);
            }
        }

        for (int i = 0; i < proxy.ComAct.getMonedero(100).size(); i++) {
            mon = new MonedaVisual(proxy.ComAct.getMonedero(100).get(i).getValor(),
                    proxy.ComAct.getMonedero(100).get(i).getSerie());

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
                g.drawString("+" + String.valueOf(proxy.ComAct.getMonedero(100).size() - 14),
                        14,296);
            }
        }
    }
}
