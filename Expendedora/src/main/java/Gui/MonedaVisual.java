package Gui;

import java.awt.*;

//Valor y numeroSerie por ahora, se requiere una clase comprador en la lógica
public class MonedaVisual {
    int x;
    int y;
    int valor;
    int numeroSerie;
    ProxyExp proxy;
    public MonedaVisual(ProxyExp proxy, int valor, int numeroSerie) {
        this.proxy = proxy;
        this.valor = valor;
        this.numeroSerie = numeroSerie;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void quitarMoneda() {

    }

    public void paintComponent(Graphics g) {
        g.fillOval(x, y, 45, 45);

        g.setColor(Color.BLACK);
        g.drawOval(x, y, 45, 45);

        g.setFont(new Font("Arial", Font.BOLD, 10));
        g.drawString(String.valueOf(valor), x + 15, y + 25);
        g.drawString(String.valueOf("#" + numeroSerie), x + 20, y + 40);
    }
}