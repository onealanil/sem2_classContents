package fileHandling;

import java.io.File;
import java.io.FileWriter;

public class Example5 {
    public static void main(String[] args) {
        File directory = new File("./myfriends");
        if (directory.exists()) {
            System.out.println("Directory already exists");
        } else {
            if (directory.mkdir()) {
                System.out.println("Directory created successfully");
            } else {
                System.out.println("Failed to create directory");
            }
        }

        String [] friends = {"John", "Jane", "Doe", "Smith"};

        for(int i = 0 ; i < friends.length; i++){
            File file = new File(directory, friends[i] + ".txt");
            try {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                    FileWriter writer = new FileWriter(file);
                    writer.write("Hello, " + friends[i] + "! This is your file.");
                    writer.close();
                } else {
                    System.out.println("File already exists.");
                    FileWriter writer = new FileWriter(file, true);
                    writer.write("\nHello again, " + friends[i] + "! This is an update.");
                    writer.close();
                    System.out.println("Successfully updated the file.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred while creating the file");
            }
        }

    }
}
