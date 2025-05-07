import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

public class Graphicslol implements ActionListener {
    JFrame frame = new JFrame();
    JButton button;
    public static void main(String[] args) {

        Graphicslol graphicslol = new Graphicslol();
        graphicslol.go();
       //JFrame frame = new JFrame();
       //JButton button = new JButton("press if you are gay");
       //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //frame.getContentPane().add(button);
       //frame.setSize(300,300);
       //frame.setVisible(true);
       // graphicslol.changeIt(button);
    }
    //public void changeIt(JButton button) {
   //    button.setText("im pressed");
   //}
    public void go() {
        button = new JButton("press if you are gay");
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(500,60);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
        VidjetJPanel v = new VidjetJPanel();
        frame.getContentPane().add(v);
        button.setText("yeah, you are, my brethren");
        frame.setSize(500,500);

    }



}
