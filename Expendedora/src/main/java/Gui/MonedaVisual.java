package Gui;

import java.awt.*;

//Valor y numeroSerie por ahora, se requiere una clase comprador en la lógica
public class MonedaVisual {
    private int x;
    private int y;
    private int numeroSerie;
    private int valor;

    public MonedaVisual(int numeroSerie, int valor) {
        this.numeroSerie = numeroSerie;
        this.valor = valor;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void paintComponent(Graphics g) {
        int d = 50;
        if (valor == 100) {
            g.setColor(new Color(205, 127, 50));
        } else if (this.valor == 500) {
            g.setColor(Color.LIGHT_GRAY);
        } else if (valor == 1000) {
            g.setColor(new Color(255, 215, 0));
        }

        g.fillOval(x, y, d, d);

        g.setColor(Color.BLACK);
        g.drawOval(x, y, d, d);

        g.setFont(new Font("Arial", Font.BOLD, 10));
        g.drawString(String.valueOf(numeroSerie), this.x + 4, this.y - 19);
    }
}