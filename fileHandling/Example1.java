package fileHandling;

import java.io.File;
import java.io.IOException;

public class Example1 {

    public static void main(String[] args) throws IOException {
        try {
            //create a file in the directory
            File f = new File("anil.txt");
            if (f.createNewFile()) {
                System.out.println("File sucessfully created " + f.getName());
            } else {
                System.out.println("File already exists " + f.getName());
            }

        } catch (Exception e) {
        }

    }

}
