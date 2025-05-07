import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class SynergyJava23 {
    String input = "nothing yet";
    JFrame frame = new JFrame();
    JTextField field = new JTextField(20);
    JTextArea area = new JTextArea(10, 20);
    public static void main(String[] args) {
        SynergyJava23 synergyJava23 = new SynergyJava23();
        synergyJava23.area.setText("Пиши прэкол");
        synergyJava23.go();

    }
    public void go() {
        JButton button = new JButton("Начать определитель и счётчик");
        button.addActionListener(new SynergyJava23.ActToStart());
        JButton button1 = new JButton("Найти слово");
        button1.addActionListener(new SynergyJava23.ActToFind());
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
    class ActToStart implements ActionListener {
        public void actionPerformed (ActionEvent event){
            input = field.getText();
            int charactersCount = input.length();
            area.setText("Количество символов в тексте: " + charactersCount);


            String[] words = input.split("\\s+");
            int wordsCount = words.length;
            area.setText("Количество слов в тексте: " + wordsCount);


            String longestWord = "";
            int longestWordLength = 0;
            for (String word : words) {
                if (word.length() > longestWordLength) {
                    longestWord = word;
                    longestWordLength = word.length();
                }
            }
            area.setText("Самое длинное слово: " + longestWord + ", его длина: " + longestWordLength);

        }
    }
    class ActToFind implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("Введите ключевую фразу или слово для поиска:");
            String keyword = field.getText();
            if (input.contains(keyword)) {
                area.setText("Текст содержит ключевую фразу или слово: " + keyword);
            } else {
                area.setText("Текст не содержит ключевую фразу или слово: " + keyword);
            }
        }
    }
}
