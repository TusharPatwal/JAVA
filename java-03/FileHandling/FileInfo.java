import java.io.*;

public class FileInfo {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Tushar\\Desktop\\first.txt");

        if(f.exists()){
            System.out.println("File Name : " + f.getName());
            System.out.println("File Path : " + f.getAbsolutePath());
            System.out.println("File Writable : " + f.canWrite());
            System.out.println("File Readable : " + f.canRead());
            System.out.println("File Size : " + f.length());
            System.out.println("File Delete : " + f.delete());
        }else{
            System.out.println("File Doesn't Exist");
        }
    }
}
