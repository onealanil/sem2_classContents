
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionListenerExample {

    public ActionListenerExample() {
        //button -> generate a click event
        //than we need to handle that event
        //we need to add an event listener to the button to listen to the click event
        //when the button is clicked, the event listener will handle the event
        //we need to define action performed method in the event listener to handle the event, with the parameter as the event object

        // Frame
        JFrame frame = new JFrame("Action Listener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 800);
        frame.setLayout(new GridBagLayout());

        // Button
        JButton button = new JButton("Click Me!");
        frame.add(button);

        // Add an Event Listener (Handles the Click Event) --> anonymous class
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                System.out.println("Action Command: " + actionCommand);
                // System.out.println("Button Clicked!"); // Event Handler
                // //simple option pane example
                // JOptionPane.showMessageDialog(frame, "Hello World!", "Message", JOptionPane.ERROR_MESSAGE);

                // //other types of option pane
                // int response = JOptionPane.showConfirmDialog(frame, "Confirm", "Confirm", JOptionPane.YES_NO_OPTION);
                // JOptionPane.showInputDialog(frame, "Input Dialog", "Input Dialog", JOptionPane.QUESTION_MESSAGE);
                // if (response == JOptionPane.YES_OPTION) {
                //     System.out.println("Yes");
                // } else {
                //     System.out.println("No");
                // }
            }
        });

        //option pane 
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Frame

        //button -> generate a click event
        //than we need to handle that event
        //we need to add an event listener to the button to listen to the click event
        //when the button is clicked, the event listener will handle the event
        //we need to define action performed method in the event listener to handle the event, with the parameter as the event object
        // Frame
        JFrame frame = new JFrame("Action Listener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 800);
        frame.setLayout(new GridBagLayout());

        // Button
        JButton button = new JButton("Anil Bhandari");
        frame.add(button);

        // Add an Event Listener (Handles the Click Event) --> anonymous class
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                System.out.println("Action Command: " + actionCommand);
                // System.out.println("Button Clicked!"); // Event Handler
                // //simple option pane example
                // JOptionPane.showMessageDialog(frame, "Hello World!", "Message", JOptionPane.ERROR_MESSAGE);

                // //other types of option pane
                // int response = JOptionPane.showConfirmDialog(frame, "Confirm", "Confirm", JOptionPane.YES_NO_OPTION);
                // JOptionPane.showInputDialog(frame, "Input Dialog", "Input Dialog", JOptionPane.QUESTION_MESSAGE);
                // if (response == JOptionPane.YES_OPTION) {
                //     System.out.println("Yes");
                // } else {
                //     System.out.println("No");
                // }
            }
        });

        //option pane 
        frame.setVisible(true);

    }
}
