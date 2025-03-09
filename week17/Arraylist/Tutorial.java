import java.util.ArrayList;
import java.util.Iterator;

abstract class Shop{
    protected String name;
    protected String address;
    protected int purchase_count;

    Shop(String name, String address){
        this.name = name;
        this.address = address;
        this.purchase_count = 0;
    }

    abstract public void purchaseCount();

    public void display(){
        System.out.println("I am " + this.name + " .My purchase count is "+ this.purchase_count);
    }
}

class RegularCustomer extends Shop{
    RegularCustomer(String name, String address){
        super(name, address);
    }

    @Override
    public void purchaseCount(){
        purchase_count+=1;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("I am regular .My purchase count is 1 ");
    }
}

class PremiumCustomer extends Shop{
    PremiumCustomer(String name, String address){
        super(name, address);
    }

    @Override
    public void purchaseCount(){
        purchase_count+=2;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("I am pre .My purchase count is 2");
    }
}

public class Tutorial{
    public static void main(String[] args) {
        ArrayList<Shop> s1 = new ArrayList<>();
        s1.add(new RegularCustomer("Anil", "Salakpur"));
        Shop ss = new RegularCustomer("Rekha", "Brt");
        s1.add(ss);
        s1.add(new RegularCustomer("Rakesh", "Salakpur"));
        s1.add(new PremiumCustomer("Oneal", "Biratchow"));


        for(Shop cust: s1){
            cust.purchaseCount();
        }

        for(Shop l: s1){
            l.display();
        }

    }
}