package FIle_IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {
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

        //reading a file using FILEREADER class

        FileReader reader = new FileReader(file); // reads only char by char same as FIS
        int i ;
        String s = " ";
        while((i= reader.read()) != -1) {
         s = s+(char)i;
        }
        System.out.println(s);
        reader.close();

    }
}