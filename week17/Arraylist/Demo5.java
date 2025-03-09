import java.util.ArrayList;
import java.util.Iterator;

public class Demo5 {
    public static void main(String[] args) {
        //raw arraylist
        ArrayList list = new ArrayList<>();
        list.add("Anil");
        list.add(1);
        list.add(false);
        // System.out.println(list);

        //generic arraylist
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Anil");
        list2.add("Saugat");
        list2.add("Suman");
        
        //for each loop
        for(String gpt: list2){
            System.out.println(gpt);
        }

        //Iterator
        Iterator it = list2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }





    }
}
