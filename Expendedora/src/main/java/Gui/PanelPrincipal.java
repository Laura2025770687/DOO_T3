package Gui;
import javax.swing.*;
import java.awt.*;

/**
 * JPanel principal que conecta y crea un JPanel que representa a la máquina expendedora
 * y otro que representa las vistas del comprador
 * además crea una ventana la cual representa el inventario
 */
public class PanelPrincipal extends JPanel{
    PanelExpendedor ExpP;
    PanelComprador ComP;
    ProxyExp Proxy;
    int CantExp;
    /**
     * Se crea un proxy el cual cada panel lo instancia en sus
     * componetes y los componentes de ellos
     * Crea el Jframe cual representa el deposito
     */
    public PanelPrincipal() {
        this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        CantExp = Integer.valueOf(JOptionPane.showInputDialog("Cantidad de Productos:"));
        this.Proxy = new ProxyExp(CantExp);
        JFrame b = new VentanaExp(Proxy);

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
