// Q3-write a Java program to find out whether the given string is palindrome or not.

import java.util.*;

class Q3 {
    public static boolean isPalindrome(String str){   
        
        String rev = "";
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);        

        sc.close();
    }
}
