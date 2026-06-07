package Gui;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

/**
 * Si el cliente es administrador puede ver el inventario
 * mueste un panel u otro dependiendo de la respuesta
 * (por ahora un placeholder)
 */
public class PanelExpInv extends JPanel {
    int ConAc=1;
    public PanelExpInv(ProxyExp Proxy){
        //this.setMaximumSize(new Dimension(450,200));
        this.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        this.add(Box.createRigidArea(new Dimension(440,190)));
        this.setOpaque(false);

        //this.setBackground(Color.GREEN);
        //this.setBorder(new MatteBorder(1,1,1,1,Color.RED));

        Object[] Acceso = {"SI", "NO"};
        ConAc = JOptionPane.showOptionDialog(null, "Tienes acceso a inventario?", "Acceso", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Acceso, Acceso[0]);
    }
    @Override
    public void paintComponent(Graphics b) {
        super.paintComponent(b);
        if (ConAc==0) {
            ImageIcon Placeholder = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/PlaceHolder.png").getImage().getScaledInstance(430, 180, Image.SCALE_DEFAULT));
            b.drawImage(Placeholder.getImage(), 10, 10,this);
        }
    }
}
