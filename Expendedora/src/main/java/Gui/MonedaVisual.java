package Gui;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que dibuja una moneda con su respectivo valor y número de serie
 */
public class MonedaVisual extends JPanel {
    int x;
    int y;
    int valor;
    int numeroSerie;

    /**
     * Método inicializa algunos de los datos necesarios para dibujar una moneda
     * @param valor el valor de la moneda
     * @param numeroSerie el número de serie de la moneda
     */
    public MonedaVisual(int valor, int numeroSerie) {
        this.valor = valor;
        this.numeroSerie = numeroSerie;
    }

    /**
     * Método para determinar en qué posición se debe dibujar la moneda
     * @param x la posición horizontal donde se debe dibujar
     * @param y la posición vertical donde se debe dibujar
     */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Dibuja una circunferencia negra rellenada con un color ya dado en posiciones predeterminadas,
     * dentro de la circunferencia se dibuja el valor y el número de serie de la moneda.
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        g.fillOval(x, y, 45, 45);

        g.setColor(Color.BLACK);
        g.drawOval(x, y, 45, 45);

        g.setFont(new Font("Arial", Font.BOLD, 10));
        g.drawString(String.valueOf(valor), x + 15, y + 25);
        g.drawString(String.valueOf("#" + numeroSerie), x + 20, y + 40);
    }
}