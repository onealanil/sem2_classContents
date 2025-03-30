
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayoutPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2000, 800);
        frame.setLayout(new GridBagLayout());

        //panel 1
        JPanel panel1 = new JPanel(new GridBagLayout());
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel1.setPreferredSize(new Dimension(600, 500));

        //panel 2
        JPanel panel2 = new JPanel(new GridBagLayout());
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel2.setPreferredSize(new Dimension(600, 500));

        //setting constraints for frame to panel1 and panel2
        GridBagConstraints c1 = new GridBagConstraints();

        //insets for padding between panels and frame border
        c1.insets.set(10, 10, 10, 10);

        c1.gridx = 0;
        c1.gridy = 0;
        // c1.fill = GridBagConstraints.BOTH;
        frame.add(panel1, c1);

        c1.weightx = 1;
        c1.weighty = 0;
        // c1.anchor = GridBagConstraints.NORTH;

        c1.gridx = 1;
        c1.gridy = 0;
        // c2.weightx = 0.5;
        // c2.weighty = 0.5;
        // c2.fill = GridBagConstraints.BOTH;
        frame.add(panel2, c1);

        GridBagConstraints c2 = new GridBagConstraints();
        c2.insets.set(10, 10, 10, 10);

        // c2.fill = GridBagConstraints.HORIZONTAL;

        c2.anchor = GridBagConstraints.LINE_START;

        // First Name
        c2.gridx = 0;
        c2.gridy = 0;
        JLabel firstNameLabel1 = new JLabel("First Name:");
        panel1.add(firstNameLabel1, c2);

        c2.gridx = 1;
        c2.gridy = 0;
        c2.weightx = 1;
        c2.fill = GridBagConstraints.HORIZONTAL;
        JTextField firstNameField1 = new JTextField();
        panel1.add(firstNameField1, c2);

        // Last Name
        c2.gridx = 0;
        c2.gridy = 1;
        JLabel lastNameLabel1 = new JLabel("Last Name:");
        panel1.add(lastNameLabel1, c2);

        c2.gridx = 1;
        c2.gridy = 1;
        JTextField lastNameField1 = new JTextField(20);
        panel1.add(lastNameField1, c2);

        c2.gridx = 0;
        c2.gridy = 2;
        JLabel ageLabel = new JLabel("Age:");
        panel1.add(ageLabel, c2);

        c2.gridx = 1;
        c2.gridy = 2;
        JTextField ageField = new JTextField(20);
        panel1.add(ageField, c2);

        // Phone Number
        c2.gridx = 0;
        c2.gridy = 3;
        JLabel phoneLabel = new JLabel("Phone:");
        panel1.add(phoneLabel, c2);

        c2.gridx = 1;
        c2.gridy = 3;
        JTextField phoneField = new JTextField(20);
        panel1.add(phoneField, c2);

        // Membership Type
        c2.gridx = 0;
        c2.gridy = 4;
        JLabel membershipLabel = new JLabel("Membership Type:");
        panel1.add(membershipLabel, c2);

        c2.gridx = 1;
        c2.gridy = 4;
        String[] membershipOptions = {"Monthly", "Quarterly", "Yearly"};
        JComboBox<String> membershipComboBox = new JComboBox<>(membershipOptions);
        // membershipComboBox.setSize(20, 10);
        panel1.add(membershipComboBox, c2);

        //Add button
        c2.gridx = 1;
        c2.gridy = 5;
        JButton addButton = new JButton("Add Member");
        panel1.add(addButton, c2);

        frame.setVisible(true);
    }
}
