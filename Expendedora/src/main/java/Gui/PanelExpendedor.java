package Gui;
import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    JPanel Central;
    public PanelExpendedor(){
        this.setLayout(new BorderLayout());
        this.setMaximumSize(new Dimension(500,1000));

        Central = new JPanel();
        Central.setLayout(new BoxLayout(Central, BoxLayout.LINE_AXIS));
        Central.add(new PanelExpVid()); Central.add(new PanelExpPro());

        JPanel c = new JPanel(); c.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/exptop.png")));
        this.add(c,BorderLayout.NORTH);
        this.add(Central,BorderLayout.CENTER);
        this.add(new PanelExpInv(),BorderLayout.SOUTH);


        this.setVisible(true);
    }
}
