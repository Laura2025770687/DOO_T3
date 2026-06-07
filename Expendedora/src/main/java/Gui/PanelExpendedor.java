package Gui;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

/**
 *
 */
public class PanelExpendedor extends JPanel {
    JPanel Central;
    PanelExpInv Inventario;
    PanelExpVid Vidrio;
    PanelExpPro Productos;
    public PanelExpendedor(ProxyExp Proxy){
        this.setOpaque(false);
        //this.setMaximumSize(new Dimension(460,790));
        this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));

        Vidrio = new PanelExpVid(Proxy); Productos = new PanelExpPro(Proxy);
        Vidrio.setMaximumSize(new Dimension(260,400));
        Productos.setMaximumSize(new Dimension(200,400));

        //this.setBorder(new MatteBorder(1,1,1,1,Color.RED));

        Central = new JPanel();

        Central.setMaximumSize(new Dimension(460,400));
        Central.setMinimumSize(new Dimension(460,400));
        Central.setOpaque(false);
        //Central.setBackground(Color.GREEN);
        Central.setLayout(new BorderLayout());
        Central.add(Vidrio,BorderLayout.WEST); Central.add(Productos,BorderLayout.CENTER);

        Inventario = new PanelExpInv(Proxy);
        Inventario.setMaximumSize(new Dimension(460,200)); //not very usefull

        this.add(Box.createRigidArea(new Dimension(460,170)),BorderLayout.NORTH);
        this.add(Central,BorderLayout.CENTER);
        this.add(Inventario,BorderLayout.SOUTH);
    }
    @Override
    public void paintComponent(Graphics a){
        super.paintComponent(a);
        repaint();
        ImageIcon ExpIm = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/Expendedora.png").getImage().getScaledInstance(460, 790, Image.SCALE_DEFAULT));
        a.drawImage(ExpIm.getImage(),0,0, this);
        //Vidrio.paintComponent(a);
        //Inventario.paintComponent(a);
        //Productos.paintComponent(a);
    }
}
