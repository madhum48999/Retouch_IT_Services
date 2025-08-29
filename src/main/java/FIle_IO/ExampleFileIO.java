package FIle_IO;

import java.io.*;
import java.util.Scanner;

public class ExampleFileIO {
    // Will use File Class to create a file object

    public static void main(String[] args) {

        //creating a file
        File myfile = new File("madhu.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("unable to create a new file");
            e.printStackTrace();
        }

        //writing to a file
        try {
            FileWriter writer = new FileWriter("madhu.txt");
            writer.write("hello world");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //reading a file
        try {
            FileReader reader = new FileReader("madhu.txt");
            Scanner scanner = new Scanner(myfile);
            System.out.println(scanner);

        } catch (FileNotFoundException e) {
         e.printStackTrace();
        }

    }
}
