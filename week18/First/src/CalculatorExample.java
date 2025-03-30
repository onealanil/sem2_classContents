
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorExample {

    public static void main(String[] args) {
        // Create Frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Create Components
        JLabel num1Label = new JLabel("Number 1:");
        num1Label.setBounds(50, 30, 80, 20);

        JTextField num1Field = new JTextField();
        num1Field.setBounds(150, 30, 200, 25);

        JLabel num2Label = new JLabel("Number 2:");
        num2Label.setBounds(50, 70, 80, 20);

        JTextField num2Field = new JTextField();
        num2Field.setBounds(150, 70, 200, 25);

        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(50, 180, 300, 30);

        JButton addButton = new JButton("+");
        addButton.setBounds(50, 120, 50, 30);

        JButton subtractButton = new JButton("-");
        subtractButton.setBounds(120, 120, 50, 30);

        JButton multiplyButton = new JButton("×");
        multiplyButton.setBounds(190, 120, 50, 30);

        JButton divideButton = new JButton("÷");
        divideButton.setBounds(260, 120, 50, 30);

        // Add components to frame
        frame.add(num1Label);
        frame.add(num1Field);
        frame.add(num2Label);
        frame.add(num2Field);
        frame.add(resultLabel);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);

        // Action Listener for Buttons (unchanged)
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // converting string text to double
                double num1 = Double.parseDouble(num1Field.getText());
                // converting string text to double
                double num2 = Double.parseDouble(num2Field.getText());
                double result = 0;

                // System.out.println("e.getSource() is of type: " + e.getSource().getClass().getName());
                if (e.getSource() == addButton) {
                    result = num1 + num2;
                } else if (e.getSource() == subtractButton) {
                    result = num1 - num2;

                } else if (e.getSource() == multiplyButton) {
                    result = num1 * num2;
                } else if (e.getSource() == divideButton) {
                    if (num2 == 0) {
                        return;
                    }
                    result = num1 / num2;

                }

                resultLabel.setText("Result: " + result);
            }
        };

        // Attach Action Listener
        addButton.addActionListener(actionListener);
        subtractButton.addActionListener(actionListener);
        multiplyButton.addActionListener(actionListener);
        divideButton.addActionListener(actionListener);

        frame.setVisible(true);

    }
}
