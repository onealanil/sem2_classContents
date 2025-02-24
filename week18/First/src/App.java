import javax.swing.*;

public class App {
    private JFrame frame;

    public App() {
        frame = new JFrame("App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        ImageIcon icon = new ImageIcon(getClass().getResource("images/logo1.png"));
        frame.setIconImage(icon.getImage());

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}