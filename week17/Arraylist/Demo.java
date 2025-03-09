
import java.util.ArrayList;

class Students{
    String name, address;

    Students(String name, String address){
        this.name = name;
        this.address = address;
    }
}

public class Demo {
    public static void main(String[] args) {
        Students s1 = new Students("Anil", "salakpur");
        Students s2 = new Students("rohan", "birathowk");

        ArrayList<Students> list = new ArrayList<>();

        
        list.add(s1);
        list.add(s2);

        for(Students studentInfo: list){
            System.out.println("My name is "+ studentInfo.name+ " I live at "+ studentInfo.address);
            System.out.println(studentInfo.name);
        }

      
}
}
