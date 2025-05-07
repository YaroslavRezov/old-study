import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PoletO extends JPanel implements ActionListener, KeyListener {
    private final int WIDTH = 500;
    private final int HEIGHT = 500;
    private int x, y, diameter;
    private Color color;
    private Timer timer;
    private boolean movingToLeftTop = true;

    public PoletO() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(this);


        diameter = 50;
        x = WIDTH / 2 - diameter / 2;
        y = HEIGHT / 2 - diameter / 2;
        color = getRandomColor();
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        Stroke oldStroke = g2d.getStroke();
        g2d.setStroke(new BasicStroke(3));
        g2d.drawOval(x, y, diameter, diameter);
        g2d.setStroke(oldStroke);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (movingToLeftTop) {
            x -= 1;
            y -= 1;
            if (x < -diameter || y < -diameter) {
                movingToLeftTop = false;
                color = getRandomColor();
            }
        } else {
            x += 1;
            y += 1;
            if (x > WIDTH / 2 - diameter / 2 && y > HEIGHT / 2 - diameter / 2) {
                movingToLeftTop = true;
                color = getRandomColor();
            }
        }
        repaint();
    }

    private Color getRandomColor() {
        return new Color((float) Math.random(), (float) Math.random(), (float) Math.random());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        timer.stop();
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Полет Ochka - Линзы))");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new PoletO());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
