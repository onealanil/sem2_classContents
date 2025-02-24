import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SarangiSansar {

    // arraylist
    ArrayList<Instrument> instrumentList = new ArrayList<>();

    // for empty case-->int
    final static int EMPTY = -1;
    // for negative or 0 case -->int
    final static int INVALID = -2;
    //handling negative or zero case
    int negativeOrZero = 1;
    //handling exception case
    String exceptionCase = " ";

    private JWindow window;
    private JFrame frame;
    private JPanel panel1, panel2, subPanel1, subPanel2, subPanel3, subPanel4, subPanel5, subPanel6, subPanelT1,
            subPanelT2;
    private JTextArea textArea1, textArea2;
    private JLabel addToRentInstrument, instrumentToRentLbl, instrumentToSellLbl, chargePerDayLbl, instrumentToRentName,
            customerName, customerRentPhone, dateOfRent, dateOfReturn, noOfDays, instrumentToReturnName, panRent,
            addToSellInstrumentName, price, instrumentSellName, customerNameSell, customerPhSell, panSell, sellDate,
            discountPercent;
    private JTextField addToRentInstrumentTF, chargePerDayTF, instrumentToRentNameTF, customerNameTF,
            customerRentPhoneTF,
            noOfDaysTF, instrumentNameReturnTF, panRentTF, addToSellInstrumentNameTF, priceTF, instrumentSellNameTF,
            customerNameSellTF, customerPhSellTF, panSellTF, discountPercentTF;
    private JButton addRentInstrument, rentInstrument, returnInstrument, displayRentInstrument, clearRentInstrument,
            addSellInstrument, sellInstrument, displaySellInstrument, clearSellInstrument, clearTF1, clearTF2;
    private JComboBox<String> dayRent, monthRent, yearRent, dayReturn, monthReturn, yearReturn, daySell, monthSell,
            yearSell;

    public SarangiSansar() {

        // date
        String days[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
        String years[] = { "2022", "2023", "2024", "2025" };

        // color
        Color c1 = new Color(195, 180, 243);

        // getting image for the icon at the title bar
        ImageIcon icons = new ImageIcon(getClass().getClassLoader().getResource("./image/logo1.png"));

        // loader start **********
        window = new JWindow();
        window.getContentPane().add(new JLabel("Loading...", SwingConstants.CENTER));
        window.setBounds(450, 250, 400, 200);
        window.setBackground(c1);
        window.setVisible(true);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        // loader end ************

        // frame
        frame = new JFrame();
        frame.setTitle("SarangiSansar");
        frame.setIconImage(icons.getImage());
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setResizable(false);


        // panel 1 --> Instrument to rent
        panel1 = new JPanel();
        panel1.setBounds(10, 20, 500, 650);
        panel1.setLayout(null);
        panel1.setBackground(c1);
        frame.add(panel1);

        instrumentToRentLbl = new JLabel();
        instrumentToRentLbl.setText("Instrument To Rent");
        instrumentToRentLbl.setBounds(200, 10, 200, 20);
        instrumentToRentLbl.setBackground(Color.black);
        panel1.add(instrumentToRentLbl);

        // sub panel 1 --> add to instrument
        subPanel1 = new JPanel();
        subPanel1.setBounds(10, 40, 480, 130);
        subPanel1.setLayout(null);
        panel1.add(subPanel1);

        addToRentInstrument = new JLabel();
        addToRentInstrument.setText("Instrument Name: ");
        addToRentInstrument.setBounds(10, 15, 150, 30);
        subPanel1.add(addToRentInstrument);

        addToRentInstrumentTF = new JTextField();
        addToRentInstrumentTF.setBounds(170, 15, 200, 30);
        subPanel1.add(addToRentInstrumentTF);

        chargePerDayLbl = new JLabel();
        chargePerDayLbl.setText("Charge per day: ");
        chargePerDayLbl.setBounds(10, 50, 150, 30);
        subPanel1.add(chargePerDayLbl);

        chargePerDayTF = new JTextField();
        chargePerDayTF.setBounds(170, 50, 200, 30);
        subPanel1.add(chargePerDayTF);

        // add to instrument button
        addRentInstrument = new JButton("Add");
        addRentInstrument.setBounds(200, 90, 90, 30);
        addRentInstrument.setFocusPainted(false);
        addRentInstrument.setBackground(c1);
        addRentInstrument.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInstrumentToRentHandler();
            }
        });
        subPanel1.add(addRentInstrument);

        // sub panel 2 --> rent the instrument

        subPanel2 = new JPanel();
        subPanel2.setBounds(10, 180, 480, 310);
        subPanel2.setLayout(null);
        panel1.add(subPanel2);

        instrumentToRentName = new JLabel();
        instrumentToRentName.setText("Instrument Name: ");
        instrumentToRentName.setBounds(10, 15, 150, 30);
        subPanel2.add(instrumentToRentName);

        instrumentToRentNameTF = new JTextField();
        instrumentToRentNameTF.setBounds(170, 15, 200, 30);
        subPanel2.add(instrumentToRentNameTF);

        customerName = new JLabel();
        customerName.setText("Customer Name: ");
        customerName.setBounds(10, 50, 150, 30);
        subPanel2.add(customerName);

        customerNameTF = new JTextField();
        customerNameTF.setBounds(170, 50, 200, 30);
        subPanel2.add(customerNameTF);

        customerRentPhone = new JLabel();
        customerRentPhone.setText("Phone no:");
        customerRentPhone.setBounds(10, 85, 150, 30);
        subPanel2.add(customerRentPhone);

        customerRentPhoneTF = new JTextField();
        customerRentPhoneTF.setBounds(170, 85, 200, 30);
        subPanel2.add(customerRentPhoneTF);

        panRent = new JLabel();
        panRent.setText("PAN No:");
        panRent.setBounds(10, 120, 150, 30);
        subPanel2.add(panRent);

        panRentTF = new JTextField();
        panRentTF.setBounds(170, 120, 200, 30);
        subPanel2.add(panRentTF);

        dateOfRent = new JLabel();
        dateOfRent.setText("Date of Rent: ");
        dateOfRent.setBounds(10, 150, 150, 30);
        subPanel2.add(dateOfRent);

        dayRent = new JComboBox<>(days);
        monthRent = new JComboBox<>(months);
        yearRent = new JComboBox<>(years);

        dayRent.setBounds(170, 155, 50, 20);
        dayRent.setBackground(c1);
        monthRent.setBounds(225, 155, 50, 20);
        monthRent.setBackground(c1);
        yearRent.setBounds(280, 155, 60, 20);
        yearRent.setBackground(c1);

        subPanel2.add(dayRent);
        subPanel2.add(monthRent);
        subPanel2.add(yearRent);

        dateOfReturn = new JLabel();
        dateOfReturn.setText("Date of Return: ");
        dateOfReturn.setBounds(10, 185, 150, 30);
        subPanel2.add(dateOfReturn);

        dayReturn = new JComboBox<>(days);
        monthReturn = new JComboBox<>(months);
        yearReturn = new JComboBox<>(years);

        dayReturn.setBounds(170, 190, 50, 20);
        dayReturn.setBackground(c1);
        monthReturn.setBounds(225, 190, 50, 20);
        monthReturn.setBackground(c1);
        yearReturn.setBounds(280, 190, 60, 20);
        yearReturn.setBackground(c1);

        subPanel2.add(dayReturn);
        subPanel2.add(monthReturn);
        subPanel2.add(yearReturn);

        noOfDays = new JLabel();
        noOfDays.setText("No of Days: ");
        noOfDays.setBounds(10, 225, 150, 30);
        subPanel2.add(noOfDays);

        noOfDaysTF = new JTextField();
        noOfDaysTF.setBounds(170, 225, 70, 30);
        subPanel2.add(noOfDaysTF);

        // rent handler
        rentInstrument = new JButton("Rent");
        rentInstrument.setBounds(200, 265, 90, 30);
        rentInstrument.setFocusPainted(false);
        rentInstrument.setBackground(c1);
        rentInstrument.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rentInstrumentHandler();
            }
        });
        subPanel2.add(rentInstrument);

        // subPanel3 --> return
        subPanel3 = new JPanel();
        subPanel3.setBounds(10, 500, 480, 100);
        subPanel3.setLayout(null);
        panel1.add(subPanel3);

        instrumentToReturnName = new JLabel();
        instrumentToReturnName.setText("Instrument Name: ");
        instrumentToReturnName.setBounds(10, 15, 150, 30);
        subPanel3.add(instrumentToReturnName);

        instrumentNameReturnTF = new JTextField();
        instrumentNameReturnTF.setBounds(170, 15, 200, 30);
        subPanel3.add(instrumentNameReturnTF);

        // return handler
        returnInstrument = new JButton("Return");
        returnInstrument.setBounds(200, 55, 90, 30);
        returnInstrument.setFocusPainted(false);
        returnInstrument.setBackground(c1);
        returnInstrument.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                returnInstrument();
            }
        });
        subPanel3.add(returnInstrument);

        // display handler for rent
        displayRentInstrument = new JButton("Display");
        displayRentInstrument.setBounds(150, 610, 90, 30);
        displayRentInstrument.setFocusPainted(false);
        displayRentInstrument.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayRentHandler();
            }
        });
        panel1.add(displayRentInstrument);

        // clear handler for rent
        clearRentInstrument = new JButton("Clear");
        clearRentInstrument.setBounds(250, 610, 90, 30);
        clearRentInstrument.setFocusPainted(false);
        clearRentInstrument.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearRentHandler();
            }
        });
        panel1.add(clearRentInstrument);

        // instrument note --> for rent
        subPanelT1 = new JPanel();
        subPanelT1.setBounds(515, 20, 245, 320);
        subPanelT1.setBackground(c1);
        subPanelT1.setLayout(null);
        frame.add(subPanelT1);

        // title subPanel--> rent
        JLabel listRent = new JLabel();
        listRent.setText("Instrument in Renting stock");
        listRent.setBounds(35, 5, 400, 30);
        subPanelT1.add(listRent);

        // text area -->rent
        textArea1 = new JTextArea();
        textArea1.setBounds(10, 40, 225, 250);
        textArea1.setLineWrap(true);
        textArea1.setEditable(false);
        textArea1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        subPanelT1.add(textArea1);

        // clear textfield --> rent
        clearTF1 = new JButton("clear");
        clearTF1.setBounds(165, 295, 70, 20);
        clearTF1.setFocusPainted(false);
        clearTF1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });
        subPanelT1.add(clearTF1);

        // instrument note --> for sell
        subPanelT2 = new JPanel();
        subPanelT2.setBounds(515, 350, 245, 320);
        subPanelT2.setLayout(null);
        subPanelT2.setBackground(c1);
        frame.add(subPanelT2);

        // title subPanel--> sell
        JLabel listSell = new JLabel();
        listSell.setText("Instrument in Selling stock");
        listSell.setBounds(35, 5, 400, 30);
        subPanelT2.add(listSell);

        // text area -->sell
        textArea2 = new JTextArea();
        textArea2.setBounds(10, 40, 225, 250);
        textArea2.setLineWrap(true);
        textArea2.setEditable(false);
        textArea2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        subPanelT2.add(textArea2);

        // clear textfield --> sell
        clearTF2 = new JButton("clear");
        clearTF2.setBounds(165, 295, 70, 20);
        clearTF2.setFocusPainted(false);
        clearTF2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea2.setText("");
            }
        });
        subPanelT2.add(clearTF2);

        // panel 2 --> Instrument to sell
        panel2 = new JPanel();
        panel2.setBounds(765, 20, 500, 650);
        panel2.setLayout(null);
        panel2.setBackground(c1);
        frame.add(panel2);

        instrumentToSellLbl = new JLabel();
        instrumentToSellLbl.setText("Instrument To Sell");
        instrumentToSellLbl.setBounds(200, 10, 150, 20);
        panel2.add(instrumentToSellLbl);

        // sub panel 4 --> add to instrument for sell
        subPanel4 = new JPanel();
        subPanel4.setBounds(10, 40, 480, 130);
        subPanel4.setLayout(null);
        panel2.add(subPanel4);

        addToSellInstrumentName = new JLabel();
        addToSellInstrumentName.setText("Instrument Name: ");
        addToSellInstrumentName.setBounds(10, 15, 150, 30);
        subPanel4.add(addToSellInstrumentName);

        addToSellInstrumentNameTF = new JTextField();
        addToSellInstrumentNameTF.setBounds(170, 15, 200, 30);
        subPanel4.add(addToSellInstrumentNameTF);

        price = new JLabel();
        price.setText("Price: ");
        price.setBounds(10, 50, 150, 30);
        subPanel4.add(price);

        priceTF = new JTextField();
        priceTF.setBounds(170, 50, 200, 30);
        subPanel4.add(priceTF);

        // add to instrument for sell button
        addSellInstrument = new JButton("Add");
        addSellInstrument.setBounds(200, 90, 90, 30);
        addSellInstrument.setFocusPainted(false);
        addSellInstrument.setBackground(c1);
        addSellInstrument.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInstrumentForSellHandler();
            }
        });
        subPanel4.add(addSellInstrument);

        // sub panel 5 --> sell the instrument

        subPanel5 = new JPanel();
        subPanel5.setBounds(10, 180, 480, 270);
        subPanel5.setLayout(null);
        panel2.add(subPanel5);

        instrumentSellName = new JLabel();
        instrumentSellName.setText("Instrument Name: ");
        instrumentSellName.setBounds(10, 15, 150, 30);
        subPanel5.add(instrumentSellName);

        instrumentSellNameTF = new JTextField();
        instrumentSellNameTF.setBounds(170, 15, 200, 30);
        subPanel5.add(instrumentSellNameTF);

        customerNameSell = new JLabel();
        customerNameSell.setText("Customer Name: ");
        customerNameSell.setBounds(10, 50, 150, 30);
        subPanel5.add(customerNameSell);

        customerNameSellTF = new JTextField();
        customerNameSellTF.setBounds(170, 50, 200, 30);
        subPanel5.add(customerNameSellTF);

        customerPhSell = new JLabel();
        customerPhSell.setText("Customer Number:");
        customerPhSell.setBounds(10, 85, 150, 30);
        subPanel5.add(customerPhSell);

        customerPhSellTF = new JTextField();
        customerPhSellTF.setBounds(170, 85, 200, 30);
        subPanel5.add(customerPhSellTF);

        panSell = new JLabel();
        panSell.setText("PAN No:");
        panSell.setBounds(10, 120, 150, 30);
        subPanel5.add(panSell);

        panSellTF = new JTextField();
        panSellTF.setBounds(170, 120, 200, 30);
        subPanel5.add(panSellTF);

        sellDate = new JLabel();
        sellDate.setText("Date of Sell: ");
        sellDate.setBounds(10, 150, 150, 30);
        subPanel5.add(sellDate);

        daySell = new JComboBox<>(days);
        monthSell = new JComboBox<>(months);
        yearSell = new JComboBox<>(years);

        daySell.setBounds(170, 155, 50, 20);
        daySell.setBackground(c1);
        monthSell.setBounds(225, 155, 50, 20);
        monthSell.setBackground(c1);
        yearSell.setBounds(280, 155, 60, 20);
        yearSell.setBackground(c1);

        subPanel5.add(daySell);
        subPanel5.add(monthSell);
        subPanel5.add(yearSell);

        discountPercent = new JLabel();
        discountPercent.setText("Discount Percent: ");
        discountPercent.setBounds(10, 185, 150, 30);
        subPanel5.add(discountPercent);

        discountPercentTF = new JTextField();
        discountPercentTF.setBounds(170, 185, 70, 30);
        subPanel5.add(discountPercentTF);

        // sell handler
        sellInstrument = new JButton("Sell");
        sellInstrument.setBounds(200, 225, 90, 30);
        sellInstrument.setFocusPainted(false);
        sellInstrument.setBackground(c1);
        sellInstrument.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sellInstrumentHandler();
            }
        });
        subPanel5.add(sellInstrument);

        // display handler for sell
        displaySellInstrument = new JButton("Display");
        displaySellInstrument.setBounds(150, 460, 90, 30);
        displaySellInstrument.setFocusPainted(false);
        displaySellInstrument.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displaySellHandler();
            }
        });
        panel2.add(displaySellInstrument);

        // clear handler for sell
        clearSellInstrument = new JButton("Clear");
        clearSellInstrument.setBounds(250, 460, 90, 30);
        clearSellInstrument.setFocusPainted(false);
        clearSellInstrument.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearSellHandler();
            }
        });
        panel2.add(clearSellInstrument);

        subPanel6 = new JPanel();
        subPanel6.setBounds(10, 500, 140, 140);
        subPanel6.setBackground(c1);
        panel2.add(subPanel6);

        // adding image icon and copyright text
        ImageIcon img = new ImageIcon(this.getClass().getResource("./image/logo.png"));
        img.setImage(img.getImage().getScaledInstance(140, 140,
                Image.SCALE_DEFAULT));
        JLabel ja = new JLabel(img);
        ja.setBounds(10, 10, 150, 140);
        subPanel6.add(ja);

        JLabel copyright = new JLabel("Copyright \uu00a9 SarangiSansar");
        copyright.setBounds(260, 580, 200, 50);
        copyright.setFont(new Font("Arial", Font.PLAIN, 16));
        panel2.add(copyright);

        window.dispose();// disposing the loading window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SarangiSansar();
    }

    // calling add to instrument handler --> rent
    public void addInstrumentToRentHandler() {
        String instrumentName = getInstrumentToRentName();
        int chargePerDay = getChargePerDay();
        boolean isUnique = true;

        // negative
        if (negativeOrZero == 2) {
            negativeOrZero = 1;
            return;
        }

        // valid
        if (exceptionCase == "invalid") {
            exceptionCase = " ";
            return;
        }

        if (instrumentName.isEmpty() || chargePerDay == EMPTY) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields !!", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (int i = 0; i < instrumentList.size(); i++) {
            if (instrumentList.get(i).getInstrumentName().toLowerCase().equals(instrumentName.toLowerCase())) {
                isUnique = false;
                JOptionPane.showMessageDialog(frame, "Instrument Name must be unique !!", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                break;
            }
        }

        if (isUnique && chargePerDay != INVALID) {
            instrumentList.add(new InstrumentToRent(instrumentName, chargePerDay));
            JOptionPane.showMessageDialog(frame, instrumentName
                    + " is, Successfully added in the renting stock with charger per day :" + chargePerDay);
            //adding the instrument name in textArea1 where the instrument in renting stock is displayed
            textArea1.append(instrumentName + "\n");
        }

    }

    // instrument name to add instrument --> rent
    public String getInstrumentToRentName() {
        return addToRentInstrumentTF.getText().trim();
    }

    // charge per day -->rent
    public int getChargePerDay() {
        String chargePerDayText = chargePerDayTF.getText().trim();
        int chargePerDay = INVALID;

        if (chargePerDayText.isEmpty()) {
            chargePerDay = EMPTY;
            return chargePerDay;
        }

        try {
            chargePerDay = Integer.parseInt(chargePerDayText);
            if (chargePerDay <= 0) {
                JOptionPane.showMessageDialog(frame, "Charge Per day can not be negative or 0 !!", "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                chargePerDay = INVALID;
                negativeOrZero = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "charge Per day is not valid !!", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            exceptionCase = "invalid";
        }
        return chargePerDay;

    }

    // calling method rentInstrument to rent instrument
    public void rentInstrumentHandler() {
        String instrumentName = getInstrumentNameForRent();
        String customerName = getCustomerNameForRent();
        String customerPhone = getCustomerPhoneNumberRent();
        int customerPan = getPanNoRent();
        String dateOfRent = getDateOfRent();
        String dateOfReturn = getDateOfReturn();
        int noOfDays = getNoOfDays();
        boolean notFound = true;

        // negative
        if (negativeOrZero == 2) {
            negativeOrZero = 1;
            return;
        }

        // valid
        if (exceptionCase == "invalid") {
            exceptionCase = " ";
            return;
        }

        if (instrumentName.isEmpty() || customerPan == EMPTY || noOfDays == EMPTY || customerName.isEmpty()
                || customerPhone.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields !!", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (instrumentList.size() > 0) {
            for (int i = 0; i < instrumentList.size(); i++) {
                if (instrumentList.get(i).getInstrumentName().toLowerCase()
                        .equals(instrumentName.toLowerCase())) {
                    //checking the if it is instanceof InstrumentToRent class or not
                    if (instrumentList.get(i) instanceof InstrumentToRent) {
                        InstrumentToRent obj = (InstrumentToRent) instrumentList.get(i);
                        if (obj.getIsRented()) {
                            notFound = false;
                            JOptionPane.showMessageDialog(frame, instrumentName + " is already rented !!",
                                    "ERROR",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        obj.rentOut(customerName, customerPhone, customerPan, dateOfRent,
                                dateOfReturn,
                                noOfDays);
                        notFound = false;
                        JOptionPane.showMessageDialog(frame, "Successfully rented..");
                        int total = obj.getChargePerDay() * noOfDays;
                        JOptionPane.showMessageDialog(frame,
                                "Customer and Instrument Details: \n Instrument Name: " + instrumentName
                                        + "\n Charge Per Day:"
                                        + obj.getChargePerDay() + "\n Customer Name: "
                                        + customerName + "\n Customer number: " + customerPhone + "\n Customer PAN: "
                                        + customerPan + "\n Date of Rent: " + dateOfRent + "\n Date of Return: "
                                        + dateOfReturn
                                        + "\n No.Of Days: " + noOfDays + "\n Total charge: " + total);
                        obj.setIsRented(true);
                        break;

                    }
                }
            }
        }

        if (notFound == true) {
            JOptionPane.showMessageDialog(frame, instrumentName + " is not found in renting stock !!", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    // getting instrument name for rent
    public String getInstrumentNameForRent() {
        return instrumentToRentNameTF.getText().trim();
    }

    // getting customer name for rent
    public String getCustomerNameForRent() {
        return customerNameTF.getText().trim();
    }

    // getting customer phone for rent
    public String getCustomerPhoneNumberRent() {
        String userNumber = customerRentPhoneTF.getText().trim();
        if (!userNumber.matches("\\d*")) {
            JOptionPane.showMessageDialog(frame, "phone number is invalid !!",
                    "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            negativeOrZero = 2;
        }
        return userNumber;

    }

    // getting customer date of rent
    public String getDateOfRent() {
        return dayRent.getSelectedItem().toString() + " " +
                monthRent.getSelectedItem().toString() + " "
                + yearRent.getSelectedItem().toString();
    }

    // getting customer date of return
    public String getDateOfReturn() {
        return dayReturn.getSelectedItem().toString() + " " +
                monthReturn.getSelectedItem().toString() + " "
                + yearReturn.getSelectedItem().toString();
    }

    // get pan no for --> rent
    public int getPanNoRent() {
        String panNoText = panRentTF.getText().trim();
        int panNo = INVALID;

        if (panNoText.isEmpty()) {
            panNo = EMPTY;
            return panNo;
        }

        try {
            panNo = Integer.parseInt(panNoText);
            if (panNo <= 0) {
                JOptionPane.showMessageDialog(frame, "PAN No. can not be negative or 0 !!",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                panNo = INVALID;
                negativeOrZero = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "PAN NO. is not valid !!", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            exceptionCase = "invalid";

        }
        return panNo;

    }

    // get no of day --> rent
    public int getNoOfDays() {
        String noOfDaysText = noOfDaysTF.getText().trim();
        int noOfDays = INVALID;

        if (noOfDaysText.isEmpty()) {
            noOfDays = EMPTY;
            return noOfDays;
        }

        try {
            noOfDays = Integer.parseInt(noOfDaysText);
            if (noOfDays <= 0) {
                JOptionPane.showMessageDialog(frame, "Number of Days can not be negative !!",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                noOfDays = INVALID;
                negativeOrZero = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Number of Days is not valid !!", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            exceptionCase = "invalid";

        }
        return noOfDays;

    }

    // return instrument
    public void returnInstrument() {
        String instrumentName = instrumentNameReturnTF.getText().trim();
        boolean moreThanZero = false;

        if (instrumentName.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields !!", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (instrumentList.size() > 0) {

            for (int i = 0; i < instrumentList.size(); i++) {
                if (instrumentList.get(i).getInstrumentName().toLowerCase().equals(instrumentName.toLowerCase())) {
                    if (instrumentList.get(i) instanceof InstrumentToRent) {
                        InstrumentToRent obj = (InstrumentToRent) instrumentList.get(i);
                        if (obj.getIsRented() == false) {
                            JOptionPane.showMessageDialog(frame, "We did not rent this instrument !!",
                                    "ERROR",
                                    JOptionPane.ERROR_MESSAGE);
                            moreThanZero = true;
                            return;
                        }
                        obj.returnInstrument();
                        JOptionPane.showMessageDialog(frame, instrumentName + " is Successfully returned..");
                        obj.setIsRented(false);
                        moreThanZero = true;
                        break;

                    }
                }
            }
        }
        if (moreThanZero == false) {
            JOptionPane.showMessageDialog(frame, instrumentName + " is neither on stock, nor we rent it!!", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // clear in rent
    public void clearRentHandler() {
        addToRentInstrumentTF.setText("");
        chargePerDayTF.setText("");
        instrumentToRentNameTF.setText("");
        customerNameTF.setText("");
        customerRentPhoneTF.setText("");
        panRentTF.setText("");
        noOfDaysTF.setText("");
        instrumentNameReturnTF.setText("");
    }

    // validation for sell
    // add to instrument handler-->sell
    public void addInstrumentForSellHandler() {
        String instrumentName = addToSellInstrumentNameTF.getText().trim();
        int price = getPrice();
        boolean isUnique = true;

        // negative
        if (negativeOrZero == 2) {
            negativeOrZero = 1;
            return;
        }

        // valid
        if (exceptionCase == "invalid") {
            exceptionCase = " ";
            return;
        }

        if (instrumentName.isEmpty() || price == EMPTY) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields !!", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (int i = 0; i < instrumentList.size(); i++) {
            if (instrumentList.get(i).getInstrumentName().toLowerCase().equals(instrumentName.toLowerCase())) {
                isUnique = false;
                JOptionPane.showMessageDialog(frame, "Instrument Name must be unique !!",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                break;
            }
        }

        if (isUnique && price != INVALID) {
            instrumentList.add(new InstrumentToSell(instrumentName, price));
            JOptionPane.showMessageDialog(frame,
                    instrumentName + " is, Successfully added in the selling stock with price: " + price);
            //adding the instrument name in textArea2 where the instrument name of the selling stock is displayed
            textArea2.append(instrumentName + "\n");
        }

    }

    // price for sell -->sell
    public int getPrice() {
        // empty -1 //invalid -2
        String priceText = priceTF.getText().trim();
        int price = INVALID;

        if (priceText.isEmpty()) {
            price = EMPTY;
            return price;
        }

        try {
            price = Integer.parseInt(priceText);
            if (price <= 0) {
                JOptionPane.showMessageDialog(frame, "Price can not be negative or 0 !!",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                price = INVALID;
                negativeOrZero = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Price is not valid !!", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            exceptionCase = "invalid";
        }
        return price;
    }

    // sell the instrument
    public void sellInstrumentHandler() {
        String instrumentName = getInstrumentNameForSell();
        String customerName = getCustomerNameForSell();
        String customerPh = getCustomerPhForSell();
        int customerPan = getPanNoSell();
        String dateOfSell = getDateOfSell();
        int discountPercent = getDiscountPercent();
        boolean notFound = true;

        // negative
        if (negativeOrZero == 2) {
            negativeOrZero = 1;
            return;
        }

        // valid
        if (exceptionCase == "invalid") {
            exceptionCase = " ";
            return;
        }

        if (instrumentName.isEmpty() || customerPan == EMPTY ||
                discountPercent == EMPTY
                || customerName.isEmpty()
                || customerPh.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields !!", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (instrumentList.size() > 0) {
            for (int i = 0; i < instrumentList.size(); i++) {
                if (instrumentList.get(i).getInstrumentName().toLowerCase()
                        .equals(instrumentName.toLowerCase())) {
                    if (instrumentList.get(i) instanceof InstrumentToSell) {
                        InstrumentToSell objS = (InstrumentToSell) instrumentList.get(i);
                        if (objS.getIssold() == true) {
                            notFound = false;
                            JOptionPane.showMessageDialog(frame, instrumentName + " is already sold", "WARNING",
                                    JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        notFound = false;
                        objS.sell(customerName, customerPh,
                                customerPan,
                                dateOfSell,
                                discountPercent);
                        objS.setIsSold(true);
                        JOptionPane.showMessageDialog(frame, "Successfully sold..");
                        double discountPercentDouble = objS.getDiscountPercent(); // int to double
                        double priceWithoutDiscountDouble = objS.getPrice(); // int to double
                        // formulae of discount amount
                        double discountAmountDouble = (priceWithoutDiscountDouble * discountPercentDouble) / 100;
                        // total price of instrument with discount
                        double totalPriceWithDiscount = priceWithoutDiscountDouble - discountAmountDouble;
                        JOptionPane.showMessageDialog(frame,
                                "Customer Details: \n Instrument Name: " + instrumentName
                                        + " \n Price without discount: " + priceWithoutDiscountDouble
                                        + "\n Customer Name: "
                                        + customerName + " \n Customer Phone Number: " + customerPh
                                        + " \n Sell Date: " + dateOfSell + " \n Total price with " + discountPercent
                                        + "% discount: " + totalPriceWithDiscount);

                    }

                    break;
                }

            }
        }
        if (notFound == true) {
            JOptionPane.showMessageDialog(frame, instrumentName + " is not found in selling stock !!", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // getting instrument name for sell
    public String getInstrumentNameForSell() {
        return instrumentSellNameTF.getText().trim();
    }

    // getting customer name for sell
    public String getCustomerNameForSell() {
        return customerNameSellTF.getText().trim();
    }

    // getting customer phone number for sell
    public String getCustomerPhForSell() {
        String userNumber = customerPhSellTF.getText().trim();
        if (!userNumber.matches("\\d*")) {
            JOptionPane.showMessageDialog(frame, "phone number is invalid !!",
                    "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            negativeOrZero = 2;
        }
        return userNumber;
    }

    // getting the date of sell
    public String getDateOfSell() {
        return daySell.getSelectedItem().toString() + " " +
                monthSell.getSelectedItem().toString() + " "
                + yearSell.getSelectedItem().toString();
    }

    // pan no --> sell
    public int getPanNoSell() {
        String panNoSellText = panSellTF.getText().trim();
        int panNoSell = INVALID;

        if (panNoSellText.isEmpty()) {
            panNoSell = EMPTY;
            return panNoSell;
        }

        try {
            panNoSell = Integer.parseInt(panNoSellText);
            if (panNoSell <= 0) {
                JOptionPane.showMessageDialog(frame, "PAN No. can not be negative or 0 !!",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                panNoSell = INVALID;
                negativeOrZero = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "PAN NO. is not valid !!", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            exceptionCase = "invalid";
        }
        return panNoSell;
    }

    // discount percent --> sell
    public int getDiscountPercent() {
        String discountPercentText = discountPercentTF.getText().trim();
        int discountPercent = INVALID;

        if (discountPercentText.isEmpty()) {
            discountPercent = EMPTY;
            return discountPercent;
        }

        try {
            discountPercent = Integer.parseInt(discountPercentText);
            if (discountPercent <= 0) {
                JOptionPane.showMessageDialog(frame, "Discount percent can not be negative or 0 !!", "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                discountPercent = INVALID;
                negativeOrZero = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Discount Percent is not valid !!", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            exceptionCase = "invalid";
        }
        return discountPercent;
    }

    // clear--> sell
    public void clearSellHandler() {
        addToSellInstrumentNameTF.setText("");
        priceTF.setText("");
        instrumentSellNameTF.setText("");
        customerNameSellTF.setText("");
        customerPhSellTF.setText("");
        panSellTF.setText("");
        discountPercentTF.setText("");
    }

    // display rent handler or calling the method displayRentHandler when the
    // display button clicked in instrument to rent
    public void displayRentHandler() {
        if (instrumentList.size() > 0) {
            for (int i = 0; i < instrumentList.size(); i++) {
                if (instrumentList.get(i) instanceof InstrumentToRent) {
                    InstrumentToRent obj = (InstrumentToRent) instrumentList.get(i);
                    obj.Display();
                }
            }
        } else {
            System.out
                    .println("There is nothing to display, not a instrument is rented or nothing is in stock");
        }
    }

    // display sell handler or calling the method displaySellHandler when the
    // display button clicked in instrument to sell
    public void displaySellHandler() {
        if (instrumentList.size() > 0) {
            for (int i = 0; i < instrumentList.size(); i++) {
                if (instrumentList.get(i) instanceof InstrumentToSell) {
                    InstrumentToSell objS = (InstrumentToSell) instrumentList.get(i);
                    objS.Display();
                }
            }
        } else {
            System.out.println("There is nothing to display, not a instrument is sold or nothing is in stock");
        }
    }

}