package Gui;
import javax.swing.*;
import java.awt.*;

/**
 * Panel principal
 */
public class PanelPrincipal extends JPanel{
        PanelExpendedor ExpP;
        PanelComprador ComP;
        public PanelPrincipal() {
            this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));

            this.ExpP = new PanelExpendedor();
            ExpP.setMaximumSize(new Dimension(500,1000));
            ExpP.setMinimumSize(new Dimension(500,1000));
            this.add(ExpP);

            this.add(Box.createRigidArea(new Dimension(20,0)));

            this.ComP = new PanelComprador();
            ComP.setMaximumSize(new Dimension(500,1000));
            ComP.setMinimumSize(new Dimension(500,1000));
            this.add(ComP);

            this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            this.setBackground(new Color(180,198,220));
        }
}
