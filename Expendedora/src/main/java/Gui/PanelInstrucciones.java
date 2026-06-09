package Gui;

import javax.swing.*;
import java.awt.*;

/**
 * JPanel que presenta las instrucciones de uso de la máquina expendedora
 */
public class PanelInstrucciones extends JPanel {
    /**
     * Método que inicializa el JPanel y añade el texto de las instrucciones,
     * usa Box Layout dividido horizontalmente en un área de 470 píxeles de ancho por 170 píxeles de alto.
     */
    public PanelInstrucciones() {
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.setMaximumSize(new Dimension(470,170));
        this.setBackground(new Color(190,196,196));

        JLabel titulo = new JLabel("Instrucciones");
        JLabel instr1 = new JLabel("1. Seleccione una moneda de su monedero");
        JLabel instr2 = new JLabel("2. Inserte la moneda a la máquina");
        JLabel instr3 = new JLabel("3. Seleccione su producto");
        JLabel instr4 = new JLabel("4. Retire su vuelto y el producto");

        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        instr1.setAlignmentX(Component.CENTER_ALIGNMENT);
        instr2.setAlignmentX(Component.CENTER_ALIGNMENT);
        instr3.setAlignmentX(Component.CENTER_ALIGNMENT);
        instr4.setAlignmentX(Component.CENTER_ALIGNMENT);

        titulo.setFont(new Font("Arial", Font.BOLD, 32));
        instr1.setFont(new Font("Arial", Font.BOLD, 20));
        instr2.setFont(new Font("Arial", Font.BOLD, 20));
        instr3.setFont(new Font("Arial", Font.BOLD, 20));
        instr4.setFont(new Font("Arial", Font.BOLD, 20));

        this.add(Box.createRigidArea(new Dimension(0,12)));
        this.add(titulo);
        this.add(Box.createRigidArea(new Dimension(0, 10)));
        this.add(instr1);
        this.add(instr2);
        this.add(instr3);
        this.add(instr4);
        this.add(Box.createRigidArea(new Dimension(0, 20)));
    }
}
