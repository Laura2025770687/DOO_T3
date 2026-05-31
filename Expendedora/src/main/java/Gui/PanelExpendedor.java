package Gui;
import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class PanelExpendedor extends JPanel {
    JPanel Central;
    public PanelExpendedor(ProxyExp Proxy){
        this.setLayout(new BorderLayout());
        this.setMaximumSize(new Dimension(500,1000));

        Central = new JPanel();
        Central.setLayout(new BoxLayout(Central, BoxLayout.LINE_AXIS));
        Central.setBackground(new Color(190,196,196));
        Central.add(new PanelExpVid(Proxy)); Central.add(new PanelExpPro(Proxy));

        ImageIcon exptop = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/exptop.png").getImage().getScaledInstance(500, 150, Image.SCALE_DEFAULT));
        JPanel c = new JPanel(); c.add(new JLabel(exptop)); c.setBackground(new Color(190,196,196));

        this.add(c,BorderLayout.NORTH);
        this.add(Central,BorderLayout.CENTER);
        this.add(new PanelExpInv(Proxy),BorderLayout.SOUTH);


        this.setVisible(true);
    }
}
