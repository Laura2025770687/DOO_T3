import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana() {
        JPanel a = new PanelPrincipal();
        this.add(a);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setName("Expendedor");
        this.setSize(1000,1000);
        this.setVisible(true);
    }

}
