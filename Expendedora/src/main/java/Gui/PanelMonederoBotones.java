package Gui;

import javax.swing.*;
import java.awt.*;

/**
 * JPanel que contiene los botones para seleccionar una moneda del monedero del comprador
 */
public class PanelMonederoBotones extends JPanel {
    JButton mon1000 = new JButton();
    JButton mon500 = new JButton();
    JButton mon100 = new JButton();

    /**
     * Método que inicializa el JPanel y añade sus botones, usa Grid Layout en vertical con un área de
     * 55 píxeles de ancho por 260 píxeles de alto para representar los botones para seleccionar moneda.
     * Usa las imágenes de moneda de los recursos del proyecto como iconos para los botones.
     * @param proxy el proxy para conectar los botones con una función lógica cuando se presionan.
     */
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

        mon1000.addActionListener(new ClickBottonExp(100, proxy));
        mon500.addActionListener(new ClickBottonExp(50, proxy));
        mon100.addActionListener(new ClickBottonExp(10, proxy));

        this.add(mon1000);
        this.add(mon500);
        this.add(mon100);
    }
}
