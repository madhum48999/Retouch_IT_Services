package FIle_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Program1 {
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

        //reading a file using fileinputstream

        FileInputStream fis = new FileInputStream(file);
        int asci;
        String text = "";
        while((asci = fis.read()) != -1){
        text = text + (char)asci;
        }
        System.out.println(text);
        fis.close();


    }
}