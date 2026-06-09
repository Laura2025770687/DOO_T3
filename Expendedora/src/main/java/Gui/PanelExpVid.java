package Gui;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

/**
 *  Visualiza el espacio del vidrio en el Expendedor
 *  Parte de PanelExpendedor
 */
public class PanelExpVid extends JPanel {
    /**
     * Intancia un panel translúcido el cual PaintComponent dibuja sobre el
     * @param Proxy permite la comunicacion entre los paneles y la logica
     */
    public PanelExpVid(ProxyExp Proxy){
        this.setMaximumSize(new Dimension(260,400));
        this.add(Box.createRigidArea(new Dimension(260,400)));
        this.setOpaque(false);
        this.setToolTipText("Productos");
    }
    @Override
    public void paintComponent(Graphics c){
        super.paintComponent(c);
        ImageIcon Placeholder = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/Vidrio.png").getImage().getScaledInstance(250, 400, Image.SCALE_DEFAULT));
        c.drawImage(Placeholder.getImage(),10,10,this);
    }
}
