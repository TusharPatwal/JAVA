public class DataType {
    int a = 10; // instance variable 
    static double b = 32.4; // static variable

    public static void main(String[] args) {
        float c = 43.5f; // local variable

        final double pi = 3.14; // final varible 

        DataType obj = new DataType();
        System.out.println("a: "+ obj.a);

        System.out.println("b: " + b );
        System.out.println("c: " + c );
        System.out.println("d: " + pi );
        System.out.println();

    }
}
