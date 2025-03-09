import java.util.ArrayList;
import java.util.Iterator;

class Bus {
    String busNumber, route;
    int capacity, rate;

    Bus(String busNumber, String route, int capacity, int rate) {
        this.busNumber = busNumber;
        this.route = route;
        this.capacity = capacity;
        this.rate = rate;
    }

    public void display() {
        System.out.println(
                "Bus number is " + this.busNumber + ". Route is " + this.route + ". Capacity is " + this.capacity + ". Rate is "+ this.rate);
    }
}

class BusCompany {
    private ArrayList<Bus> Buses = new ArrayList<>();
    // BusCompany(){
    //     this.Buses = new ArrayList<>();
    // }

    public void addBus(Bus bus) {
        this.Buses.add(bus);
    }

    public void removebus(int index) {
        if (this.Buses.size() < index && (index < 0)) {
            System.out.println("You enter the incorrect index");
        } else {
            this.Buses.remove(index);
        }
    }

    public void display() {
        for(Bus b: Buses){
            b.display();
        }
        // Iterator i = Buses.iterator();
        // while(i.hasNext()){
        //     Bus x = (Bus) i.next();
        //     System.out.println(x.rate);
        // }

    }

    public void displayRate500(){
        for(Bus b: Buses){
            if(b.rate > 30){
                b.display();
            }
        }
    }
}

public class Work {
    public static void main(String[] args) {
        BusCompany company = new BusCompany();
        company.addBus(new Bus("Bus123", "Dharan", 100, 50));
        company.addBus(new Bus("Bus123122", "Salakpur", 30, 25));

        company.display();
        company.displayRate500();

    }
}
