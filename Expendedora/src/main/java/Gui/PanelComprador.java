package Gui;

import javax.swing.*;
import java.awt.*;

/**
 * JPanel encargado de representar la vista del comprador, contiene:
 * Instrucciones de uso.
 * Monedero del comprador y sus JButtons para seleccionar una moneda.
 * Inventario que contiene los productos comprados y los JButtons para consumirlos
 */
public class PanelComprador extends JPanel {
    PanelCompInv compInv;
    PanelMonedero mon;

    /**
     * Método que inicializa el JPanel (fondo) y añade sus partes (instrucciones, monedero e inventario),
     * usa box layout dividido horizontalmente para separar cada sección.
     * @param Proxy El proxy que comunica al panel con la lógica.
     */
    public PanelComprador(ProxyExp Proxy) {
        this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        this.setMaximumSize(new Dimension(460, 790));

        compInv = new PanelCompInv(Proxy);
        mon = new PanelMonedero(Proxy);

        this.add(new PanelInstrucciones());
        this.add(mon);
        this.add(Box.createRigidArea(new Dimension(0,10)));
        this.add(compInv);
    }

    /**
     * Método que rellena el fondo del color designado (gris claro)
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(190,196,196));
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
}