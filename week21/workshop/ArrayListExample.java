package week21.workshop;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

abstract class FutsalMember {

    private String name;
    private String id;
    private String phoneNumber;

    public FutsalMember(String name, String id, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

class RegualarMember extends FutsalMember {

    private String membershipType;

    public RegualarMember(String name, String id, String phoneNumber, String membershipType) {
        super(name, id, phoneNumber);
        this.membershipType = membershipType;
    }

    public String getMembershipType() {
        return membershipType;
    }
}

class PremiumMember extends FutsalMember {

    private String membershipType;

    public PremiumMember(String name, String id, String phoneNumber, String membershipType) {
        super(name, id, phoneNumber);
        this.membershipType = membershipType;
    }

    public String getMembershipType() {
        return membershipType;
    }
}

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<FutsalMember> members = new ArrayList<>();

        //GUI
        JFrame frame = new JFrame("Futsal Member Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        //jlabel
        JLabel label = new JLabel("Name: ");
        label.setBounds(50, 50, 100, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 30);

        JLabel idLabel = new JLabel("ID: ");
        idLabel.setBounds(50, 100, 100, 30);
        JTextField idField = new JTextField();
        idField.setBounds(150, 100, 200, 30);

        JLabel phoneLabel = new JLabel("Phone Number: ");
        phoneLabel.setBounds(50, 150, 100, 30);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(150, 150, 200, 30);

        JLabel membershipLabel = new JLabel("Membership Type: ");
        membershipLabel.setBounds(50, 200, 100, 30);
        JComboBox<String> membershipTypeComboBox = new JComboBox<>(new String[]{"Regular", "Premium"});
        membershipTypeComboBox.setBounds(150, 200, 200, 30);

        JButton registerButton = new JButton("Add Member");
        registerButton.setBounds(150, 250, 150, 30);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String name = nameField.getText();
                String id = idField.getText();
                String phoneNumber = phoneField.getText();
                String membershipType = (String) membershipTypeComboBox.getSelectedItem();

                if (membershipType == null) {
                    membershipType = "Regular";
                }

                RegualarMember newFutsalMember = new RegualarMember(name, id, phoneNumber, membershipType);
                members.add(newFutsalMember);
                JOptionPane.showMessageDialog(frame, "Member added successfully!");

                // Clear the fields after adding the member
                nameField.setText("");
                idField.setText("");
                phoneField.setText("");
                membershipTypeComboBox.setSelectedIndex(0);
            }
        });

        // Button to display all members
        JButton display = new JButton("Display Members");
        display.setBounds(50, 300, 150, 30);

        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                StringBuilder memberList = new StringBuilder();
                // Display all members in a dialog box
                for (FutsalMember member : members) {
                    memberList.append("Name: ").append(member.getName())
                            .append(", ID: ").append(member.getId())
                            .append(", Phone: ").append(member.getPhoneNumber())
                            .append(", Membership Type: ").append(((RegualarMember) member).getMembershipType())
                            .append("\n");

                    //calling display method from FutsalMember class
                    member.display();
                }

                JOptionPane.showMessageDialog(frame, memberList.toString());
                // JOptionPane.showMessageDialog(frame, "Name : " + member.getName() + "\nID : " + member.getId() + "\nPhone Number : " + member.getPhoneNumber() + "\nMembership Type : " + ((RegualarMember) member).getMembershipType());
            }
        });x

        frame.add(label);
        frame.add(nameField);
        frame.add(idLabel);
        frame.add(idField);
        frame.add(phoneLabel);
        frame.add(phoneField);
        frame.add(registerButton);
        frame.add(membershipLabel);
        frame.add(membershipTypeComboBox);
        frame.add(display);

        frame.setVisible(true);
    }
}
