package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

/**
 * El ActionListener que se llama si se presiona algún JButton
 */
public class ClickBottonExp implements ActionListener {
    int Button;
    ProxyExp Ask;

    /**
     * El método que conecta al botón con el ActionListener
     * @param Botton el número que identifica la función del JButton dentro del proxy
     * @param Proxy el proxy al cual se conectan los JButtons
     */
    public ClickBottonExp(int Botton, ProxyExp Proxy){
        this.Button = Botton;
        Ask = Proxy;
    }
    /**
     * Una vez se presiona un JButton, se le da un número al proxy que identifica que debe hacer.
     * Cada que se presiona algún JButton, se vuelve a pintar toda la ventana para actualizar
     * lo que haya cambiado.
     * @param e el evento a ser procesado
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Ask.actionBotton(Button);

        Component botonClick = (Component)e.getSource();
        if (SwingUtilities.getWindowAncestor(botonClick) != null) {
            SwingUtilities.getWindowAncestor(botonClick).repaint();
        }
    }
}