import java.util.*;
// String in java
class day09{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // String Declaration in java
        /*
        String name = "Tushar";
        String fullName = "Tushar Patwal";
        String sentence = "My name is Tushar Patwal";
        */

        // Taking input in java
        /*
        String name = sc.next(); // next() keyword only take a word as input. To take full line input use nextline() keyword.
        System.out.println("Your name is: "+ name);
        
        String fullName = sc.nextLine();
        System.out.println("Your full name is: "+ fullName);
        */


        // concatenation in strings
        String firstName = "Tushar";
        String lastName = "Patwal";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        // or
        System.out.println(firstName + " " + lastName);

        // length of string -> variableName.lenght();
        System.out.println(fullName.length());

        // charAt -> variableName.charAt(index number);
        for (int i = 0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        // compare strings -> variableName1.compareTo(variableName2);
        // 1 s1 > s2 : +ve value
        // 2 s1 == s2 : 0
        // 3 s1 < s2 : -ve value
        /*
        String s1 = "King";
        String s2 = "King";

        if (s1.compareTo(s2)==0){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        */

        // substring -> variableName.substring(begin index, end index)
        String sentence = "My name is king";
        String name = sentence.substring(11, sentence.length());

        System.out.println(name);
        String fullNam = "TusharPatwal";
        System.out.println(fullNam.substring(0, 6));
        System.out.println(fullNam.substring(6));
        sc.close();
    }
}