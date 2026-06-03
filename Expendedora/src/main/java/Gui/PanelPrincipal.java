package Gui;
import javax.swing.*;
import java.awt.*;

/**
 * Panel principal
 * Este crea tanto PanelCliente y PanelExpendedor y los ordena
 *
 */
public class PanelPrincipal extends JPanel{
        PanelExpendedor ExpP;
        PanelComprador ComP;
        ProxyExp Proxy;
        int CantExp;
        public PanelPrincipal() {
            this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
            /**
             * Creamos el proxy para implementarlo al agregar paneles con listeners
             */
            CantExp = Integer.valueOf(JOptionPane.showInputDialog("Cantidad de Productos:"));
            this.Proxy = new ProxyExp(CantExp);

            this.ExpP = new PanelExpendedor(Proxy);
            ExpP.setMaximumSize(new Dimension(460,790));
            ExpP.setMinimumSize(new Dimension(460,790));
            this.add(ExpP);

            this.add(Box.createRigidArea(new Dimension(20,0)));

            this.ComP = new PanelComprador(Proxy);
            ComP.setMaximumSize(new Dimension(460,790));
            ComP.setMinimumSize(new Dimension(460,790));
            this.add(ComP);

            this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            this.setBackground(new Color(180,198,220));
        }
}
