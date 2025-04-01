
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WorkshopExample {

    public WorkshopExample() {
        JFrame frame = new JFrame("Workshop");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Name Field
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 20, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 20, 200, 25);

        //  Message Area
        JLabel messageLabel = new JLabel("Message:");
        messageLabel.setBounds(30, 60, 100, 25);
        JTextArea messageArea = new JTextArea();
        messageArea.setBounds(150, 60, 200, 60);

        //  Country Dropdown
        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setBounds(30, 140, 100, 25);
        JComboBox<String> countryBox = new JComboBox<>(new String[]{"USA", "UK", "India"});
        countryBox.setBounds(150, 140, 200, 25);

        // Gender Selection (Radio Buttons)
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(30, 180, 100, 25);
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        maleButton.setBounds(150, 180, 70, 25);
        femaleButton.setBounds(230, 180, 80, 25);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        // 5️Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 230, 100, 30);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //getting the value from textfield
                String name = nameField.getText();
                //getting the value from textArea
                String message = messageArea.getText();
                //getting the value from comboBox
                String country = countryBox.getSelectedItem().toString();
                //getting the value from radio button
                String gender;
                if (maleButton.isSelected()) {
                    gender = maleButton.getText();
                } else {
                    gender = femaleButton.getText();
                }
                JOptionPane.showMessageDialog(frame, "Name: " + name
                        + "\nMessage: " + message
                        + "\nCountry: " + country
                        + "\nGender: " + gender);
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(submitButton);
        frame.add(messageLabel);
        frame.add(messageArea);
        frame.add(countryLabel);
        frame.add(countryBox);
        frame.add(genderLabel);
        frame.add(maleButton);
        frame.add(femaleButton);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // new WorkshopExample();

        JFrame frame = new JFrame("Workshop");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Name Field
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 20, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 20, 200, 25);

        //  Message Area
        JLabel messageLabel = new JLabel("Message:");
        messageLabel.setBounds(30, 60, 100, 25);
        JTextArea messageArea = new JTextArea();
        messageArea.setBounds(150, 60, 200, 60);

        //  Country Dropdown
        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setBounds(30, 140, 100, 25);
        JComboBox<String> countryBox = new JComboBox<>(new String[]{"USA", "UK", "India", "Nepal"});
        countryBox.setBounds(150, 140, 200, 25);

        // Gender Selection (Radio Buttons)
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(30, 180, 100, 25);
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        maleButton.setBounds(150, 180, 70, 25);
        femaleButton.setBounds(230, 180, 80, 25);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        // 5️Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 230, 100, 30);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String message = messageArea.getText();
                String box = countryBox.getSelectedItem().toString();

                String gender;
                if (femaleButton.isSelected()) {
                    gender = "female";
                } else {
                    gender = "male";
                }

                // JOptionPane.showMessageDialog(frame, "user clicked me");
                // System.out.println(name + " "+ message + " "+ box + " " + gender);
// 
                // String message = messageArea.getText();
                // String combo = countryBox.getSelectedItem().toString();
                // //dialogbox
                JOptionPane.showMessageDialog(null, name + "\n" + message + "\n" + box + gender , "title", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(submitButton);
        frame.add(messageLabel);
        frame.add(messageArea);
        frame.add(countryLabel);
        frame.add(countryBox);
        frame.add(genderLabel);
        frame.add(maleButton);
        frame.add(femaleButton);

        frame.setVisible(true);

    }
}
