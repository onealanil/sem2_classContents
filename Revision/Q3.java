package Revision;

//3. Create a program using ArrayList to store names of friends. Add at least 3 names, print the list,
// then remove one name and display the updated list.

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();

        friends.add("Alice");
        friends.add("Bob");
        friends.add("Charlie");
        
        System.out.println("Friends list: " + friends);
        
        friends.remove("Bob");
        
        System.out.println("Updated friends list: " + friends);
    }
}
