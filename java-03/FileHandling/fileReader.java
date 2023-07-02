// FileReader class in java

import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("C:\\Users\\Tushar\\Desktop\\first.txt");
        int word;
        while((word = f.read()) != -1){
            System.out.println((char)word);
        }
    }
}
