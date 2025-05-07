import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class WindowOfSyn3 extends JComponent {
    private int width;
    private int height;


    public WindowOfSyn3(int w, int h){
        width = w;
        height = h;

    }
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

//        Ellipse2D.Double ell1OutLine = new Ellipse2D.Double(1, 248, 110,110);
//        g2d.setColor(new Color(0, 0, 0));
//        g2d.fill(ell1OutLine);
//
        Ellipse2D.Double ell1 = new Ellipse2D.Double(100, 100, 200,200);
        g2d.setColor(new Color(33,230,250));
        g2d.fill(ell1);
        Ellipse2D.Double ell2 = new Ellipse2D.Double(100, 100, 180,180);
        g2d.setColor(new Color(12,55,27));
        g2d.fill(ell2);
        Ellipse2D.Double ell3 = new Ellipse2D.Double(100, 100, 160,160);
        g2d.setColor(new Color(2,12,20));
        g2d.fill(ell3);
        Ellipse2D.Double ell4 = new Ellipse2D.Double(100, 100, 140,140);
        g2d.setColor(new Color(56,0,30));
        g2d.fill(ell4);
        Ellipse2D.Double ell5 = new Ellipse2D.Double(100, 100, 120,120);
        g2d.setColor(new Color(200,0,250));
        g2d.fill(ell5);
        Ellipse2D.Double ell6 = new Ellipse2D.Double(100, 100, 100,100);
        g2d.setColor(new Color(30,30,60));
        g2d.fill(ell6);
        Ellipse2D.Double ell7 = new Ellipse2D.Double(100, 100, 80,80);
        g2d.setColor(new Color(200,80,150));
        g2d.fill(ell7);
        Ellipse2D.Double ell8 = new Ellipse2D.Double(100, 100, 60,60);
        g2d.setColor(new Color(22,0,250));
        g2d.fill(ell8);
        Ellipse2D.Double ell9 = new Ellipse2D.Double(100, 100, 40,40);
        g2d.setColor(new Color(150,150,20));
        g2d.fill(ell9);
        Ellipse2D.Double ell10 = new Ellipse2D.Double(100, 100, 20,20);
        g2d.setColor(new Color(50,150,20));
        g2d.fill(ell10);




    }
}
