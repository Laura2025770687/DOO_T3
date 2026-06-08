package Gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

/**
 * Action listener para cuando se genere un click
 * (por ahora sin usar)
 */
public class ClickBottonExp implements ActionListener {
    int Button;
    ProxyExp Ask;
    public ClickBottonExp(int Botton,ProxyExp Proxy){
        this.Button = Botton;
        Ask = Proxy;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Ask.actionBotton(Button);

        Component botonClickeado = (Component)e.getSource();
        if (botonClickeado != null &&
                SwingUtilities.getWindowAncestor(botonClickeado) != null) {
            SwingUtilities.getWindowAncestor(botonClickeado).repaint();
        }
    }
}