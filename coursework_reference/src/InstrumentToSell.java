
public class InstrumentToSell extends Instrument { // subclass of Instrument
    // instance variables
    private int price;
    private String sellDate;
    private int discountPercent;
    private boolean isSold;

    // constructor
    InstrumentToSell(String instrumentName, int price) {
        super(instrumentName); // calling the constructor of super class or parent class
        this.price = price;
        this.sellDate = "";
        this.discountPercent = 0;
        this.isSold = false;
    }

    // setter method or mutator method
    public void setPrice(int price) {
        if (this.isSold == false) { // if it is not sold
            this.price = price;
        } else {
            System.out.println("There is not possible way to change the price");
        }
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setIsSold(boolean isSold) {
        this.isSold = isSold;
    }

    // getter method or accessor method
    public int getPrice() {
        return this.price;
    }

    public String getSellDate() {
        return this.sellDate;
    }

    public int getDiscountPercent() {
        return this.discountPercent;
    }

    public boolean getIssold() {
        return this.isSold;
    }

    public void sell(String customerName, String customerPhoneNumber, int PAN, String sellDate,
            int discountPercent) {
        if (isSold == true) { // if it is already sold
            System.out.println("It is already sold...");
            System.out.println("The name of the customer is : " + customerName);
            System.out.println("The phone number of the customer is : " + customerPhoneNumber);
            System.out.println("The selling date to the customer is : " + sellDate);
            System.out.println("The PAN no  of the customer is : " + PAN);
        } else { // if it is not sold
            super.setCustomerName(customerName); /**
                                                  * calling the setter method of super class or parent class ->
                                                  * setCustomerName
                                                  */
            // calling the setter method of super class or parent class -> setCustomerMobileNumber
            super.setCustomerMobileNumber(customerPhoneNumber);
            // calling the setter method of super class or parent class -> setPan
            super.setPan(PAN);
            this.discountPercent = discountPercent;
            this.sellDate = sellDate;
            this.isSold = true;
        }
    }

    public void Display() {
        super.Display(); // calling the method from super class -> Display
        if (isSold == true) {
            double discountPercentDouble = this.discountPercent; // int to double
            double priceWithoutDiscountDouble = this.price; // int to double
            // formulae of discount amount
            double discountAmountDouble = (priceWithoutDiscountDouble * discountPercentDouble) / 100;
            // total price of instrument with discount
            double totalPriceWithDiscount = priceWithoutDiscountDouble - discountAmountDouble;
            // calling the getter method from super class or parent class -> getCustomerName
            System.out.println("The customer name is " + super.getCustomerName());
            // calling the getter method from super class or parent class
            // =>getCustomerMobileNumber
            System.out.println("The customer phone number is " + super.getCustomerMobileNumber());
            System.out.println("The date of sell is " + this.sellDate);
            System.out.println("The price of the instrument with discount is " + totalPriceWithDiscount);
        }
    }

}
