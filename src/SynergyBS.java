import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class SynergyBS {
    JFrame frame = new JFrame();
    JButton button9;

    public static void main(String[] args) {

        SynergyBS calculator = new SynergyBS();
        calculator.go();
      ;
    }

    //public void changeIt(JButton button) {
    //    button.setText("im pressed");
    //}
    public void go() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);

        button9 = new JButton("info");

        button9.addActionListener(new ActionTo9());

        panel.add(button9);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        //frame.getContentPane().add(button1, BoxLayout.Y_AXIS);
        // frame.getContentPane().add(BorderLayout.NORTH, button2);
        // frame.getContentPane().add(BorderLayout.NORTH, button3);
        // frame.getContentPane().add(BorderLayout.NORTH, button4);
        frame.setSize(170, 410);
        frame.setVisible(true);

/*        public void go() {
            JButton buttonForSave = new JButton("save");
            buttonForSave.addActionListener(new Calculator().ButtonToSave());
            JButton buttonForShow = new JButton("show");
            button1.addActionListener(new Calculator().ButtonToShow());
            JPanel panalis = new JPanel();
            panalis.setBackground(Color.DARK_GRAY);
            frame.getContentPane().add(BorderLayout.CENTER, panalis);
            panalis.add(field);
            panalis.add(area);
            panalis.add(button);
            panalis.add(button1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setVisible(true);

        }
*/


    }

    class ActionTo9 implements ActionListener {
        public void actionPerformed(ActionEvent event) {

        }
    }
}