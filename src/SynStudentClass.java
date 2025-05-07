import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class SynStudent {
    private String name;
    private int age;
    private String group;

    public SynStudent(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGroup() { return group; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGroup(String group) { this.group = group; }
}

public class SynStudentClass extends JFrame {
    private List<SynStudent> synStudents = new ArrayList<>();
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField nameField, ageField, groupField, searchField;

    public SynStudentClass() {
        setTitle("Учет студентов");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tableModel = new DefaultTableModel(new Object[]{"ФИО", "Возраст", "Группа"}, 0);
        table = new JTable(tableModel);
        loadStudentsFromFile();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        panel.add(new JLabel("ФИО:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Возраст:"));
        ageField = new JTextField();
        panel.add(ageField);

        panel.add(new JLabel("Группа:"));
        groupField = new JTextField();
        panel.add(groupField);

        JButton addButton = new JButton("Добавить");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });
        panel.add(addButton);

        JButton editButton = new JButton("Редактировать");
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editStudent();
            }
        });
        panel.add(editButton);

        JButton deleteButton = new JButton("Удалить");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteStudent();
            }
        });
        panel.add(deleteButton);

        panel.add(new JLabel("Поиск (ФИО):"));
        searchField = new JTextField();
        panel.add(searchField);

        JButton searchButton = new JButton("Поиск");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchStudent();
            }
        });
        panel.add(searchButton);

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);
    }

    private void addStudent() {
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        String group = groupField.getText();
        SynStudent synStudent = new SynStudent(name, age, group);
        synStudents.add(synStudent);
        tableModel.addRow(new Object[]{name, age, group});
        saveStudentsToFile();
    }

    private void editStudent() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String group = groupField.getText();
            SynStudent synStudent = synStudents.get(selectedRow);
            synStudent.setName(name);
            synStudent.setAge(age);
            synStudent.setGroup(group);
            tableModel.setValueAt(name, selectedRow, 0);
            tableModel.setValueAt(age, selectedRow, 1);
            tableModel.setValueAt(group, selectedRow, 2);
            saveStudentsToFile();
        }
    }

    private void deleteStudent() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            synStudents.remove(selectedRow);
            tableModel.removeRow(selectedRow);
            saveStudentsToFile();
        }
    }

    private void searchStudent() {
        String searchName = searchField.getText().toLowerCase();
        tableModel.setRowCount(0);
        for (SynStudent synStudent : synStudents) {
            if (synStudent.getName().toLowerCase().contains(searchName)) {
                tableModel.addRow(new Object[]{synStudent.getName(), synStudent.getAge(), synStudent.getGroup()});
            }
        }
    }

    private void saveStudentsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            oos.writeObject(synStudents);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadStudentsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"))) {
            synStudents = (List<SynStudent>) ois.readObject();
            for (SynStudent synStudent : synStudents) {
                tableModel.addRow(new Object[]{synStudent.getName(), synStudent.getAge(), synStudent.getGroup()});
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SynStudentClass().setVisible(true);
            }
        });
    }
}