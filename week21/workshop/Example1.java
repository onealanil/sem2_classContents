package week21.workshop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Example1 {

    public Example1() {
        // Create a JFrame object
        JFrame frame = new JFrame("Example 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        //create JLabel for number 1
        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(50, 50, 100, 30);
        //create JTextField for number 1
        JTextField textField1 = new JTextField();
        textField1.setBounds(150, 50, 200, 30);

        //create JLabel for number 2
        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(50, 100, 100, 30);
        //create JTextField for number 2
        JTextField textField2 = new JTextField();
        textField2.setBounds(150, 100, 200, 30);

        //create JLabel for result
        JLabel labelResult = new JLabel("Result:");
        labelResult.setBounds(50, 150, 100, 30);
        //create JTextField for result
        JTextField textFieldResult = new JTextField();
        textFieldResult.setBounds(150, 150, 200, 30);
        textFieldResult.setEditable(false);

        //create JButton for addition
        JButton buttonAdd = new JButton("Add");
        buttonAdd.setBounds(50, 200, 100, 30);

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the numbers from the text fields
                String num1Str = textField1.getText();
                String num2Str = textField2.getText();

                try {
                    // Convert the strings to integers
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);

                    // Calculate the sum
                    int sum = num1 + num2;

                    // Display the result in the result text field
                    textFieldResult.setText(String.valueOf(sum));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(labelResult);
        frame.add(textFieldResult);
        frame.add(buttonAdd);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Example1();
    }
}
