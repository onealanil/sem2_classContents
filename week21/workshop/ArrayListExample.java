package week21.workshop;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

abstract class FutsalMember {

    protected String name;
    protected String id;
    protected String phoneNumber;
    protected boolean activeStatus;
    protected int attendance;

    public FutsalMember(String name, String id, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.activeStatus = false;
        this.attendance = 0;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return activeStatus;
    }

    public abstract void markAttendance();

    public void activeMemberShip() {
        if (!this.activeStatus) {
            this.activeStatus = true;
            System.out.println(name + "'s membership is now active.");
        } else {
            System.out.println(name + "'s membership is already active.");
        }
    }

    public void deactivateMembership() {
        if (activeStatus) {
            activeStatus = false;
            System.out.println(name + "'s membership is now inactive.");
        } else {
            System.out.println(name + "'s membership is already inactive.");
        }
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
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

    public void checkFunction(){
        System.out.println("This is a check function");
    }
}

class RegualarMember extends FutsalMember {

    private String membershipType;

    public RegualarMember(String name, String id, String phoneNumber) {
        super(name, id, phoneNumber);
        this.membershipType = membershipType;
    }

    @Override
    public void markAttendance() {
        System.out.println("Regular member attendance");
        if (isActive()) {
            attendance++;
            System.out.println(name + "'s attendance marked. Total attendance: " + attendance);
        } else {
            System.out.println(name + " cannot mark attendance - membership is inactive.");
        }
    }

    public String getMembershipType() {
        return membershipType;
    }
}

class PremiumMember extends FutsalMember {

    private String membershipType;

    public PremiumMember(String name, String id, String phoneNumber) {
        super(name, id, phoneNumber);
        this.membershipType = membershipType;
    }

    @Override
    public void markAttendance() {
        System.out.println("premium member attendance");
        if (isActive()) {
            attendance++;
            System.out.println(name + "'s attendance marked. Total attendance: " + super.getAttendance());
        } else {
            System.out.println(name + " cannot mark attendance - membership is inactive.");
        }
        if (super.getAttendance() == 30) {
            System.out.println("Congratulations! You have completed 30 days of attendance.");
        }
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
        frame.setSize(800, 800);
        frame.setLayout(null);

        //panel1
        JPanel panel1 = new JPanel();
        panel1.setBounds(50, 50, 700, 400);
        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Regular Member Registration"));
        panel1.setLayout(null);
        frame.add(panel1);

        //panel2
        JPanel panel2 = new JPanel();
        panel2.setBounds(750, 50, 700, 400);
        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Premium Member Registration"));
        panel2.setLayout(null);
        frame.add(panel2);

        //panel3 
        JPanel panel3 = new JPanel();
        panel3.setBounds(50, 500, 700, 400);
        panel3.setLayout(null);
        frame.add(panel3);

        //panel4 display member
        JPanel panel4 = new JPanel();
        panel4.setBounds(750, 500, 700, 400);
        panel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Display Members"));
        panel4.setLayout(null);
        frame.add(panel4);

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

        JButton registerButton = new JButton("Add Regular Member");
        registerButton.setBounds(150, 250, 200, 30);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String name = nameField.getText();
                String id = idField.getText();
                String phoneNumber = phoneField.getText();

                RegualarMember newFutsalMember = new RegualarMember(name, id, phoneNumber);
                members.add(newFutsalMember);
                JOptionPane.showMessageDialog(frame, "Member added successfully!");

                // Clear the fields after adding the member
                nameField.setText("");
                idField.setText("");
                phoneField.setText("");
            }
        });

        panel1.add(label);
        panel1.add(nameField);
        panel1.add(idLabel);
        panel1.add(idField);
        panel1.add(phoneLabel);
        panel1.add(phoneField);
        panel1.add(registerButton);

        //panel2
        JLabel label2 = new JLabel("Name: ");
        label2.setBounds(50, 50, 100, 30);
        JTextField nameField2 = new JTextField();
        nameField2.setBounds(150, 50, 200, 30);
        JLabel idLabel2 = new JLabel("ID: ");
        idLabel2.setBounds(50, 100, 100, 30);
        JTextField idField2 = new JTextField();
        idField2.setBounds(150, 100, 200, 30);
        JLabel phoneLabel2 = new JLabel("Phone Number: ");
        phoneLabel2.setBounds(50, 150, 100, 30);
        JTextField phoneField2 = new JTextField();
        phoneField2.setBounds(150, 150, 200, 30);
        JButton registerButton2 = new JButton("Add Premium Member");
        registerButton2.setBounds(150, 250, 200, 30);

        registerButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String name = nameField2.getText();
                String id = idField2.getText();
                String phoneNumber = phoneField2.getText();

                PremiumMember newFutsalMember = new PremiumMember(name, id, phoneNumber);
                members.add(newFutsalMember);
                JOptionPane.showMessageDialog(frame, "Member added successfully!");

                // Clear the fields after adding the member
                nameField2.setText("");
                idField2.setText("");
                phoneField2.setText("");
            }
        });

        panel2.add(label2);
        panel2.add(nameField2);
        panel2.add(idLabel2);
        panel2.add(idField2);
        panel2.add(phoneLabel2);
        panel2.add(phoneField2);
        panel2.add(registerButton2);

        //buttons activate membership
        JButton activateButton = new JButton("Activate Membership");
        activateButton.setBounds(50, 50, 200, 30);

        //activate button
        activateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String id = JOptionPane.showInputDialog(frame, "Enter Member ID to activate:");
                boolean found = false;
                for (FutsalMember member : members) {
                    if (member.getId().equals(id)) {
                        member.activeMemberShip();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(frame, "Member not found.");
                }
            }
        });

        //button to deactivate membership
        JButton deactivateButton = new JButton("Deactivate Membership");
        deactivateButton.setBounds(50, 100, 200, 30);

        //deactivate button
        deactivateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String id = JOptionPane.showInputDialog(frame, "Enter Member ID to deactivate:");
                boolean found = false;
                for (FutsalMember member : members) {
                    if (member.getId().equals(id)) {
                        member.deactivateMembership();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(frame, "Member not found.");
                }
            }
        });

        //mark attendance button
        JButton markAttendanceButton = new JButton("Mark Attendance");
        markAttendanceButton.setBounds(50, 200, 200, 30);
        //mark attendance button
        markAttendanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String id = JOptionPane.showInputDialog(frame, "Enter Member ID to mark attendance:");
                boolean found = false;
                for (FutsalMember member : members) {
                    if (member.getId().equals(id)) {
                        member.markAttendance();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(frame, "Member not found.");
                }
            }
        });

        // Button to display all members
        JButton display = new JButton("Display Members");
        display.setBounds(50, 150, 200, 30);

        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                panel4.removeAll(); // Clear previous labels

                int y = 20; // Y position to stack labels vertically
                for (FutsalMember member : members) {
                    String info = "Name: " + member.getName() + ", ID: " + member.getId()
                            + ", Phone: " + member.getPhoneNumber() + ", Active status: " + member.isActive() + ", Attendance: " + member.getAttendance() + ", Membership Type: " + (member instanceof RegualarMember ? "Regular" : "Premium");
                    JLabel memberLabel = new JLabel(info);
                    memberLabel.setBounds(20, y, 600, 30); // Adjust width as needed
                    panel4.add(memberLabel);
                    y += 35;

                    // Optionally print in console too
                    member.display();
                }

                // Refresh the panel to show new labels
                for(FutsalMember mem: members){
                    mem.checkFunction();
                }

                panel4.revalidate(); //updates layout
                panel4.repaint(); //redraws the updated content
            }
        });

        panel3.add(display);
        panel3.add(activateButton);
        panel3.add(deactivateButton);
        panel3.add(markAttendanceButton);

        frame.setVisible(true);
    }
}
