package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) throws IOException {
        try {
            //creating the directory
            File folderF = new File("./workshoC7folder");
            if (!folderF.isDirectory()) {
                folderF.mkdir();
                System.out.println("Folder created successfully");
            } else {
                System.out.println("Folder already exists");
            }

            File f = new File(folderF, "./WorkshopC7.txt");
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }

            //For Radhe Radhe
            FileWriter writer = new FileWriter(f);
            for (int i = 0; i < 50; i++) {
                writer.write("Radhe\n");
            }
            writer.close();

            //Read the file
            try {
                File fileR = new File(folderF, "./WorkshopC7.txt");
                Scanner myReader = new Scanner(fileR);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();

            } catch (IOException e) {
                System.out.println("An error occured while reading the file");

            }

        } catch (Exception e) {
            System.out.println("An error occured while working with the file");
        }

    }
}
