package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// string formatting 
// Specifier | Description | Example Output
// %s | String | "Anil"
// %d | Integer | 22
// %f | Floating point | 3.141593
// %.2f | Float with 2 decimals | 3.14
// %c | Character | 'A'
// %b | Boolean | true / false
// %n | Line break | (like \n)


public class Example {

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("Anil");
        list.add("Bhandari");
        list.add("Nepal");
        list.add("Kathmandu");
        list.add("Bhaktapur");

        try {
            //check if the director exists
            File directory = new File("./fileHandling/files");
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

            //create a file in the directory
            File f = new File(directory, "anil.txt");
            if (f.createNewFile()) {
                System.out.println("File sucessfully created " + f.getName());
            } else {
                System.out.println("File already exists " + f.getName());
            }

            FileWriter fWriter = new FileWriter(f);
            try {
                while(!list.isEmpty()) {
                    fWriter.write(list.get(0) + "\n");
                    list.remove(0);
                }
                // String details = String.format("Hello my name is Anil Bhandari.\nI am a good boy.\n.", age);
                // fWriter.write(details);
                fWriter.close();
                System.out.println("You sucessfully wrote on file");
            } catch (IOException e) {
                System.out.println("something went wrong");
            }

            // toReadfile
            File rFile = new File(f.getAbsolutePath());
            Scanner myReader = new Scanner(rFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            // System.out.println(myReader.nextLine());
            // String data = myReader.nextLine();
            // System.out.println(data);
            // for (int i = 0; i < myReader.nextLine().length(); i++) {
            //     System.out.println(i);
            // }

            // toGetFileInformation
            File myObj = new File(f.getAbsolutePath());
            if (myObj.exists()) {
                System.out.println("File name: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
                System.out.println("Writeable: " + myObj.canWrite());
                System.out.println("Readable " + myObj.canRead());
                System.out.println("File size in bytes " + myObj.length());
            } else {
                System.out.println("The file does not exist.");
            }

            //for deleting the file
            // File file = new File(f.getAbsolutePath());
            // if (file.delete()) {
            //     System.out.println("Deleted the file: " + file.getName());
            // } else {
            //     System.out.println("Failed to delete the file.");
            // }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
        }

    }
}
