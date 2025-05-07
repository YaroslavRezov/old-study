import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class SynElText extends JComponent {
    int x;
    int y;
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawString("Щелк", x , y);
    }
}
