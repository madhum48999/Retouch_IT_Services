package FIle_IO;

import java.io.*;

public class Program5 {
    public static void main(String[] args) throws IOException {
        //Creating a File
        File file = new File("madhu.txt"); //object of a file class which accepts path of file as parameter
        //  file.delete();
        //to check if file already exist
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File Created successfully");
        } else {
            System.out.println("File Already Exists");
        }
        System.out.println("------------------------------");

        // writing into file using FOS
        String s = "Hello World";

        FileOutputStream fos = new FileOutputStream(file);
        for(char ch : s.toCharArray()){
        fos.write(ch); // interger or byte array
        }

        fos.close();
    }
}