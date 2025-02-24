 

public class InstrumentToRent extends Instrument { // subclass of class Instrument
    //instance variables
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;

    // constructor
    InstrumentToRent(String instrumentName, int chargePerDay) {
        super(instrumentName); // calling super class or parent class constructor
        this.chargePerDay = chargePerDay;
        this.dateOfRent = "";
        this.dateOfReturn = "";
        this.noOfDays = 0;
        this.isRented = false;
    }

    // setters or mutator method
    public void setChargePerDay(int chargePerDay) {
        this.chargePerDay = chargePerDay;
    }

    public void setDateOfReturn(String dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public void setDateOfRent(String dateOfRent) {
        this.dateOfRent = dateOfRent;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }

    // getter method or accessor method
    public String getDateOfRent() {
        return this.dateOfRent;
    }

    public int getChargePerDay() {
        return this.chargePerDay;
    }

    public String getDateOfReturn() {
        return this.dateOfReturn;
    }

    public int getNoOfDays() {
        return this.noOfDays;
    }

    public boolean getIsRented() {
        return this.isRented;
    }

    // to rent out the customer

    public void rentOut(String customerName, String phone, int PAN, String dateOfRent, String dateOfReturn,
            int noOfDays) {
        if (isRented == true) { // if it is already rented
            System.out.println("It is already rented.");
            System.out.println("The name of the customer is " + customerName);
            System.out.println("The phone number of the customer is " + phone);
            System.out.println("The date of return is " + dateOfReturn);
        } else {
            super.setCustomerName(customerName); // calling the setter method of super class or parent class -> setCustomerName
            // calling the setter method of super class or parent class -> setCustomerMobileNumber
            super.setCustomerMobileNumber(phone);
            // calling the setter method of super class or parent class -> setPan
            super.setPan(PAN);
            this.dateOfRent = dateOfRent;
            this.dateOfReturn = dateOfReturn;
            this.noOfDays = noOfDays;
            this.isRented = true;
            System.out.println("Instrument is successfully rented :-)");
            System.out.println("The customer details are as follow: ");
            // calling the getter method from super class or parent class -> getCustomerName
            System.out.println("The customer name is : " + super.getCustomerName());
            // calling the getter method from super class or parent class ->getCustomerMobileNumber
            System.out.println("The customer phone number is : " + super.getCustomerMobileNumber());
            System.out.println("The date of rent is : " + this.dateOfRent);
            System.out.println("The no of days to return is : " + this.noOfDays);
            System.out.println("The return date is : " + this.dateOfReturn);
            System.out.println("The total charge is : " + this.noOfDays * this.chargePerDay);
        }
    }

    public void returnInstrument() { // method of returning the instrument
        if (isRented == true) {
            // super.setCustomerName("");
            super.setCustomerMobileNumber("");
            super.setPan(0);
            // this.dateOfRent = "";
            this.dateOfReturn = "";
            this.noOfDays = 0;
            this.isRented = false;
        } else { // if it is not rented
            System.out.println("This is not our instrument, we didn't rent it!");
        }
    }

    public void Display() {
        super.Display(); // calling the method Display from super class or parent class
        if (isRented == true) {
            // calling the getter method from super class or parent class -> getCustomerName
            System.out.println("The name of customer is " + super.getCustomerName());
            // calling the getter method from super class or parent class ->getCustomerMobileNumber
            System.out.println("The customer phone number is " + super.getCustomerMobileNumber());
            System.out.println("The date of rent is " + this.dateOfRent);
            System.out.println("The no of days to return is " + this.noOfDays);
            System.out.println("The return date is " + this.dateOfReturn);
        }
    }
}
