public class Wrapper {
    public static void main(String[] args) {
        int a = 5;
        Integer num = a; // autoboxing
        System.out.println(a + " " + num);

        int b = num; // unboxing
        System.out.println(b + " " + num);

    }
}
