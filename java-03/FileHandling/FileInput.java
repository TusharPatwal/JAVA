// CONCEPT OF INPUT/OUTPUT

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileInput {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\Tushar\\Desktop\\hello.txt"));
        
        String line;
        // System.out.println();
        while((line = r.readLine()) != null){
            System.out.println(line);
        }
        // System.out.println();
    }
}
