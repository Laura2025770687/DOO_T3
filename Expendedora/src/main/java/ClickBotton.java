import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Action listener para cuando se genere un click (por ahora sin usar)
 */
public class ClickBotton implements ActionListener {
    String a;
    ImageIcon A;
    JLabel b;
    JLabel B;
    public ClickBotton(String a,ImageIcon A, JLabel b,JLabel B){
        this.a = a;
        this.b = b;
        this.A = A;
        this.B = B;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        b.setText(a);
        B.setIcon(A);
    }
}