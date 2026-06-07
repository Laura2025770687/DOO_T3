package Gui;
import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    PanelCompInv compInv;
    PanelMonedero mon;
    public PanelComprador(ProxyExp Proxy) {
        this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        this.setMaximumSize(new Dimension(470, 790));

        compInv = new PanelCompInv(Proxy);
        mon = new PanelMonedero(Proxy);

        this.add(new PanelInstrucciones(Proxy));
        this.add(mon);
        this.add(Box.createRigidArea(new Dimension(0,10)));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(190,196,196));
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        //Requiere deposito de monedas
        //Requiere inventario de comprador
        //mon.paintComponent(g);
        g.setColor(new Color(170,170,170));
        compInv.paintComponent(g);
    }
    //public void paintComponent(Graphics g){
       //super.paintComponent(g);
    //}
}