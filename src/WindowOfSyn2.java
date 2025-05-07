import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class WindowOfSyn2 extends JComponent {
    private int width;
    private int height;


    public WindowOfSyn2(int w, int h){
        width = w;
        height = h;

    }
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Path2D.Double tri1 = new Path2D.Double();
        tri1.moveTo(300, 600);
        tri1.lineTo(100, 100);
        tri1.lineTo(600, 600);
        tri1.closePath();
        g2d.setColor(new Color(0,0,250));
        g2d.fill(tri1);

//        Path2D.Double outline = new Path2D.Double();
//        outline.moveTo(100, 300);
//        outline.lineTo(400, 200);
//        outline.lineTo(700, 300);
//        outline.closePath();
//        g2d.setColor(new Color(0,0,0));
//        g2d.draw(outline);
//
        Path2D.Double tri2 = new Path2D.Double();
        tri2.moveTo(480, 600);
        tri2.lineTo(900, 100);
        tri2.lineTo(750, 600);
        tri2.closePath();
        g2d.setColor(new Color(0,250,0));
        g2d.fill(tri2);

//
//        Path2D.Double outline2 = new Path2D.Double();
//        outline2.moveTo(100, 300);
//        outline2.lineTo(400, 400);
//        outline2.lineTo(700, 300);
//        outline2.closePath();
//        g2d.setColor(new Color(0,0,0));
//        g2d.draw(outline2);
        Path2D.Double tri3 = new Path2D.Double();
        tri3.moveTo(400, 600);
        tri3.lineTo(500, 100);
        tri3.lineTo(660, 600);
        tri3.closePath();
        g2d.setColor(new Color(255,0,0));
        g2d.fill(tri3);
//        Ellipse2D.Double ell1OutLine = new Ellipse2D.Double(1, 248, 110,110);
//        g2d.setColor(new Color(0, 0, 0));
//        g2d.fill(ell1OutLine);
//
        Ellipse2D.Double ell1 = new Ellipse2D.Double(70, 70, 50,50);
        g2d.setColor(new Color(0,0,250));
        g2d.fill(ell1);
//
//        Ellipse2D.Double ell2OutLine = new Ellipse2D.Double(698, 248, 105,105);
//        g2d.setColor(new Color(0, 0, 0));
//        g2d.fill(ell2OutLine);
//
        Ellipse2D.Double ell2 = new Ellipse2D.Double(870, 70, 50,50);
        g2d.setColor(new Color(0, 255, 0));
        g2d.fill(ell2);

        Ellipse2D.Double ell3 = new Ellipse2D.Double(480, 70, 50,50);
        g2d.setColor(new Color(255, 0, 0));
        g2d.fill(ell3);



    }
}
