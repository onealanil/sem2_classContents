import java.util.ArrayList;

class Student {
    String name, phoneNumber, group;

    Student(String name, String phoneNumber, String group) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.group = group;
    }

    // getter
    public String getName() {
        return this.name;
    }

    // getter
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getGroup() {
        return this.group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}

public class Workshop {
    public static void main(String[] args) {
        ArrayList<Student> stClass = new ArrayList<>();
        Student s1 = new Student("Ayush", "234234", "L1N1");
        Student s2 = new Student("Rahul", "234234", "L1M1");
        Student s3 = new Student("Gaurav", "32423434", "L1N2");
        Student s4 = new Student("Avaya", "2342343", "L1C1");
        stClass.add(s1);
        stClass.add(s2);
        stClass.add(s3);
        stClass.add(0, s4);

        //before
        // for (Student st : stClass) {
        //     System.out.println("My name is " + st.getName() + " .I read at " + st.getGroup() + ". My phonenumber is "
        //             + st.getPhoneNumber());
        // }
        
        // stClass.remove(2);
        //after
        for (Student st : stClass) {
            if(st.getName().equals("Rahul")){
                st.setGroup("L1N2");
            }
            System.out.println("My name is " + st.getName() + " .I read at " + st.getGroup() + ". My phonenumber is "
            + st.getPhoneNumber());
        }

        // for (Student st : stClass) {
        //     System.out.println("My name is " + st.getName() + " .I read at " + st.getGroup() + ". My phonenumber is "
        //             + st.getPhoneNumber());
        // }
    }
}