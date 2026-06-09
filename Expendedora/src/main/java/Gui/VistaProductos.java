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
        this.Cocacola = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/Pcoca.jpg").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        this.Sprite = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/Psprite.jpg").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        this.Fanta = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/Pfanta.png").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        this.Snickers = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/Psnickers.png").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        this.Super8 = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/Psuper8.png").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
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
