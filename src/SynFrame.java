import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SynFrame extends JFrame implements MouseListener {
    JPanel panel = new JPanel();
    JTextArea area = new JTextArea();
    Timer timer;
    boolean b;
    int xMove;
    int yMove;
    JButton close;
    int i;
    SynFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        panel.setBackground(new Color(100, 100,255));
//        panel.setBounds(xMove, yMove, 100, 100);
        this.add(panel);
        panel.addMouseListener(this);
        panel.add(area);
        area.setEditable(false);
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                xMove = e.getX();
                yMove = e.getY();
                panel.setBounds(e.getX() - 50, e.getY() - 50, 100, 100);
            }
        });
        close = new JButton("close");
        panel.add(close);
        close.addActionListener(new ActionToClose());








    }
//    public void paint(Graphics g){
//        Graphics2D g2D = (Graphics2D) g;
//        g2D.drawString("Щелчок мышки", xMove, yMove);
//
//    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(b == false)
            area.setText("Щелчок мышки");
        if(b == true)
            area.setText("");
        if(b == false){
        b = true;
        } else {
            b = false;
        }

    }
    class ActionToClose implements ActionListener {
        public void actionPerformed(ActionEvent eventclose) {
            i++;
            if(i == 3)
            close.addActionListener((event) -> System.exit(0));
        }
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
