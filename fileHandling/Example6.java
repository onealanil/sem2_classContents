package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example6 {

    public static void main(String[] args) throws IOException {
        try {
            File f = new File("./radhe.txt");
            if (f.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }

            FileWriter writer = new FileWriter(f);
            for (int i = 0; i < 10; i++) {
                writer.write("Radhe Radhe\n");
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file");
        }
    }
}
