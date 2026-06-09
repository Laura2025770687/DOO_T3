package Gui;
import javax.swing.*;
import java.awt.*;

/**
 * JPanel principal que conecta y crea un JPanel que representa a la máquina expendedora
 * y otro que representa las vistas del comprador
 */
public class PanelPrincipal extends JPanel{
    PanelExpendedor ExpP;
    PanelComprador ComP;
    ProxyExp Proxy;
    int CantExp;

    /**
     * 
     */
    public PanelPrincipal() {
        this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        CantExp = Integer.valueOf(JOptionPane.showInputDialog("Cantidad de Productos:"));
        this.Proxy = new ProxyExp(CantExp);

        int ConAc=1;
        Object[] Acceso = {"SI", "NO"};
        ConAc = JOptionPane.showOptionDialog(null, "Tienes acceso a inventario?", "Acceso", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Acceso, Acceso[0]);
        if (ConAc==0) {
            JFrame b = new VentanaExp(Proxy);
        }

        this.ExpP = new PanelExpendedor(Proxy);
        ExpP.setMaximumSize(new Dimension(460,790));
        ExpP.setMinimumSize(new Dimension(460,790));
        ExpP.setOpaque(false);
        ExpP.setBackground(new Color(0,0,0,0));
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
