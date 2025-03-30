
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public class App {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLayout(null);

        String[] items = {"Damak", "Biratnagar", "Kathmandu", "Pokhara", "Chitwan"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setBounds(50, 50, 150, 30);
        
        // date
        String days[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
            "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String years[] = {"2022", "2023", "2024", "2025"};

        JComboBox<String> day = new JComboBox<>(days);
        JComboBox<String> month = new JComboBox<>(months);
        JComboBox<String> year = new JComboBox<>(years);

        day.setBounds(50, 150, 50, 30);
        month.setBounds(100, 150, 50, 30);
        year.setBounds(150, 150, 70, 30);

        //radio button
        JRadioButton radioButton = new JRadioButton();
        radioButton
                .setBounds(50, 200, 100, 30);
        radioButton
                .setText("Male");
        JRadioButton radioButton2 = new JRadioButton();
        radioButton2
                .setBounds(150, 200, 100, 30);
        radioButton2
                .setText("Female");

        ButtonGroup radiobtn = new ButtonGroup();
        radiobtn.add(radioButton);
        radiobtn.add(radioButton2);



        // Label for Date
        JLabel dateLabel = new JLabel("Select Date:");
        dateLabel.setBounds(30, 350, 100, 30);
        frame.add(dateLabel);

        // ✅ JSpinner for selecting date
        JSpinner dateSpinner = new JSpinner(new SpinnerDateModel());
        dateSpinner.setBounds(120, 350, 120, 30);

        // ✅ Format Date Display (e.g., YYYY-MM-DD)
        JSpinner.DateEditor editor = new JSpinner.DateEditor(dateSpinner, "yyyy-MM-dd");
        dateSpinner.setEditor(editor);


        // String combo_value = comboBox.getSelectedItem().toString();
        JButton button = new JButton("Get Value");
        button.setBounds(50, 100, 100, 30);
        button.addActionListener(e -> {
            String combo_value = comboBox.getSelectedItem().toString();
            String date = day.getSelectedItem().toString() + " " + month.getSelectedItem().toString() + " "
                    + year.getSelectedItem().toString();
            JOptionPane.showMessageDialog(frame, "Selected Value: " + combo_value + "\n" + "Date: " + date);
            // JOptionPane.showMessageDialog(frame, "Selected Value: " + combo_value);
            JOptionPane.showMessageDialog(frame, "Selected Date spinner: " + dateSpinner.getValue());
        });

        frame.add(button);
        frame.add(comboBox);
        frame.add(day);
        frame.add(month);
        frame.add(year);
        frame.add(radioButton);
        frame.add(radioButton2);
        frame.add(dateLabel);
        frame.add(dateSpinner);
        

        frame.setVisible(true);

    }
}
