package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example8{
    public static void main(String[] args) throws IOException {
        try {
            File folderF = new File("./workshopc8folder");
            //creating the directory
            if (!folderF.isDirectory()) {
                folderF.mkdir();
                System.out.println("Folder created successfully");
            } else {
                System.out.println("Folder already exists");
            }

            //creating new file
            File f = new File(folderF, "./workshopc8.txt");
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }

            //to write in the file
            FileWriter writer = new FileWriter(f);
            writer.write("Hello World");
            writer.close();


            //read from the file
            try {
                File fileR = new File(folderF, "./workshopc8.txt");
                Scanner myReader = new Scanner(fileR);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();

            } catch (IOException e) {
                System.out.println("An error occurred while reading the file");
            }
            
        } catch (Exception e) {
            System.out.println("An error occurred while working with the file");
        } 
    }
}