
import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        //raw arraylist
        ArrayList s2 = new ArrayList<>();
        s2.add("Anil");
        s2.add(false);
        s2.add(1);

        // System.out.println(s2);

        //generic arraylist
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Anil");
        s1.add("sushant");
        s1.add("sagar");
        s1.add("Anil");
        // s1.add(1, "nishant");
        // s1.remove("sushant");
        // s1.set(1,"nishant");

        //traverse using for each loop
        for(String gpt: s1){
            System.out.println(gpt);
        }

        //traverse using iterator
        Iterator i = s1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


        // System.out.println(s1);
    }
}
