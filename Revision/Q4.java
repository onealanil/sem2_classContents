package Revision;

//4. Create a Student class with name and rollNo. Use an ArrayList<Student> to add 3 students and

import java.util.ArrayList;

// display their info using a loop.

class Student{
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

}

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 3));

        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Roll No: " + student.rollNo);
        }
        
    }
}
