import java.io.FileWriter;
import java.io.IOException;

class fileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("C:\\Users\\Tushar\\Desktop\\second.txt");

        f.write("Java file for practice file handling");

        f.close();

    }
}