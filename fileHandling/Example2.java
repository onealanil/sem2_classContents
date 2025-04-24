package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) throws IOException {
        try {
        //check if the director exists
            File directory = new File("./sem2");
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

            //creating the file
            File f = new File(directory, "anil.txt");
            if (f.createNewFile()) {
                System.out.println("File sucessfully created " + f.getName());
            } else {
                System.out.println("File already exists " + f.getName());
            }

            //writing on the file
            FileWriter fWriter = new FileWriter("anil.txt");
            fWriter.write("Hello my name is anil bhandari \n for new line");
            fWriter.close();
            System.out.println("You sucessfully wrote on file");

            //read the file
            // try {
            File fRead = new File("description.txt");
            Scanner myReader = new Scanner(fRead);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (IOException e) {
            System.out.println("An error occured while working with the file");
        }
    }
}
