package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) throws IOException {
        try {
            //check if the director exists
            File directory = new File("./javaC5");
            if (!directory.exists()) {
                //create the directory
                if (directory.mkdir()) {
                    System.out.println("Directory created successfully");
                } else {
                    System.out.println("Failed to create directory");
                }
            } else {
                System.out.println("Directory already exists");
            }

            //create a new file
            File file = new File(directory, "Description5.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            // Write to the file
            FileWriter writer = new FileWriter("Description5.txt");
            writer.write("Hello, this is a test file. \n for new line");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            //Read the file
            try {
                File f = new File("Description5.txt");
                Scanner myReader = new Scanner(f);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();

            } catch (IOException e) {
                System.out.println("An error occured while reading the file");

            }

        } catch (Exception e) {
            System.out.println("An error occured while working with file");
        }
    }
}
