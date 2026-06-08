package Gui;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

/**
 *
 */
public class PanelExpVid extends JPanel {
    public PanelExpVid(ProxyExp Proxy){
        this.setMaximumSize(new Dimension(260,400));
        this.add(Box.createRigidArea(new Dimension(260,400)));
        this.setOpaque(false);

        //this.setBorder(new MatteBorder(1,1,1,1,Color.RED));

        this.setToolTipText("Productos");
    }
    @Override
    public void paintComponent(Graphics c){
        super.paintComponent(c);
        ImageIcon Placeholder = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/Vidrio.png").getImage().getScaledInstance(250, 400, Image.SCALE_DEFAULT));
        c.drawImage(Placeholder.getImage(),10,10,null);
    }
}
