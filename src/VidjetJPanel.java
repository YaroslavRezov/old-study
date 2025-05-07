import javax.swing.*;
import java.awt.*;

public class VidjetJPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
//        g.setColor(Color.orange);
//        g.fillRect(20,50,100,100);
        Image image = new ImageIcon("Fusie.jpg").getImage();
        g.drawImage(image, 1, 1, 500, 500, this);

    }
}
