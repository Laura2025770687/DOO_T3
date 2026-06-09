package Gui;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

/**
 * Panel donde se guardan los botones
 * Con un proxy los botones mandan la información al expendedor y
 * al Cliente
 */
public class PanelExpPro extends JPanel {
    JButton Monedas = new JButton();
    JButton Cocacola = new JButton();
    JButton Sprite = new JButton();
    JButton Fanta = new JButton();
    JButton Snickers = new JButton();
    JButton Super8 = new JButton();
    JButton Vuelto = new JButton();
    JButton Producto = new JButton();
    public PanelExpPro(ProxyExp Proxy){
        this.setMaximumSize(new Dimension(200,400));
        this.setMinimumSize(new Dimension(200,400));
        this.setLayout(new GridLayout(8,1));
        this.setBorder(BorderFactory.createEmptyBorder(20, 5, 20, 5));

        //this.setBorder(new MatteBorder(1,1,1,1,Color.RED));
        this.setOpaque(false);
        this.setBackground(Color.BLUE);

        Monedas.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/CasillaMon.png")));
        Cocacola.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Cocacola.png")));
        Sprite.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Sprite.png")));
        Fanta.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Fanta.png")));
        Snickers.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Snickers.png")));
        Super8.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Super8.png")));
        Vuelto.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Vuelto.png")));
        Producto.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Producto.png")));

        Monedas.setToolTipText("Meter monedas");
        Cocacola.setToolTipText("Comprar Cocacola");
        Sprite.setToolTipText("Comprar Sprite");
        Fanta.setToolTipText("Comprar Fanta");
        Snickers.setToolTipText("Comprar Snickers");
        Super8.setToolTipText("Comprar Super8");
        Vuelto.setToolTipText("Sacar Vuelto");
        Producto.setToolTipText("Sacar Producto");

        Monedas.addActionListener(new ClickBottonExp(0,Proxy));
        Cocacola.addActionListener(new ClickBottonExp(1,Proxy));
        Sprite.addActionListener(new ClickBottonExp(2,Proxy));
        Fanta.addActionListener(new ClickBottonExp(3,Proxy));
        Snickers.addActionListener(new ClickBottonExp(4,Proxy));
        Super8.addActionListener(new ClickBottonExp(5,Proxy));
        Vuelto.addActionListener(new ClickBottonExp(6,Proxy));
        Producto.addActionListener(new ClickBottonExp(7,Proxy));

        this.add(Monedas);
        this.add(Cocacola);
        this.add(Sprite);
        this.add(Fanta);
        this.add(Snickers);
        this.add(Super8);
        this.add(Vuelto);
        this.add(Producto);

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
