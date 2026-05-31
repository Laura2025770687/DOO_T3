package Gui;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class PanelExpVid extends JPanel {
    public PanelExpVid(ProxyExp Proxy){
        this.setMaximumSize(new Dimension(500,500));
        this.setBackground(new Color(190,196,196));
        this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        this.setVisible(true);
        this.setToolTipText("Productos");

        ImageIcon Placeholder = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/PlaceHolder.gif").getImage().getScaledInstance(270, 450, Image.SCALE_DEFAULT));
        this.add(new JLabel(Placeholder));
    }
}
