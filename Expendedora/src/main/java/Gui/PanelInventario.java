package Gui;

import Logic.CocaCola;

import javax.swing.*;
import java.awt.*;

/**
 * Si el cliente es administrador puede ver el inventario
 * mueste un panel u otro dependiendo de la respuesta
 * (por ahora un placeholder)
 */
public class PanelInventario extends JPanel {
    int ConAc=1;
    ProxyExp Proxy;
    JLabel PanPrincipal;
    VistaProductos Bebidas;
    VistaProductos Snacks;
    VistaMoneda Monedas;
    public PanelInventario(ProxyExp Proxy){
        this.setBackground(new Color(180,198,220));
        this.PanPrincipal = new JLabel();
        this.add(PanPrincipal);
        this.PanPrincipal.setSize(new Dimension(500,200));
        this.PanPrincipal.setBackground(new Color(220,220,220));
        this.Proxy = Proxy;
        this.Bebidas = new VistaProductos(200,370);
        this.Snacks = new VistaProductos(200,200);
        this.Monedas = new VistaMoneda(80,80);
    }


    @Override
    public void paintComponent(Graphics b) {
        super.paintComponent(b);
        PanPrincipal.setText("Cocacola: "+Proxy.askDeposito(1).size()+
                " Sprite: "+Proxy.askDeposito(2).size()+
                " Fanta: "+Proxy.askDeposito(3).size()+
                " Snickers: "+Proxy.askDeposito(4).size()+
                " Super8: "+Proxy.askDeposito(5).size()+
                " MonVuelto: "+Proxy.askDeposito(6).size()+
                " MonGanacia: "+Proxy.askDeposito(7).size());
        int c=1;
        int cc=0;
        for (int v=20;c<=7;v+=150) {
            b.setColor(new Color(220,220,220));
            b.fillRect(v-10,90,120,900);
            for (int i = 100; cc<20; i+=100) {
                if (Proxy.askDeposito(c).askProducto(cc)!=null){
                    switch (c) {
                        case(1):
                            b.drawImage(Bebidas.getImagen(1),v-50,i-30,this);
                            break;
                        case(2):
                            b.drawImage(Bebidas.getImagen(2),v-50,i-30,this);
                            break;
                        case(3):
                            b.drawImage(Bebidas.getImagen(3),v-50,i-30,this);
                            break;
                        case(4):
                            b.drawImage(Snacks.getImagen(4),v-50,i-20,this);
                            break;
                        case(5):
                            b.drawImage(Snacks.getImagen(5),v-50,i-20,this);
                            break;
                        case(6):
                            switch (Proxy.DepMonVal(cc,6)) {
                                case(100):
                                    b.drawImage(Monedas.getImagen(1), v, i, this);
                                    break;
                                case(500):
                                    b.drawImage(Monedas.getImagen(2), v, i, this);
                                    break;
                                case(1000):
                                    b.drawImage(Monedas.getImagen(3), v, i, this);
                                    break;
                            }
                            break;
                        case(7):
                            switch (Proxy.DepMonVal(cc,7)) {
                                case(100):
                                    b.drawImage(Monedas.getImagen(1), v, i, this);
                                    break;
                                case(500):
                                    b.drawImage(Monedas.getImagen(2), v, i, this);
                                    break;
                                case(1000):
                                    b.drawImage(Monedas.getImagen(3), v, i, this);
                                    break;
                            }
                            break;
                    }
                    b.setColor(Color.white);
                    b.fillRect(v,i,100,20);
                    b.setColor(Color.BLACK);
                    b.drawString("Id: " + String.valueOf(Proxy.DepProductoId(c,cc)),v+5,i+15);
                }
                cc++;
            }
            c++;
            cc=0;
        }
    }
}
