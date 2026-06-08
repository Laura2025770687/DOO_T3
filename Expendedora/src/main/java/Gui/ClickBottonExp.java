package Gui;

import Logic.*;
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
    public ClickBottonExp(int Botton, ProxyExp Proxy){
        this.Button = Botton;
        Ask = Proxy;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Ask.actionBotton(Button);

        Component botonClick = (Component)e.getSource();
        if (SwingUtilities.getWindowAncestor(botonClick) != null) {
            SwingUtilities.getWindowAncestor(botonClick).repaint();
        }
    }
}