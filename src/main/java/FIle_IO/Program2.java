package FIle_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {
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

        //reading a file using scanner class

        Scanner scanner = new Scanner(file); //we can pass the file directly or intance of a FIS
        String text = "";
        while(scanner.hasNextLine()){
        text = text + scanner.nextLine()+"\n";
        }
        System.out.println(text);
        scanner.close();


    }
}