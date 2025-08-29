package FIle_IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {
    public static void main(String[] args) {
        String data = "This is new data.\n";

        try {
            // true means append, false or omitted means overwrite
            FileWriter writer = new FileWriter("", true);
            writer.write(data);
            writer.close();
            System.out.println("Data written to file successfully!");
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println(e);
        }
    }
}