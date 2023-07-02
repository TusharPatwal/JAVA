// Java FileOutputStream

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("C:\\Users\\Tushar\\Desktop\\first.txt");
        String s = "Hello World";
        byte b[] = s.getBytes();
        f.write(b);
        f.close();
        System.out.println("Success...");
    }
}
