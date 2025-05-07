import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
public class TriSyn {
    public TriSyn() {

    }
    public void drawTri(Graphics2D g2d) {
        Rectangle2D.Double rec = new Rectangle2D.Double(50, 70, 100,250);
        g2d.setColor(new Color(0,255,100));
        g2d.fill(rec);
    }
}
