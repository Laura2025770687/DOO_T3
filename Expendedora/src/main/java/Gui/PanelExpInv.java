package Gui;

import javax.swing.*;
import java.awt.*;

/**
 * Si el cliente es administrador puede ver el inventario
 * mueste un panel u otro dependiendo de la respuesta
 * (por ahora un placeholder)
 */
public class PanelExpInv extends JPanel {
    public PanelExpInv(ProxyExp Proxy){
        this.setBackground(new Color(190,196,196));
        this.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        Object[] Acesso = {"SI", "NO"};
        int ConAc = JOptionPane.showOptionDialog(null, "Tienes acceso a invertario?", "Acceso", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Acesso, Acesso[0]);
    if (ConAc==0){
        ImageIcon Placeholder = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/PlaceHolder.gif").getImage().getScaledInstance(480, 230, Image.SCALE_DEFAULT));
        JLabel Inventario = new JLabel(Placeholder);
        Inventario.setToolTipText("Inventario");
        this.add(Inventario);
    }
    else {
        ImageIcon explow = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/explow.png").getImage().getScaledInstance(500, 140, Image.SCALE_DEFAULT));
        this.add(new JLabel(explow));
    }
    }
}
