import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dviga2 extends JPanel implements ActionListener {
    private final int PANEL_WIDTH = 500;
    private final int PANEL_HEIGHT = 500;
    private final int LINE_LENGTH = 100;
    private final int LINE_THICKNESS = 5;
    private int yPosition = PANEL_HEIGHT;
    private final Timer timer;

    public Dviga2() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        timer = new Timer(20, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GREEN);

        g2d.fillRect(PANEL_WIDTH / 2 - LINE_LENGTH / 2, yPosition, LINE_LENGTH, LINE_THICKNESS);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        yPosition -= 5;
        if (yPosition < 0) {
            yPosition = PANEL_HEIGHT;
        }
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Движение отрезка снизу вверх");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new Dviga2());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}