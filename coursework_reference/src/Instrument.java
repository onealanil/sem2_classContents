 

public class Instrument {
    //instance variables
    private static int instrumentID; // static
    private String instrumentName;
    private String customerName;
    private String customerMobileNumber;
    private int PAN;

    // constructor
    Instrument(String instrumentName) {
        this.instrumentName = instrumentName;
        instrumentID++; // increment by one
        this.customerName = "";
        this.customerMobileNumber = "";
        this.PAN = 0;
    }

    // setter method or Mutator method
    public void setInstrumentID(int instrumentID) {
        Instrument.instrumentID = instrumentID;

    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerMobileNumber(String customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public void setPan(int PAN) {
        this.PAN = PAN;
    }

    // getter method or accessor method
    public int getInstrumentID() {
        return instrumentID;
    }

    public String getInstrumentName() {
        return this.instrumentName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerMobileNumber() {
        return customerMobileNumber;
    }

    public int getPan() {
        return PAN;
    }

    void Display() {
        System.out.println("Details are as follow: ");

        // if customerName, customerMobileNumber and PAN are not empty or zero
        if (this.customerName != "" && this.customerMobileNumber != "" && this.PAN != 0) {
            System.out.println("Instrument ID : " + this.getInstrumentID() + "\n" + "Instrument Name : "
                    + this.getInstrumentName() + "\n" + "Customer Name : " + this.getCustomerName()
                    + "\n" + "Customer Mobile number : " + this.getCustomerMobileNumber() + "\n"
                    + "Customer PAN No : " + this.getPan());
        } else {// if customerName, customerMobileNumber and PAN are zero
            System.out.println("Instrument ID : " + this.getInstrumentID() + "\n" + "Instrument Name : "
                    + this.getInstrumentName());
        }
    }
}