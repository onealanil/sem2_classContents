
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GridBagLayoutExample {

    public GridBagLayoutExample() {
        // new GridBagLayoutExample();
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 800);
        frame.setLayout(new GridBagLayout());

        JLabel usernameLabel = new JLabel("Username");
        JTextField usernameField = new JTextField(20);

        JLabel EmaiLabel = new JLabel("Email");
        JTextField EmailField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordField = new JPasswordField(20);

        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        //setting the object of GridBagConstraints for the layout
        GridBagConstraints c1 = new GridBagConstraints();

        c1.anchor = GridBagConstraints.LINE_START;

        // //padding --> insets --> top, left, bottom, right
        c1.insets.set(10, 10, 10, 10);

        c1.gridx = 0;
        c1.gridy = 0;
        frame.add(usernameLabel, c1);

        c1.gridx = 1;
        c1.gridy = 0;
        frame.add(usernameField, c1);

        c1.gridx = 0;
        c1.gridy = 1;
        frame.add(EmaiLabel, c1);

        c1.gridx = 1;
        c1.gridy = 1;
        frame.add(EmailField, c1);

        c1.gridx = 0;
        c1.gridy = 2;
        frame.add(passwordLabel, c1);

        c1.gridx = 1;
        c1.gridy = 2;
        frame.add(passwordField, c1);

        c1.gridx = 1;
        c1.gridy = 3;
        frame.add(loginButton, c1);
        frame.setVisible(true);
        c1.gridx = 1;
        c1.gridy = 1;
        frame.add(EmailField, c1);

        c1.gridx = 0;
        c1.gridy = 2;
        frame.add(passwordLabel, c1);

        c1.gridx = 1;
        c1.gridy = 2;
        frame.add(passwordField, c1);

        c1.gridx = 1;
        c1.gridy = 3;
        frame.add(loginButton, c1);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // new GridBagLayoutExample();

        // new GridBagLayoutExample();
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 800);
        frame.setLayout(new GridBagLayout());

        JLabel usernameLabel = new JLabel("Username");
        JTextField usernameField = new JTextField(20);

        JLabel EmaiLabel = new JLabel("Email");
        JTextField EmailField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordField = new JPasswordField(20);

        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // JOptionPane.showMessageDialog(null, "Button Clicked okoay", "Message", JOptionPane.INFORMATION_MESSAGE);

                //other types of option pane
                JOptionPane.showConfirmDialog(frame, "Confirm", "Confirm", JOptionPane.YES_NO_OPTION);
    
            }
        });

        //setting the object of GridBagConstraints for the layout
        GridBagConstraints c1 = new GridBagConstraints();

        // //padding --> insets --> top, left, bottom, right
        c1.insets.set(10, 10, 10, 10);

        c1.gridx = 0;
        c1.gridy = 0;
        frame.add(usernameLabel, c1);

        c1.gridx = 1;
        c1.gridy = 0;
        frame.add(usernameField, c1);

        c1.gridx = 0;
        c1.gridy = 1;
        frame.add(EmaiLabel, c1);

        c1.gridx = 1;
        c1.gridy = 1;
        frame.add(EmailField, c1);

        c1.gridx = 0;
        c1.gridy = 2;
        frame.add(passwordLabel, c1);

        c1.gridx = 1;
        c1.gridy = 2;
        frame.add(passwordField, c1);

        c1.gridx = 1;
        c1.gridy = 3;
        frame.add(loginButton, c1);

        frame.setVisible(true);

    }
}

// 00  10 
// 01 11
// 02 12
// 03 13
