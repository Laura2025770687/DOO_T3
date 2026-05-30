import javax.swing.*;
import java.awt.*;

/**
 * Esqueleto de panel cliente parte integrante 2
 */
public class PanelComprador extends JPanel {
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    public PanelComprador(){
        this.setLayout(new GridLayout(3,1));
        panel1.setBackground(Color.green); panel1.add(new JLabel("Cliente 1"));
        panel2.setBackground(Color.cyan); panel2.add(new JLabel("Cliente 2"));
        panel3.setBackground(Color.blue); panel3.add(new JLabel("Cliente 3"));
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
    }
}