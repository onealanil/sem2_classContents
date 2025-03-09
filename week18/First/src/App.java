import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class App {
    private JFrame frame;
    private JPanel panel1;
    private JLabel instrumentToRentLbl;

    public App() {
        frame = new JFrame("App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(900, 900);
        frame.setBounds(100,200,900,200);
        frame.setLayout(null);
        // for image icon 
        ImageIcon icon1 = new ImageIcon(getClass().getResource("logo1.png"));
        frame.setIconImage(icon1.getImage());

        panel1 = new JPanel();
        panel1.setBounds(10, 20, 500, 650);
        panel1.setLayout(null);
        // panel1.setBackground(c1)
        frame.add(panel1);

        instrumentToRentLbl = new JLabel();
        instrumentToRentLbl.setText("Instrument To Rent");
        instrumentToRentLbl.setBounds(200, 10, 200, 20);
        // instrumentToRentLbl.setBackground(Color.black);
        panel1.add(instrumentToRentLbl);



        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    //    JFrame frame = new JFrame("Swing Example");
    //     JButton btn = new JButton("Click Me");
    //     JLabel label = new JLabel("Hello, Swing!");
    //     JLabel label1 = new JLabel("This is panel 1");
    //     JLabel label2 = new JLabel("This is panel 2");
    //     //panel 
    //     JPanel panel1 = new JPanel();
    //     JPanel panel2 = new JPanel();


    //     btn.setBounds(100, 100, 100, 50);
    //     label.setBounds(100, 50, 200, 30);

        // btn.addActionListener(e -> {
        //    JOptionPane.showMessageDialog(frame, "This is information message", "Information", JOptionPane.ERROR_MESSAGE);
        // });

        // JPanel panel1 = new JPanel();
        // panel1.setBounds(50, 60, 150, 100);  // Properly sized
        // panel1.setBackground(Color.DARK_GRAY);
        // // JLabel label1 = new JLabel("This is panel 1");
        // label1.setForeground(Color.WHITE);
        // panel1.add(label1);

        // panel2.setBounds(51, 61, 150,100);
        // panel2.setBackground(Color.BLUE);
        // label1.setForeground(Color.WHITE);
        // panel2.add(label2);



        // frame.add(btn);
        // frame.add(label);
        // frame.add(panel1);
        // frame.add(panel2);
        // frame.setSize(500, 500);
        // frame.setLayout(null);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setVisible(true);
    }
}