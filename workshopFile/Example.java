package workshopFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) throws IOException {
        try {
            FileWriter fw = new FileWriter("student__data.txt");
            fw.write("Name: Punjan Shrestha \n");
            fw.write("Age: 20 \n");
            fw.write("Major: Computer Science \n");
            fw.close();
            System.out.println("File created successfully");

            FileReader fr = new FileReader("student__data.txt");
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();

            //check if the file name delete_me.txt exists in current directory
            File f = new File("delete_me.txt");
            if (f.exists()) {
                System.out.println("File exists");
                //delete the file
                if (f.delete()) {
                    System.out.println("File deleted successfully");
                } else {
                    System.out.println("Failed to delete the file");
                }
            } else {
                System.out.println("File does not exist");
                FileWriter fw1 = new FileWriter("delete_me.txt");
                fw1.write("This is a file to be deleted");
                fw1.close();
                System.out.println("File created successfully: delete_me.txt");
            }

        } catch (Exception e) {
            System.out.println("File not found");
        }

    }
}
