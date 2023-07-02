// READING FROM BYTE STREAMS

import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("C:\\Users\\Tushar\\Desktop\\first.txt"); 
        int byteread;

        while ((byteread = f.read()) != -1) {
            System.out.println((char) byteread);            
        }
    }
}
