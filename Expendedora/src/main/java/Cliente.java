import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Cliente extends JFrame{
        JPanel panelMain = new JPanel();
        JPanel Client = new JPanel();
        JLabel labelPH = new JLabel();
        JLabel labelExp = new JLabel();
        public Cliente() {
            this.setSize(1900, 1000);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setName("Expendedor");

            this.setLayout(new GridLayout(1,3));
            panelMain.setSize(1200,1000);
            this.add(panelMain);
            JPanel a = new JPanel(); a.setSize(200,1000); a.setBackground(Color.blue);
            this.add(a);
            this.add(new GuiCliente());

            ImageIcon PlaceHolder = new ImageIcon("DOO_T3/Imagenes/PlaceHolder.gif");
            ImageIcon picExp = new ImageIcon("Expendedora.gif");
            labelPH.setIcon(PlaceHolder);
            labelExp.setIcon(picExp);

            panelMain.setLayout(new GridLayout(3,1));
            JPanel b = new JPanel(); b.setSize(1200,200); b.add(labelPH);
            panelMain.add(b);
            panelMain.add(new GuiExpendedor());
            panelMain.add(b);

            this.setVisible(true);
        }
}
