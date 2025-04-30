package Revision;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileH {

    public static void main(String[] args) throws IOException {
        try {
            FileWriter fw = new FileWriter("student_data.txt");
            fw.write("Name: Pujan Shrestha\n");
            fw.write("Age: 20\n");
            fw.write("Major: Computer Science\n");
            fw.close();
            System.out.println("Successfully wrote to the file.");

            //QN:3 -> read the file student_data.txt
            FileReader fr = new FileReader("student_data.txt");
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Something went wrong while working with the file");
        }
    }
}
