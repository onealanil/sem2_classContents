// package content;

// import java.awt.event.*;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.ArrayList;
// import javax.swing.ButtonGroup;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JOptionPane;
// import javax.swing.JRadioButton;
// import javax.swing.JTextField;

// class Student {
//     protected int id;
//     protected String name;
//     protected String section;

//     public Student(int id, String name, String section) {
//         this.id = id;
//         this.name = name;
//         this.section = section;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     public String getSection() {
//         return section;
//     }
// }

// class BBA extends Student {
//     public BBA(int id, String name, String section) {
//         super(id, name, section);
//     }
// }

// class BIT extends Student {
//     public BIT(int id, String name, String section) {
//         super(id, name, section);
//     }
// }

// public class Example {

//     public static void main(String[] args) {
//         ArrayList<Student> students = new ArrayList<>();

//         JFrame frame = new JFrame("Student Management System");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(600, 500);
//         frame.setLayout(null);

//         JLabel idLabel = new JLabel("ID:");
//         idLabel.setBounds(50, 50, 100, 30);
//         frame.add(idLabel);
//         JTextField idField = new JTextField();
//         idField.setBounds(150, 50, 100, 30);
//         frame.add(idField);
//         JLabel nameLabel = new JLabel("Name:");
//         nameLabel.setBounds(50, 100, 100, 30);
//         frame.add(nameLabel);
//         JTextField nameField = new JTextField();
//         nameField.setBounds(150, 100, 100, 30);
//         frame.add(nameField);

//         //radio buttons for BBA and BIT
//         JRadioButton bbaButton = new JRadioButton("BBA");
//         bbaButton.setBounds(50, 150, 100, 30);
//         frame.add(bbaButton);
//         JRadioButton bitButton = new JRadioButton("BIT");
//         bitButton.setBounds(150, 150, 100, 30);
//         frame.add(bitButton);

//         ButtonGroup group = new ButtonGroup();
//         group.add(bbaButton);
//         group.add(bitButton);

//         JButton addButton = new JButton("Add Student");
//         addButton.setBounds(50, 200, 150, 30);
//         frame.add(addButton);

//         addButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 int id = Integer.parseInt(idField.getText());
//                 String name = nameField.getText();
//                 String section = bbaButton.isSelected() ? "BBA" : "BIT";
//                 Student student;
//                 if (bbaButton.isSelected()) {
//                     student = new BBA(id, name, section);
//                 } else {
//                     student = new BIT(id, name, section);
//                 }
//                 students.add(student);
//                 idField.setText("");
//                 nameField.setText("");
//                 JOptionPane.showMessageDialog(frame, "Student added successfully!");
//             }
//         });
               

//         //add button display
//         JButton displayButton = new JButton("Display Students");
//         displayButton.setBounds(50, 250, 150, 30);
//         frame.add(displayButton);

//         displayButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//             }
//         });

//         //load from file button
//         JButton loadButton = new JButton("Load from File");
//         loadButton.setBounds(50, 300, 150, 30);
//         frame.add(loadButton);

//         //save to file button
//         JButton saveButton = new JButton("Save to File");
//         saveButton.setBounds(50, 350, 150, 30);
//         frame.add(saveButton);
//         //save to button method
//         saveButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                  //save in file using string format in tabular format using string
//                 try {
//                     FileWriter fw = new FileWriter("c9Students.txt");
//                     fw.write("-".repeat(100) + "\n");
//                     String heading = String.format(
//                             "|%-5s | %-50s | %-10s |\n",
//                             "Id",
//                             "Name",
//                             "Section"
//                     );
//                     fw.write(heading);
//                     fw.write("-".repeat(100) + "\n");
//                     for (Student student : students) {
//                         fw.write(
//                                 String.format(
//                                         "| %-5s | %-50s | %-10s |\n",
//                                         student.getId(),
//                                         student.getName(),
//                                         student.getSection()
//                                 )
//                         );
//                     }
//                     fw.write("-".repeat(100) + "\n");
//                     fw.close();
//                     JOptionPane.showMessageDialog(frame, "Students saved to file successfully.");
//                 } catch (IOException ex) {
//                     JOptionPane.showMessageDialog(frame, "Error saving to file: " + ex.getMessage());
//                 }
//             }
//         });

//         frame.setVisible(true);
//     }
// }
