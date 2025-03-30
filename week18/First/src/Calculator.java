
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator {

    public Calculator() {
        // Create the frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);

        // Create display
        JTextField display = new JTextField();
        display.setBounds(20, 20, 260, 50);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(display);

        // Create number buttons 
        JButton btn7 = new JButton("7");
        btn7.setBounds(20, 80, 60, 50);

        JButton btn8 = new JButton("8");
        btn8.setBounds(90, 80, 60, 50);

        JButton btn9 = new JButton("9");
        btn9.setBounds(160, 80, 60, 50);

        JButton btn4 = new JButton("4");
        btn4.setBounds(20, 140, 60, 50);

        JButton btn5 = new JButton("5");
        btn5.setBounds(90, 140, 60, 50);

        JButton btn6 = new JButton("6");
        btn6.setBounds(160, 140, 60, 50);

        JButton btn1 = new JButton("1");
        btn1.setBounds(20, 200, 60, 50);

        JButton btn2 = new JButton("2");
        btn2.setBounds(90, 200, 60, 50);

        JButton btn3 = new JButton("3");
        btn3.setBounds(160, 200, 60, 50);

        JButton btn0 = new JButton("0");
        btn0.setBounds(90, 260, 60, 50);

        // Create operation buttons
        JButton btnDivide = new JButton("/");
        btnDivide.setBounds(230, 80, 60, 50);
        btnDivide.setBackground(new Color(200, 200, 255));

        JButton btnMultiply = new JButton("*");
        btnMultiply.setBounds(230, 140, 60, 50);
        btnMultiply.setBackground(new Color(200, 200, 255));

        JButton btnSubtract = new JButton("-");
        btnSubtract.setBounds(230, 200, 60, 50);
        btnSubtract.setBackground(new Color(200, 200, 255));

        JButton btnAdd = new JButton("+");
        btnAdd.setBounds(230, 260, 60, 50);
        btnAdd.setBackground(new Color(200, 200, 255));

        JButton btnEquals = new JButton("=");
        btnEquals.setBounds(160, 260, 60, 50);
        btnEquals.setBackground(new Color(200, 200, 255));

        JButton btnClear = new JButton("C");
        btnClear.setBounds(20, 260, 60, 50);
        btnClear.setBackground(new Color(255, 200, 200));

        // Add all buttons to frame
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btnDivide);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btnMultiply);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btnSubtract);
        frame.add(btnClear);
        frame.add(btn0);
        frame.add(btnEquals);
        frame.add(btnAdd);

        // Create action listener
        // Create action listener
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button = e.getActionCommand();

                if (button.equals("0") || button.equals("1") || button.equals("2")
                        || button.equals("3") || button.equals("4") || button.equals("5")
                        || button.equals("6") || button.equals("7") || button.equals("8")
                        || button.equals("9")) {
                    // Number button pressed - add to display
                    display.setText(display.getText() + button);
                } else if (button.equals("+") || button.equals("-")
                        || button.equals("*") || button.equals("/")) {
                    // Operation button pressed - add to display
                    display.setText(display.getText() + " " + button + " ");
                } else if (button.equals("=")) {
                    // Equals button pressed - calculate result
                    String expression = display.getText();
                    System.out.println(expression);
                    try {
                        // Simple evaluation of the expression
                        String[] parts = expression.split(" ");
                        int num1 = Integer.parseInt(parts[0]);
                        String operator = parts[1];
                        int num2 = Integer.parseInt(parts[2]);
                        int result = 0;

                        switch (operator) {
                            case "+":
                                result = num1 + num2;
                                break;
                            case "-":
                                result = num1 - num2;
                                break;
                            case "*":
                                result = num1 * num2;
                                break;
                            case "/":
                                result = num1 / num2;
                                break;
                        }

                        display.setText(String.valueOf(result));
                    } catch (Exception ex) {
                        display.setText("Error");
                    }
                } else if (button.equals("C")) {
                    // Clear button pressed - reset display
                    display.setText("");
                }
            }
        };

        // Add listener to all buttons
        btn0.addActionListener(listener);
        btn1.addActionListener(listener);
        btn2.addActionListener(listener);
        btn3.addActionListener(listener);
        btn4.addActionListener(listener);
        btn5.addActionListener(listener);
        btn6.addActionListener(listener);
        btn7.addActionListener(listener);
        btn8.addActionListener(listener);
        btn9.addActionListener(listener);
        btnAdd.addActionListener(listener);
        btnSubtract.addActionListener(listener);
        btnMultiply.addActionListener(listener);
        btnDivide.addActionListener(listener);
        btnEquals.addActionListener(listener);
        btnClear.addActionListener(listener);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();

        // // Create the frame
        // JFrame frame = new JFrame("Simple Calculator");
        // frame.setSize(300, 400);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(null);
        // frame.setResizable(false);

        // //texfield
        // // Create display
        // JTextField display = new JTextField();
        // display.setBounds(20, 20, 260, 50);
        // display.setEditable(false);
        // display.setHorizontalAlignment(JTextField.RIGHT);
        // frame.add(display);

        // // Create number buttons 
        // JButton btn7 = new JButton("7");
        // btn7.setBounds(20, 80, 60, 50);

        // JButton btn8 = new JButton("8");
        // btn8.setBounds(90, 80, 60, 50);

        // JButton btn9 = new JButton("9");
        // btn9.setBounds(160, 80, 60, 50);

        // JButton btn4 = new JButton("4");
        // btn4.setBounds(20, 140, 60, 50);

        // JButton btn5 = new JButton("5");
        // btn5.setBounds(90, 140, 60, 50);

        // JButton btn6 = new JButton("6");
        // btn6.setBounds(160, 140, 60, 50);

        // JButton btn1 = new JButton("1");
        // btn1.setBounds(20, 200, 60, 50);

        // JButton btn2 = new JButton("2");
        // btn2.setBounds(90, 200, 60, 50);

        // JButton btn3 = new JButton("3");
        // btn3.setBounds(160, 200, 60, 50);

        // JButton btn0 = new JButton("0");
        // btn0.setBounds(90, 260, 60, 50);

        // // Create operation buttons
        // JButton btnDivide = new JButton("/");
        // btnDivide.setBounds(230, 80, 60, 50);
        // btnDivide.setBackground(new Color(200, 200, 255));

        // JButton btnMultiply = new JButton("*");
        // btnMultiply.setBounds(230, 140, 60, 50);
        // btnMultiply.setBackground(new Color(200, 200, 255));

        // JButton btnSubtract = new JButton("-");
        // btnSubtract.setBounds(230, 200, 60, 50);
        // btnSubtract.setBackground(new Color(200, 200, 255));

        // JButton btnAdd = new JButton("+");
        // btnAdd.setBounds(230, 260, 60, 50);
        // btnAdd.setBackground(new Color(200, 200, 255));

        // JButton btnEquals = new JButton("=");
        // btnEquals.setBounds(160, 260, 60, 50);
        // btnEquals.setBackground(new Color(200, 200, 255));

        // JButton btnClear = new JButton("C");
        // btnClear.setBounds(20, 260, 60, 50);
        // btnClear.setBackground(new Color(255, 200, 200));

        // // Add all buttons to frame
        // frame.add(btn7);
        // frame.add(btn8);
        // frame.add(btn9);
        // frame.add(btnDivide);
        // frame.add(btn4);
        // frame.add(btn5);
        // frame.add(btn6);
        // frame.add(btnMultiply);
        // frame.add(btn1);
        // frame.add(btn2);
        // frame.add(btn3);
        // frame.add(btnSubtract);
        // frame.add(btnClear);
        // frame.add(btn0);
        // frame.add(btnEquals);
        // frame.add(btnAdd);

        // ActionListener listener = new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         String button = e.getActionCommand();
        //         display.setText(display.getText() + button);

        //         //simple option pane example
        //         // JOptionPane.showMessageDialog(frame, "Hello World!", "Message", JOptionPane.ERROR_MESSAGE);
        //     }
        // };

        // btn7.addActionListener(listener);
        // btn8.addActionListener(listener);

        // frame.setVisible(true);
    }
}
