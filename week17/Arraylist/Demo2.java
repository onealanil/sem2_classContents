import java.util.ArrayList;

public class Demo2 {
   public static void main(String[] args) {
    //raw arraylist
    // ArrayList list1 = new ArrayList<>();
    // list1.add("Anil");
    // list1.add(1);
    // list1.add(false);
    // System.out.println(list1);

    //generic arraylist
    ArrayList<String> l2 = new ArrayList<>();
    l2.add("anil");
    l2.add("1");
    l2.add("Sushant");  
    // l2.add(1, "rohan");
    // l2.add("anil");
    l2.set(1, "rohan");

    System.out.println(l2);

    //using for loop
    // for(String listnames: l2){
    //     System.out.println(listnames);
    // }

    //using iterator
    // Iterator i = l2.iterator();
    // while(i.hasNext()){
    //     System.out.println(i.next());
    // }

    


   } 
}
