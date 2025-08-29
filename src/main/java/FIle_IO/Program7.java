package FIle_IO;

import java.io.*;

public class Program7 {
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

        //updating a file
        BufferedReader br = new BufferedReader(new FileReader(file));
        String exist = "";
        String line = "";
        while((line = br.readLine()) != null){
            exist += line+"\n";
        }
        System.out.println(exist);
        br.close();

        // writing into file using BufferWriter
        String j = "Mohan kumar";
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(exist+j);

        bw.close();


        // reading a file
//
//        BufferedReader br = new BufferedReader(new FileReader(file));
//        String exist = "";
//        String line = "";
//        while((line = br.readLine()) != null){
//            exist += line+"\n";
//        }
//        System.out.println(exist);
//        bw.close();
//        br.close();

    }

    // updating


}