package fileHandling;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        // toCreateFile
        // File f = new File("C:\\Users\\Anil\\Desktop\\anil.txt");
        // if(f.createNewFile()){
        // System.out.println("File sucessfully created "+ f.getName());
        // }else{
        // System.out.println("File already exists "+ f.getName());
        // }

        // toWritefile
        // FileWriter fWriter = new FileWriter("C:\\Users\\Anil\\Desktop\\anil.txt");
        // try{
        // fWriter.write("Hello my name is anil bhandari. I am a good boy");
        // fWriter.close();
        // System.out.println("You sucessfully wrote on file");
        // }
        // catch(IOException e){
        // System.out.println("something went wrong");
        // }

        // toReadfile
        // try {
        // File f = new File("C:\\Users\\Anil\\Desktop\\anil.txt");
        // Scanner myReader = new Scanner(f);
        // // while (myReader.hasNextLine()) {
        // // String data = myReader.nextLine();
        // // System.out.println(data);
        // // }
        // // myReader.close();
        // System.out.println(myReader.nextLine());
        // String data = myReader.nextLine();
        // System.out.println(data);
        // // for(int i=0; i<myReader.nextLine().length(); i++){
        // // System.out.println(i);
        // // }

        // } catch (IOException e) {
        // System.out.println("File doesnot exists");
        // }

        FileInputStream fileInput = new FileInputStream("C:\\Users\\Anil\\Desktop\\anil.txt");
        // int r;
        // while ((r = fileInput.read()) != -1) {
        //     char c = (char) r;
        //     System.out.println(c);
        // }
        System.out.println(fileInput.read());
        fileInput.close();

        // toGetFileInformation
        // File myObj = new File("C:\\Users\\Anil\\Desktop\\anil.txt");
        // if (myObj.exists()) {
        // System.out.println("File name: " + myObj.getName());
        // System.out.println("Absolute path: " + myObj.getAbsolutePath());
        // System.out.println("Writeable: " + myObj.canWrite());
        // System.out.println("Readable " + myObj.canRead());
        // System.out.println("File size in bytes " + myObj.length());
        // } else {
        // System.out.println("The file does not exist.");
        // }

    }
}
