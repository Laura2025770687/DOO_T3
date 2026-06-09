package Gui;

import javax.swing.*;
import java.awt.*;

/**
 * Si el cliente es administrador puede ver el inventario
 * mueste un panel u otro dependiendo de la respuesta
 * (por ahora un placeholder)
 */
public class PanelInventario extends JPanel {
    int ConAc=1;
    JLabel PanPrincipal;
    JPanel PanCoca;
    JPanel PanSprite;
    JPanel PanFanta;
    JPanel PanSnickers;
    JPanel PanSuper8;
    JPanel Inv = new JPanel();
    public PanelInventario(ProxyExp Proxy){
        this.setLayout(new BorderLayout());
        this.PanPrincipal = new JLabel();
        PanPrincipal.setText("Cocacola: "+ Proxy.askDeposito(1).size() +"\n Sprite: ");
    }
    @Override
    public void paintComponent(Graphics b) {
        super.paintComponent(b);

        }
}
