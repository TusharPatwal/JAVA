import java.io.*;

class FirstFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Tushar\\Desktop\\first.txt");

        // Method 1 -> In this we created file and catch exception by try_catch
        // try {
        // if (f.createNewFile()) {
        // System.out.println("File created...");
        // } else {
        // System.out.println("File already exist...");
        // }
        // } catch (IOException e) {
        // System.out.println(e);
        // }

        // Method 2 -> In this we created file and catch exception by throws
        if (f.createNewFile()) {
            System.out.println("File created...");
        } else {
            System.out.println("File already exist...");
        }

    }
}