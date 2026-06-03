package Gui;

import javax.swing.*;
import java.awt.*;

public class PanelInstrucciones extends JPanel {
    public PanelInstrucciones(ProxyExp Proxy) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setMaximumSize(new Dimension(470,100));
        this.setBackground(new Color(190,196,196));

        JLabel titulo = new JLabel("Instrucciones");
        JLabel instr1 = new JLabel("1. Inserte una moneda a la máquina");
        JLabel instr2 = new JLabel("2. Seleccione su producto");
        JLabel instr3 = new JLabel("3. Retire el producto");

        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        instr1.setAlignmentX(Component.CENTER_ALIGNMENT);
        instr2.setAlignmentX(Component.CENTER_ALIGNMENT);
        instr3.setAlignmentX(Component.CENTER_ALIGNMENT);

        titulo.setFont(new Font("Arial", Font.BOLD, 34));
        instr1.setFont(new Font("Arial", Font.BOLD, 22));
        instr2.setFont(new Font("Arial", Font.BOLD, 22));
        instr3.setFont(new Font("Arial", Font.BOLD, 22));

        this.add(Box.createRigidArea(new Dimension(0,20)));
        this.add(titulo);
        this.add(Box.createRigidArea(new Dimension(0, 12)));
        this.add(instr1);
        this.add(instr2);
        this.add(instr3);
        this.add(Box.createRigidArea(new Dimension(0, 20)));
    }
}
