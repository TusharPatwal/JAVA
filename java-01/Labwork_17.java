// Q - Wap to implement 10 string functions.

public class Labwork_17 {
    public static void main(String[] args) {

        String str = "Hello";
        // 1
        System.out.println(str.charAt(1));

        String str2 = new String("Tushar");
        // 2
        System.out.println(str2.toUpperCase());
        // 3
        System.out.println(str2.toLowerCase());
        // 4
        System.out.println(str.length());
        // 5
        System.out.println(str.substring(2, 4));

        // 6
        String str1 = str.concat(" World ");
        ;
        System.out.println(str1);

        // 7
        String s3 = str.replace('o', 'i');
        System.out.println(s3);

        // 8
        System.out.println(str.contains("ll"));

        // 9
        System.out.println(str.indexOf('l'));

        // 10
        String s9 = "  hello string   ";
        System.out.println(s9.trim() + "javatpoint");
    }
}
