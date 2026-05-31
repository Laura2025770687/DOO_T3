package Gui;

import javax.swing.*;

public class PanelExpInv extends JPanel {
    public PanelExpInv(){
    Object[] Acesso = {"SI", "NO"};
    int ConAc = JOptionPane.showOptionDialog(null, "Tienes acceso a invertario?", "Acceso", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Acesso, Acesso[0]);
    if (ConAc==0){
        this.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/PlaceHolder.gif")));
    }
    else {
        this.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/explow.png")));
    }
    }
}
