package Revision;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) throws IOException {
        try {

            // create a file note.txt
            File f = new File("note.txt");
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }

            try {
                // write in a file note.txt
                FileWriter fw = new FileWriter("note.txt");
                fw.write("-".repeat(50) + "\n");
                String heading = String.format("|%-20s|%-20s|", "Name", "Favourite Movie");
                fw.write(heading + "\n");
                fw.write("-".repeat(50) + "\n");
                String f1 = String.format("|%-20s|%-20s|", "John", "Inception");
                fw.write(f1 + "\n");
                String f2 = String.format("|%-20s|%-20s|", "Jane", "Interstellar");
                fw.write(f2 + "\n");
                fw.write("-".repeat(50) + "\n");
                fw.close();
                System.out.println("Successfully wrote to the file");

            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
            }

            // read the file note.txt
            FileReader fr = new FileReader("note.txt");
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();

        } catch (IOException e) {
            System.out.println("Something went wrong whlile working with the file");
        }
    }
}
