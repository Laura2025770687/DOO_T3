import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel{
        JPanel panelMain = new JPanel();
        JLabel labelPH = new JLabel();
        JLabel labelExp = new JLabel();
        public PanelPrincipal() {
            ImageIcon PlaceHolder = new ImageIcon("DOO_T3/Imagenes/PlaceHolder.gif");
            ImageIcon picExp = new ImageIcon("DOO_T3/Imagenes/Expendedora.gif");

            this.add(panelMain);

            this.add(new PanelComprador());
            GridLayout a = new GridLayout(); a.setHgap(200);
            this.setLayout(new GridLayout(1,2));

            labelPH.setIcon(PlaceHolder);
            labelExp.setIcon(picExp);

            panelMain.setLayout(new GridLayout(3,1));
            JPanel b = new JPanel(); b.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/PlaceHolder.gif")));
            JPanel c = new JPanel(); c.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/PlaceHolder.gif")));
            panelMain.add(b);
            panelMain.add(new PanelExpendedor());
            panelMain.add(c);

            this.setVisible(true);
        }
}
