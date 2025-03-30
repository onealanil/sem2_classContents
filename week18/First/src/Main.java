
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {

    public Main() {
        // creating frame
        JFrame frame = new JFrame();
        // set size
        frame.setSize(900, 800);

        // set background color
        // frame.getContentPane().setBackground(Color.BLUE);
        //custom color
        // frame.getContentPane().setBackground(new Color(204, 240, 254));
        // set visibility to true
        // frame.setVisible(true);
        // default close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);
        // Maximize the frame to full screen
        // frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // First Name
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(50, 30, 100, 30);
        // firstNameLabel.setForeground(Color.BLUE);
        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(150, 30, 150, 30);

        // Last Name
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(50, 70, 100, 30);
        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(150, 70, 150, 30);

        // Username
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 110, 100, 30);
        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 110, 150, 30);

        // Email
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 150, 100, 30);
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 150, 150, 30);

        // Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 190, 100, 30);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 190, 150, 30);

        // Gender (Radio Buttons)
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 230, 100, 30);

        JRadioButton maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(150, 230, 70, 30);

        JRadioButton femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(220, 230, 80, 30);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        JLabel textAreaLabel = new JLabel("Text Area:");
        textAreaLabel.setBounds(50, 300, 100, 30);
        JTextArea textArea = new JTextArea("This is text area");
        textArea.setBounds(150, 300, 200, 100);

        // Sign Up Button
        JButton signupButton = new JButton("Sign Up");
        signupButton.setBounds(150, 420, 100, 30);

        // Action Listener for Button
        signupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String username = usernameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String gender = maleRadio.isSelected() ? "Male"
                        : (femaleRadio.isSelected() ? "Female" : "Not Selected");
                JOptionPane.showMessageDialog(frame, "Signup Successful!\n" +
                        "Name: " + firstName + " " + lastName + "\n" +
                        "Username: " + username + "\n" +
                        "Email: " + email + "\n" +
                        "Gender: " + gender);
            }
        });
        // Adding components to the frame
        frame.add(firstNameLabel);
        frame.add(firstNameField);
        frame.add(lastNameLabel);
        frame.add(lastNameField);
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(genderLabel);
        frame.add(maleRadio);
        frame.add(femaleRadio);
        frame.add(signupButton);
        frame.add(textAreaLabel);
        frame.add(textArea);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // new Main();
        JFrame frame = new JFrame("Signup Form");
        frame.setSize(900, 800);
        frame.setLayout(null);

        //default close opertaion
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // First Name
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(50, 30, 100, 30);
        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(150, 30, 150, 30);

        // Last Name
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(50, 70, 100, 30);
        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(150, 70, 150, 30);

        // Username
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 110, 100, 30);
        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 110, 150, 30);

        // Email
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 150, 100, 30);
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 150, 150, 30);

        // Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 190, 100, 30);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 190, 150, 30);

        // Gender (Radio Buttons)
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 230, 100, 30);

        JRadioButton maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(150, 230, 70, 30);

        JRadioButton femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(220, 230, 80, 30);

        //grouping the male radio button and female radio button
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        // Sign Up Button
        JButton signupButton = new JButton("Sign Up");
        signupButton.setBounds(150, 420, 100, 30);


        frame.add(firstNameLabel);
        frame.add(firstNameField);
        frame.add(lastNameLabel);
        frame.add(lastNameField);
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(genderLabel);
        frame.add(maleRadio);
        frame.add(femaleRadio);
        frame.add(signupButton);

        //setting frame visibility to true
        frame.setVisible(true);

    }
}
