import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dviga extends JPanel implements ActionListener {
    private final int PANEL_WIDTH = 500;
    private final int PANEL_HEIGHT = 500;

    private final int LINE_LENGTH = 100;
    private final int LINE_THICKNESS = 5;
    private int yPosition = 0;
    private final Timer timer;

    public Dviga() {
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
        for (int i = 0; i < yPosition; i += 10) {
            float alpha = 1.0f - (float) i / yPosition;
            AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha);
            g2d.setComposite(ac);
            g2d.fillRect(PANEL_WIDTH / 2 - LINE_LENGTH / 2, i, LINE_LENGTH, LINE_THICKNESS);
        }
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
        g2d.fillRect(PANEL_WIDTH / 2 - LINE_LENGTH / 2, yPosition, LINE_LENGTH, LINE_THICKNESS);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        yPosition += 5;
        if (yPosition > PANEL_HEIGHT) {
            yPosition = 0;
        }
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Dviga");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new Dviga());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}