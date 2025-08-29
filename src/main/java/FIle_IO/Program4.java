package FIle_IO;

import javax.security.auth.kerberos.KerberosCredMessage;
import java.io.*;

public class Program4 {
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

        //reading a file using BUFFERREADER class

        FileReader fr = new FileReader(file);
//        FileInputStream fis = new FileInputStream(file);
//        InputStreamReader isr = new InputStreamReader(fis);
//                // we can read char by char or line by line
        BufferedReader br = new BufferedReader(fr); // accepts instance of reader class
        String text = "";
        String line = "";
        while ((line = br.readLine()) != null) // return null if the new line does not exist
        {
            text +=  line+"\n";
        }
        System.out.println(text);
        br.close();
        fr.close();
    }
}