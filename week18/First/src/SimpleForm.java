
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

public class SimpleForm {

    public static void main(String[] args) {
        // Create Frame (Window)
        JFrame frame = new JFrame("Simple Form");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use absolute positioning

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

       String [] countries = {"USA", "Canada", "UK", "Australia", "India"};
        //  Country Dropdown
        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setBounds(30, 140, 100, 25);
        JComboBox<String> countryBox = new JComboBox<>(countries);
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

        // Action Listener for Button Click 
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                String message = messageArea.getText();
                String box = countryBox.getSelectedItem().toString();

                String gender;
                if (maleButton.isSelected()) {
                    gender = "male";
                } else {
                    gender = "female";
                }


                JOptionPane.showMessageDialog(null, "Name: " + name
                        + "\nMessage: " + message
                        + "\nCountry: " + box
                        + "\nGender: " + gender);
            }
        });

        // Add Components to Frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(messageLabel);
        frame.add(messageArea);
        frame.add(countryLabel);
        frame.add(countryBox);
        frame.add(genderLabel);
        frame.add(maleButton);
        frame.add(femaleButton);
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
