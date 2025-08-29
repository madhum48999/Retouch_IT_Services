package FIle_IO;

import java.io.*;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
       if(!file.exists()) {
//         file.delete();

           file.createNewFile();
           System.out.println("File Created successfully");
       }else {
           System.out.println("File Already Exists");
       }
        System.out.println("-----------------");
// Reading with the help of FileInputStrem
//        FileInputStream fis = new FileInputStream(file);
//        int asci;
//        String s = "";
//        while((asci = fis.read()) != -1) {
//
//           s = s + (char)asci;
//        }
//        System.out.println(s);
//        fis.close();

        // Reading with the help of Scanner
//        Scanner scan = new Scanner(file);
//        String k = "";
//        while(scan.hasNextLine() ) {
//            k = k + scan.nextLine()+"\n";
//        }
//        System.out.println(k);
//        scan.close();

        //reading a file with FileReader

//        FileReader fr = new FileReader(file);
//
//        int asc ;
//        String m = "";
//        while((asc=fr.read()) != -1){
//            m = m + (char)asc;
//        }
//        System.out.println(m);

        // reading a file with buffer reader
//
//        FileReader fr = new FileReader(file);
//        BufferedReader br = new BufferedReader(fr);
//        String o = "";
//        String q = "";
//        while((o=br.readLine()) != null ){
//            q = q+o+"\n";
//        }
//        System.out.println(q);
//        br.close();
        //writing with FILEOUTPUTSTREAM
//        String m = "calculator is working fine";
//        FileOutputStream fos = new FileOutputStream(file);
//        for (char c : m.toCharArray()) {
//            fos.write(c);
//        }
//        fos.close();

        //writing with FileWriter
//        FileWriter fw = new FileWriter(file);
//        fw.write("hello good morning");
//        fw.close();

        //Writng bufferWriter

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("Google is a company");

        bw.close();
    }
}
