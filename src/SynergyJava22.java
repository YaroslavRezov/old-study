import javax.swing.*;

public class SynergyJava22 {
    public static void main(String[] args) {
        int w = 1280;
        int h = 740;
        JFrame f = new JFrame();
        WindowOfSyn2 windowOfSyn2 = new WindowOfSyn2(w, h);
        f.setSize(w,h);
        f.setTitle("Лаюа 5 или 6, я не помню");
        f.add(windowOfSyn2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
