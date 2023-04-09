// string in java
// String is a pre-defined class in java but we can also use it as a datatype.
// String are the sequence of characters and its index starts from 0.

// Syntax: 1. String Var-Name = new String("Tushar");
//         2. String Var-Name = "Tushar";

public class string {
    public static void main(String[] args) {
        String str = "Tushar";
        System.out.println(str.length());

        String str2 = new String("Tushar");
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        if (str.equals(str2)) { // to check if two strings are equal
            System.out.println("Both are equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
