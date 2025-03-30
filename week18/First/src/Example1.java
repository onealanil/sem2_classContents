
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Example1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gym manamgement system");
        frame.setSize(900, 800);
        

        frame.setLayout(null);


        //label
        JLabel label = new JLabel("Email");
        label.setBounds(50, 50, 100, 30);
        

        //text filed
        JTextField  textField = new JTextField();
        textField.setBounds(200, 50, 200, 30);


        //label
        JLabel usernameLabel = new JLabel();
        usernameLabel.setText("Username");
        usernameLabel.setBounds(50, 80, 100, 30);


        JTextField textField1 = new JTextField();
        textField1.setBounds(200, 80, 200,30);

        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(50, 230, 100, 30);

        //radio button 
        JRadioButton maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(150, 230, 70, 30);

        JRadioButton femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(220, 230, 80, 30);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        JButton signupButton = new JButton("Sign Up");
        signupButton.setBounds(550, 420, 100, 30);


        frame.add(usernameLabel);
        frame.add(textField1);
        frame.add(genderLabel);
        frame.add(label);
        frame.add(textField);
        frame.add(maleRadio);
        frame.add(femaleRadio);
        frame.add(signupButton);



        frame.setVisible(true);

    }
}
