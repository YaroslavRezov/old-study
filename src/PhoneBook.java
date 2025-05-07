import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class PhoneBook {
    JFrame frame = new JFrame();
    JTextField field = new JTextField(20);
    JTextArea area = new JTextArea(10, 20);

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.go();

    }

    public void go() {
        JButton button = new JButton("save");
        button.addActionListener(new Button1());
        JButton button1 = new JButton("show");
        button1.addActionListener(new Button2());
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

    class Button1 implements ActionListener {
        public void actionPerformed (ActionEvent event){
            File f = new File("SoDText.txt");
            String number = field.getText();
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
                bw.append(String.format("%s\n", number));
                bw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    class Button2 implements ActionListener {
        public void actionPerformed (ActionEvent event1) {
            try {
                File myFile = new File("SoDText.txt");
                FileReader fileReader = new FileReader(myFile);
                BufferedReader reader = new BufferedReader(fileReader);
                String line = null;
                while ((line = reader.readLine()) !=null) {
                    area.append(line);
                }
                reader.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
}