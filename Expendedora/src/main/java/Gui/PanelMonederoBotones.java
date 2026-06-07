package Gui;

import javax.swing.*;
import java.awt.*;

public class PanelMonederoBotones extends JPanel {
    JButton mon1000 = new JButton();
    JButton mon500 = new JButton();
    JButton mon100 = new JButton();
    public PanelMonederoBotones(ProxyExp proxy) {
        this.setPreferredSize(new Dimension(55,260));
        this.setBorder(BorderFactory.createEmptyBorder(22,0,0,0));
        this.setLayout(new GridLayout(3,1));
        this.setBackground(new Color(170,170,170));

        mon1000.setIcon(new ImageIcon("DOO_T3/Imagenes/Moneda1000.png"));
        mon500.setIcon(new ImageIcon("DOO_T3/Imagenes/Moneda500.png"));
        mon100.setIcon(new ImageIcon("DOO_T3/Imagenes/Moneda100.png"));

        mon1000.setToolTipText("Insertar moneda de 1000");
        mon500.setToolTipText("Insertar moneda de 500");
        mon100.setToolTipText("Insertar moneda de 100");

        // Coneccion con el proxy
        // Asignacion IDs únicos que el switch del Proxy pueda interceptar
        mon1000.addActionListener(new ClickBottonExp(100, proxy)); // ID 100 para la de $1000
        mon500.addActionListener(new ClickBottonExp(50, proxy));   // ID 50 para la de $500
        mon100.addActionListener(new ClickBottonExp(10, proxy));   // ID 10 para la de $100

        this.add(mon1000);
        this.add(mon500);
        this.add(mon100);
    }
}
