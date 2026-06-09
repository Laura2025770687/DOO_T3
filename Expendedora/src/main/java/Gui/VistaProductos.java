package Gui;

import javax.swing.*;
import java.awt.*;

public class VistaProductos {
    int Serie;
    int Id;
    ImageIcon Cocacola;
    ImageIcon Sprite;
    ImageIcon Fanta;
    ImageIcon Snickers;
    ImageIcon Super8;
    public VistaProductos(int x,int y){
        this.Cocacola = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/CocaColaProd.png").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        this.Sprite = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/SpriteProd.png").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        this.Fanta = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/FantaProd.png").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        this.Snickers = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/SnickersProd.png").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        this.Super8 = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/Super8Prod.png").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
    }
    public void setSerie(int num){
        Serie = num;
    }
    public void setId(int num){
        Id = num;
    }
    public Image getImagen(int num){
        switch (num){
            case 1:
                return Cocacola.getImage();
            case 2:
                return Sprite.getImage();
            case 3:
                return Fanta.getImage();
            case 4:
                return Snickers.getImage();
            case 5:
                return Super8.getImage();
        }
        return null;
    }
}
