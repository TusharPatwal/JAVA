
public class ExceptionHandling02 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());            
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        try{
            int [] a = new int[2];
            a[4] = 50;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
