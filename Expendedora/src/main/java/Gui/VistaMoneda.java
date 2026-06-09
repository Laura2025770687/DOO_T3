package Gui;
import javax.swing.*;
import java.awt.*;
/**
 * Representacion visual de las Monedas
 * Guarda la serie y el valor del la moneda si es necesario
 */
public class VistaMoneda {
    int Serie;
    int Valor;
    ImageIcon Mon100;
    ImageIcon Mon500;
    ImageIcon Mon1000;
    /**
     * Crea las posibles imagenes que puedan tomar
     * @param x ancho deseado de la imagen
     * @param y altura deseada de la imagen
     */
    public VistaMoneda(int x,int y){ //80 80
        this.Mon100 = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/Moneda100.png").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        this.Mon500 = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/Moneda500.png").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        this.Mon1000 = new ImageIcon(new ImageIcon("DOO_T3/Imagenes/Moneda1000.png").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
    }
    public void setSerie(int num){
        Serie = num;
    }
    public void setValor(int num){
        Valor = num;
    }
    public Image getImagen(int num){
        switch (num){
            case 1:
                return Mon100.getImage();
            case 2:
                return Mon500.getImage();
            case 3:
                return Mon1000.getImage();
        }
        return null;
    }
}
