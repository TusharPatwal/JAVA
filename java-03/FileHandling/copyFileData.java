import java.io.*;

public class copyFileData {
    public static void main(String[] args) throws IOException {
        FileInputStream r = new FileInputStream("C:\\Users\\Tushar\\Desktop\\second.txt");
        FileOutputStream w = new FileOutputStream("C:\\Users\\Tushar\\Desktop\\newFile.txt");

        int i;
        while((i = r.read())!= -1){
            w.write((char)i);
        }
        System.out.println("Data Copied successfully");
    }
}
