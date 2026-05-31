package Gui;
import javax.swing.*;

public class PanelExpPro extends JPanel {
    JButton Cocacola = new JButton();
    JButton Sprite = new JButton();
    JButton Fanta = new JButton();
    JButton Snickers = new JButton();
    JButton Super8 = new JButton();
    JButton Vuelto = new JButton();
    JButton Producto = new JButton();
    public PanelExpPro(){
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.setBorder(BorderFactory.createEmptyBorder(20, 5, 20, 5));
        Cocacola.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Cocacola.png")));
        Cocacola.setToolTipText("Comprar Cocacola");
        Sprite.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Sprite.png")));
        Sprite.setToolTipText("Comprar Sprite");
        Fanta.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Fanta.png")));
        Fanta.setToolTipText("Comprar Fanta");
        Snickers.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Snickers.png")));
        Snickers.setToolTipText("Comprar Snickers");
        Super8.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Super8.png")));
        Super8.setToolTipText("Comprar Super8");
        Vuelto.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Vuelto.png")));
        Vuelto.setToolTipText("Sacar Vuelto");
        Producto.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Producto.png")));
        Producto.setToolTipText("Sacar Producto");
        this.add(Cocacola);
        this.add(Sprite);
        this.add(Fanta);
        this.add(Snickers);
        this.add(Super8);
        this.add(Vuelto);
        this.add(Producto);
    }
}
