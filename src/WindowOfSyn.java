import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class WindowOfSyn extends JComponent {
    private int width;
    private int height;


    public WindowOfSyn(int w, int h){
        width = w;
        height = h;

    }
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Path2D.Double tri1 = new Path2D.Double();
        tri1.moveTo(100, 300);
        tri1.lineTo(400, 200);
        tri1.lineTo(700, 300);
        tri1.closePath();
        g2d.setColor(new Color(0,0,250));
        g2d.fill(tri1);

        Path2D.Double outline = new Path2D.Double();
        outline.moveTo(100, 300);
        outline.lineTo(400, 200);
        outline.lineTo(700, 300);
        outline.closePath();
        g2d.setColor(new Color(0,0,0));
        g2d.draw(outline);

        Path2D.Double tri2 = new Path2D.Double();
        tri2.moveTo(100, 300);
        tri2.lineTo(400, 400);
        tri2.lineTo(700, 300);
        tri2.closePath();
        g2d.setColor(new Color(0,250,0));
        g2d.fill(tri2);


        Path2D.Double outline2 = new Path2D.Double();
        outline2.moveTo(100, 300);
        outline2.lineTo(400, 400);
        outline2.lineTo(700, 300);
        outline2.closePath();
        g2d.setColor(new Color(0,0,0));
        g2d.draw(outline2);

        Ellipse2D.Double ell1OutLine = new Ellipse2D.Double(1, 248, 110,110);
        g2d.setColor(new Color(0, 0, 0));
        g2d.fill(ell1OutLine);

        Ellipse2D.Double ell1 = new Ellipse2D.Double(3, 250, 105,105);
        g2d.setColor(new Color(255, 0, 0));
        g2d.fill(ell1);

        Ellipse2D.Double ell2OutLine = new Ellipse2D.Double(698, 248, 105,105);
        g2d.setColor(new Color(0, 0, 0));
        g2d.fill(ell2OutLine);

        Ellipse2D.Double ell2 = new Ellipse2D.Double(700, 250, 100,100);
        g2d.setColor(new Color(255, 255, 0));
        g2d.fill(ell2);



    }
}
