import javax.xml.transform.Source;

public class ExceptionHandling {
    public static void main(String[] args) {
        // System.out.println("Main method started");
        // int a = 10, b = 0, c;
        try {
            System.out.println("1"); //1
            int a = 10, b = 0, c;
            c = a/b;
            System.out.println(c); //2
            System.out.println("hello"); //3
        } catch (Exception e) {
            System.out.println(e); //4 
        }
        finally{
            System.out.println("finally block"); //5
        }
        System.out.println("Ended"); //6
    } 
}
