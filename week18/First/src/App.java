import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
        // ImageIcon icon = new ImageIcon(getClass().getResource("images/logo1.png"));
        // frame.setIconImage(icon.getImage());

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
    }
}