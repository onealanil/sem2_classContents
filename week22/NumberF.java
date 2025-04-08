package week22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumberF {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Number Format Exception");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        JLabel label = new JLabel("Number Format Exception");
        label.setBounds(50, 50, 200, 30);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(50, 100, 200, 30);
        frame.add(textField);

        JButton button = new JButton("Submit");
        button.setBounds(50, 150, 200, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                try {
                    int number = Integer.parseInt(input);
                    System.out.println("Parsed number: " + number);
                } catch (NumberFormatException ex) {
                    System.out.println("Number Format Exception: " + ex.getMessage());
                }
            }
        });

        frame.add(button);

        frame.setVisible(true);

    }
}
