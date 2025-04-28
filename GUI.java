import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Student {

    protected int id;
    protected String name;
    protected String section;

    public Student(int id, String name, String section) {
        this.id = id;
        this.name = name;
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public String display() {
        return (
            "Student{" +
            "id=" +
            id +
            ", name='" +
            name +
            '\'' +
            ", section='" +
            section +
            '\'' +
            '}'
        );
    }
}

class BBA extends Student {

    private String batch;

    public BBA(int id, String name, String section, String batch) {
        super(id, name, section);
        this.batch = batch;
    }

    public String getBatch() {
        return batch;
    }

    public String display() {
        return super.display() + ", batch='" + batch + '\'';
    }
}

class BIT extends Student {

    private String batch;

    public BIT(int id, String name, String section, String batch) {
        super(id, name, section);
        this.batch = batch;
    }

    public String getBatch() {
        return batch;
    }

    public String display() {
        return super.display() + ", batch='" + batch + '\'';
    }
}

public class GUI {

    ArrayList<Student> studentList = new ArrayList<>();

    Student s;

    public GUI() {
        JFrame frame = new JFrame();
        frame.setTitle("GUI");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        seedData();
        displayStudents();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        JLabel label = new JLabel("Id");
        JLabel label2 = new JLabel("Name");
        JLabel label3 = new JLabel("Section");
        JLabel label4 = new JLabel("Year");

        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField section = new JTextField();
        JTextField yearField = new JTextField();

        JButton addBBAStudentButton = new JButton("Add BBA Student");
        JButton addBITStudentButton = new JButton("Add BIT Student");
        JButton saveToFileButton = new JButton("Save to File");
        JButton loadFromFileButton = new JButton("Load from File");

        addBBAStudentButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int id = Integer.parseInt(idField.getText());
                    String name = nameField.getText();
                    String course = section.getText();
                    String batch = yearField.getText();

                    s = new BBA(id, name, course, batch);
                    studentList.add(s);
                    displayStudents();
                }
            }
        );

        addBITStudentButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int id = Integer.parseInt(idField.getText());
                    String name = nameField.getText();
                    String course = section.getText();
                    String batch = yearField.getText();

                    s = new BIT(id, name, course, batch);
                    studentList.add(s);
                    displayStudents();
                }
            }
        );

        saveToFileButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        // write to file
                        FileWriter fw = new FileWriter("IIC.txt");
                        fw.write("-".repeat(100) + "\n");
                        String heading = String.format(
                            "|%-5s | %-50s | %-10s | %-10s|\n",
                            "Id",
                            "Name",
                            "Section",
                            "Batch"
                        );
                        fw.write(heading);
                        fw.write("-".repeat(100) + "\n");
                        for (Student student : studentList) {
                            fw.write(
                                String.format(
                                    "| %-5s | %-50s | %-10s | %-10s|\n",
                                    student.getId(),
                                    student.getName(),
                                    student.getSection(),
                                    (student instanceof BIT
                                            ? ((BIT) student).getBatch()
                                            : "BBA")
                                )
                            );
                        }
                        fw.write("-".repeat(100) + "\n");
                        fw.close();
                    } catch (IOException ex) {
                        System.out.println("Error");
                    }
                }
            }
        );

        loadFromFileButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame displayFrame = new JFrame("Student Data");
                    displayFrame.setSize(400, 300);
                    displayFrame.setDefaultCloseOperation(
                        JFrame.DISPOSE_ON_CLOSE
                    );
                    displayFrame.setVisible(true);

                    JTextArea jtArea = new JTextArea();
                    jtArea.setEditable(false);
                    jtArea.setLineWrap(true);
                    jtArea.setWrapStyleWord(true);

                    JScrollPane scrollPane = new JScrollPane(jtArea);

                    displayFrame.add(scrollPane);

                    try {
                        FileReader fr = new FileReader("IIC.txt");
                        int ch;
                        while ((ch = fr.read()) != -1) {
                            jtArea.append((char) ch + "");
                            System.out.print((char) ch);
                        }
                        fr.close();
                    } catch (IOException ex) {
                        System.out.println("Error");
                    }
                }
            }
        );

        panel.add(label);
        panel.add(idField);
        panel.add(label2);
        panel.add(nameField);
        panel.add(label3);
        panel.add(section);
        panel.add(label4);
        panel.add(yearField);
        panel.add(addBBAStudentButton);
        panel.add(addBITStudentButton);
        panel.add(saveToFileButton);
        panel.add(loadFromFileButton);
        frame.add(panel);
    }

    public static void main(String[] args) {
        new GUI();
    }

    public void seedData() {
        Student s1 = new BBA(2, "SHYAM JI HARILAL SHree", "C3", "2024");
        Student s2 = new BBA(3, "RAVI", "C4", "2023");
        Student s3 = new BBA(4, "RAJ", "C5", "2022");
        Student s4 = new BBA(5, "RAHUL", "C6", "2021");

        Student s5 = new BIT(20, "Hari", "C1", "2025");
        Student s6 = new BIT(21, "Sita", "C2", "2024");
        Student s7 = new BIT(22, "Gita", "C3", "2023");
        Student s8 = new BIT(23, "Lakshmi", "C4", "2022");
        Student s9 = new BIT(24, "Mohan", "C5", "2021");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        studentList.add(s7);
        studentList.add(s8);
        studentList.add(s9);
    }

    public void displayStudents() {
        for (Student student : studentList) {
            System.out.println(student.display());
        }
    }
}
