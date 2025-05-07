import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Calculator {
    JFrame frame = new JFrame();
    JButton button;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonForSave;
    JButton buttonForShow;
    JTextField field;
    JTextField field2;
    JButton back;
    JButton changeSide;
    JButton plus;
    JButton minus;
    JButton result;
    JButton div;
    JButton multi;
    JTextArea area;
    int first;
    int second;
    int numResult;
    boolean side;
    boolean isPlus;
    boolean isMinus;
    boolean isDiv;
    boolean isMulti;

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.go();
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
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        //panel.setLayout(new BoxLayout(panel, FlowLayout.LEFT));
        field = new JTextField(13);
        field2 = new JTextField(13);
        area = new JTextArea(5, 13);
//        button = new JButton("press, if you are gay");

        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button0 = new JButton("0");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        back = new JButton("del");
        plus = new JButton("+");
        minus = new JButton("-");
        result = new JButton("=");
        div = new JButton(":");
        multi = new JButton("*");
        changeSide = new JButton("swicth");


//        buttonForSave = new JButton("save");
//        buttonForShow = new JButton("show");
//        button.addActionListener();
        button1.addActionListener(new ActionTo1());
        button2.addActionListener(new ActionTo2());
        button3.addActionListener(new ActionTo3());
        button4.addActionListener(new ActionTo4());
        button0.addActionListener(new ActionTo0());
        button5.addActionListener(new ActionTo5());
        button6.addActionListener(new ActionTo6());
        button7.addActionListener(new ActionTo7());
        button8.addActionListener(new ActionTo8());
        button9.addActionListener(new ActionTo9());
        changeSide.addActionListener(new ActionToSide());
        back.addActionListener(new ActionToBack());
        result.addActionListener(new ActionToResult());
        plus.addActionListener(new ActionToPlus());
        minus.addActionListener(new ActionToMinus());
        multi.addActionListener(new ActionToMulti());
        div.addActionListener(new ActionToDiv());
//        buttonForSave.addActionListener(new ActionToSave());
//        buttonForShow.addActionListener(new ActionToShow());

        panel.add(area);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
//        panel.add(buttonForSave);
//        panel.add(buttonForShow);

        panel.add(field);
        panel.add(changeSide);
        panel.add(field2);
        panel.add(back);
        panel.add(result);
        panel.add(plus);
        panel.add(minus);
        panel.add(multi);
        panel.add(div);
//        panel.add(area);
        field.setEditable(false);
        field2.setEditable(false);
        area.setEditable(false);
        field.setBackground(Color.GRAY);

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
//    public void actionPerformed(ActionEvent event) {
//        VidjetJPanel v = new VidjetJPanel();
//        frame.getContentPane().add(v);
//        button.setText("yeah, you are, my brethren");
//        frame.setSize(500,500);
//
//    }

    //    class ActionToSave implements ActionListener {
//        public void actionPerformed (ActionEvent eventSave){
//            File f = new File("SoDText.txt");
//            String number = field.getText();
//            try {
//                BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
//                bw.append(String.format("%s\n", number));
//                bw.close();
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//    class ActionToShow implements ActionListener {
//        public void actionPerformed (ActionEvent eventShow) {
//            try {
//                File myFile = new File("SoDText.txt");
//                FileReader fileReader = new FileReader(myFile);
//                BufferedReader reader = new BufferedReader(fileReader);
//                String line = null;
//                while ((line = reader.readLine()) !=null) {
//                    field.append(line);
//                }
//                reader.close();
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//
//        }
//    }
    class ActionToBack implements ActionListener {
        public void actionPerformed(ActionEvent eventNumBack) {
            field.setText("");
            field2.setText("");
            first = 0;
            second = 0;
            side = false;
            area.setText("");
            field.setBackground(Color.GRAY);
            field2.setBackground(Color.WHITE);
        }
    }
    class ActionToMinus implements ActionListener {
        public void actionPerformed(ActionEvent eventNumMinus) {
            first = Integer.parseInt(field.getText());
            second = Integer.parseInt(field2.getText());
            numResult = first - second;
            isMinus = true;
        }
    }
    class ActionToPlus implements ActionListener {
        public void actionPerformed(ActionEvent eventNumPlus) {
            first = Integer.parseInt(field.getText());
            second = Integer.parseInt(field2.getText());
            numResult = first + second;
            isPlus = true;

        }
    }
    class ActionToSide implements ActionListener {
        public void actionPerformed(ActionEvent eventNumPlus) {
            if(side == false) {
            side = true;
            field2.setBackground(Color.GRAY);
            field.setBackground(Color.WHITE);
            } else {
                side = false;
                field.setBackground(Color.GRAY);
                field2.setBackground(Color.WHITE);
            }

        }
    }
    class ActionToResult implements ActionListener {
        public void actionPerformed(ActionEvent eventNumResult) {
            area.setText(String.valueOf(numResult));
            field.setText("");
            field2.setText("");
            first = numResult;
            field.setText(String.valueOf(numResult));
        }
    }
    class ActionToDiv implements ActionListener {
        public void actionPerformed(ActionEvent eventNumDiv) {
            first = Integer.parseInt(field.getText());
            second = Integer.parseInt(field2.getText());
            numResult = first / second;
            isDiv = true;
        }
    }
    class ActionToMulti implements ActionListener {
        public void actionPerformed(ActionEvent eventNumMulti) {
            first = Integer.parseInt(field.getText());
            second = Integer.parseInt(field2.getText());
            numResult = first * second;
            isMulti = true;
        }
    }

    class ActionTo0 implements ActionListener {
        public void actionPerformed(ActionEvent eventNum0) {
            if(side == false) {
                field.setText(field.getText() + button0.getText());
                first = first + Integer.parseInt(field.getText());
            } else {
                field2.setText(field2.getText() + button0.getText());
                second = second + Integer.parseInt(field2.getText());
            }
        }
    }

    class ActionTo1 implements ActionListener {
        public void actionPerformed(ActionEvent eventNum1) {

            if(side == false) {
                field.setText(field.getText() + button1.getText());
                first = first + Integer.parseInt(field.getText());
            } else {
                field2.setText(field2.getText() + button1.getText());
                second = second + Integer.parseInt(field2.getText());
            }

        }
    }


    class ActionTo2 implements ActionListener {
        public void actionPerformed(ActionEvent eventNum2) {

            if(side == false) {
                field.setText(field.getText() + button2.getText());
                first = first + Integer.parseInt(field.getText());
            } else {
                field2.setText(field2.getText() + button2.getText());
                second = second + Integer.parseInt(field2.getText());
            }
        }
    }

    class ActionTo3 implements ActionListener {
        public void actionPerformed(ActionEvent eventNum3) {
            if(side == false) {
                field.setText(field.getText() + button3.getText());
                first = first + Integer.parseInt(field.getText());
            } else {
                field2.setText(field2.getText() + button3.getText());
                second = second + Integer.parseInt(field2.getText());
            }
        }
    }

    class ActionTo4 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(side == false) {
                field.setText(field.getText() + button4.getText());
                first = first + Integer.parseInt(field.getText());
            } else {
                field2.setText(field2.getText() + button4.getText());
                second = second + Integer.parseInt(field2.getText());
            }
        }
    }

    class ActionTo5 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(side == false) {
                field.setText(field.getText() + button5.getText());
                first = first + Integer.parseInt(field.getText());
            } else {
                field2.setText(field2.getText() + button5.getText());
                second = second + Integer.parseInt(field2.getText());
            }
        }
    }

    class ActionTo6 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(side == false) {
                field.setText(field.getText() + button6.getText());
                first = first + Integer.parseInt(field.getText());
            } else {
                field2.setText(field2.getText() + button6.getText());
                second = second + Integer.parseInt(field2.getText());
            }
        }
    }

    class ActionTo7 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(side == false) {
                field.setText(field.getText() + button7.getText());
                first = first + Integer.parseInt(field.getText());
            } else {
                field2.setText(field2.getText() + button7.getText());
                second = second + Integer.parseInt(field2.getText());
            }
        }
    }

    class ActionTo8 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(side == false) {
                field.setText(field.getText() + button8.getText());
                first = first + Integer.parseInt(field.getText());
            } else {
                field2.setText(field2.getText() + button8.getText());
                second = second + Integer.parseInt(field2.getText());
            }
        }
    }

    class ActionTo9 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(side == false) {
                field.setText(field.getText() + button9.getText());
                first = first + Integer.parseInt(field.getText());
            } else {
                field2.setText(field2.getText() + button9.getText());
                second = second + Integer.parseInt(field2.getText());
            }
        }
    }
}