
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelExample {
    public static void main(String[] args) {
            //creating frame
            JFrame frame = new JFrame("Futsal Management System");
            //setting default close operation to exit
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //setting full screen mode to frame
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setResizable(false);
            frame.setLayout(null);
    
            JLabel futsalLabel = new JLabel("Futsal Management System");
            futsalLabel.setBounds(900, 20, 200, 30);
            frame.add(futsalLabel);
    
            // Panel 1 -> Regular Futsal Member
            JPanel panel1 = new JPanel();
            panel1.setBounds(50, 80, 600, 400);
            panel1.setBorder(BorderFactory.createTitledBorder("Regular Futsal Member"));
            panel1.setLayout(null);
    
            JLabel regularTitle = new JLabel("Member Details");
            regularTitle.setBounds(50, 30, 200, 30);
            panel1.add(regularTitle);
    
            // First Name
            JLabel firstNameLabel1 = new JLabel("First Name:");
            firstNameLabel1.setBounds(50, 70, 100, 30);
            panel1.add(firstNameLabel1);
    
            JTextField firstNameField1 = new JTextField();
            firstNameField1.setBounds(200, 70, 150, 30);
            panel1.add(firstNameField1);
    
            // Last Name
            JLabel lastNameLabel1 = new JLabel("Last Name:");
            lastNameLabel1.setBounds(50, 110, 100, 30);
            panel1.add(lastNameLabel1);
    
            JTextField lastNameField1 = new JTextField();
            lastNameField1.setBounds(200, 110, 150, 30);
            panel1.add(lastNameField1);
    
            // Age
            JLabel ageLabel = new JLabel("Age:");
            ageLabel.setBounds(50, 150, 100, 30);
            panel1.add(ageLabel);
    
            JTextField ageField = new JTextField();
            ageField.setBounds(200, 150, 150, 30);
            panel1.add(ageField);
    
            // Phone Number
            JLabel phoneLabel = new JLabel("Phone:");
            phoneLabel.setBounds(50, 190, 100, 30);
            panel1.add(phoneLabel);
    
            JTextField phoneField = new JTextField();
            phoneField.setBounds(200, 190, 150, 30);
            panel1.add(phoneField);
    
            // Membership Type
            JLabel membershipLabel = new JLabel("Membership Type:");
            membershipLabel.setBounds(50, 230, 150, 30);
            panel1.add(membershipLabel);
    
            String[] membershipOptions = {"Monthly", "Quarterly", "Yearly"};
            JComboBox<String> membershipComboBox = new JComboBox<>(membershipOptions);
            membershipComboBox.setBounds(200, 230, 150, 30);
            panel1.add(membershipComboBox);
    
            //Add button
            JButton addButton = new JButton("Add Member");
            addButton.setBounds(200, 270, 150, 30);
            panel1.add(addButton);
    
            // Panel 2 -> Premium Futsal Member
            JPanel panel2 = new JPanel();
            panel2.setBounds(700, 80, 600, 400);
            panel2.setBorder(BorderFactory.createTitledBorder("Permium Futsal Member"));
            panel2.setLayout(null);
    
            JLabel premiumTitle = new JLabel("Premium Futsal Member");
            premiumTitle.setBounds(50, 30, 200, 30);
            panel2.add(premiumTitle);
    
            // First Name
            JLabel firstNameLabel2 = new JLabel("First Name:");
            firstNameLabel2.setBounds(50, 70, 100, 30);
            panel2.add(firstNameLabel2);
    
            JTextField firstNameField2 = new JTextField();
            firstNameField2.setBounds(200, 70, 150, 30);
            panel2.add(firstNameField2);
    
            // Last Name
            JLabel lastNameLabel2 = new JLabel("Last Name:");
            lastNameLabel2.setBounds(50, 110, 100, 30);
            panel2.add(lastNameLabel2);
    
            JTextField lastNameField2 = new JTextField();
            lastNameField2.setBounds(200, 110, 150, 30);
            panel2.add(lastNameField2);
    
            // Player ID
            JLabel playerIdLabel = new JLabel("Player ID:");
            playerIdLabel.setBounds(50, 150, 100, 30);
            panel2.add(playerIdLabel);
    
            JTextField playerIdField = new JTextField();
            playerIdField.setBounds(200, 150, 150, 30);
            panel2.add(playerIdField);
    
            // Training Level
            JLabel trainingLabel = new JLabel("Training Level:");
            trainingLabel.setBounds(50, 190, 100, 30);
            panel2.add(trainingLabel);
    
            String[] trainingLevels = {"Beginner", "Intermediate", "Advanced"};
            JComboBox<String> trainingComboBox = new JComboBox<>(trainingLevels);
            trainingComboBox.setBounds(200, 190, 150, 30);
            panel2.add(trainingComboBox);
    
            // Payment Status
            JLabel paymentLabel = new JLabel("Payment Status:");
            paymentLabel.setBounds(50, 230, 120, 30);
            panel2.add(paymentLabel);
    
            String[] paymentStatus = {"Paid", "Pending"};
            JComboBox<String> paymentComboBox = new JComboBox<>(paymentStatus);
            paymentComboBox.setBounds(200, 230, 150, 30);
            panel2.add(paymentComboBox);

    
            //Add button
            JButton addButton2 = new JButton("Add Member");
            addButton2.setBounds(200, 270, 150, 30);
            panel2.add(addButton2);

            addButton2.addActionListener((actionEvent) -> {
                System.out.println(paymentComboBox.getSelectedItem());
            });
    
            frame.add(panel1);
            frame.add(panel2);
            frame.setVisible(true);
    }
}
