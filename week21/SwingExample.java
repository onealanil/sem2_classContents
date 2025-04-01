package week21;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel label = new JLabel("Enter price: ");
        label.setBounds(50, 50, 200, 30);

        JTextField textField = new JTextField();
        textField.setBounds(150, 50, 200, 30);

        JButton button = new JButton("Submit");
        button.setBounds(150, 100, 100, 30);

        button.addActionListener(e -> {
            try {
                double price = Double.parseDouble(textField.getText());
                System.out.println("Price entered: " + price);
            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(frame, "Invalid input! Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Invalid input! Please enter a valid number.");
            }

        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setVisible(true);

    }
}
