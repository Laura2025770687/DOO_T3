import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    JButton Cocacola = new JButton();
    JButton Sprite = new JButton();
    JButton Fanta = new JButton();
    JButton Snicker = new JButton();
    JButton Super8 = new JButton();
    JButton Vuelto = new JButton();
    JButton Producto = new JButton();
    JPanel Vidrio = new JPanel();
    JPanel Productos = new JPanel();
    public PanelExpendedor(){
        this.setLayout(new GridLayout(1,2));
        this.add(Vidrio); Vidrio.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/PlaceHolder.gif")));
        this.add(Productos);
        Productos.setLayout(new GridLayout(7,1));
        Productos.setSize(100,500);
        Cocacola.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Cocacola.png")));
        Sprite.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Sprite.png")));
        Fanta.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Fanta.png")));
        Snicker.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Snickers.png")));
        Super8.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Super8.png")));
        Vuelto.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Vuelto.png")));
        Producto.add(new JLabel(new ImageIcon("DOO_T3/Imagenes/Producto.png")));
        Productos.add(Cocacola);
        Productos.add(Sprite);
        Productos.add(Fanta);
        Productos.add(Snicker);
        Productos.add(Super8);
        Productos.add(Vuelto);
        Productos.add(Producto);



    }
}
