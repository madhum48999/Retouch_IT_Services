package FIle_IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Program6 {
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

        // writing into file using FWriter
        FileWriter fw = new FileWriter(file);
        fw.write("hello");//accepts char , String and ascii

        fw.close();
    }
}