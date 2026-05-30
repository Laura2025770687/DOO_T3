import javax.swing.*;
import java.awt.*;

public class GuiCliente extends JPanel {
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    public GuiCliente(){
        this.setSize(500,1000);
        this.setLayout(new GridLayout(3,1));
        panel1.setBackground(Color.green);
        panel2.setBackground(Color.cyan);
        panel3.setBackground(Color.blue);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
    }
}