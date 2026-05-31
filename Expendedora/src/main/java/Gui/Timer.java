package Gui;

import java.awt.event.*;
import javax.swing.Timer;


class Animar implements ActionListener { //misma interfaz que usan JButton y otros
    private Timer t;

    public Animar() {
        t = new Timer(1000, null); //en milisegundos, segundo parámetro puede ser this y evitar línea siguiente
        t.addActionListener(this);
        t.start();
    }

    public void actionPerformed(ActionEvent ae) {
        return;
    }
}
