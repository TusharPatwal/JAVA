import java.util.*;
// string builder in java
class day09_p{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // syntax
        // StringBuilder stringName = new StringBuilder();

        StringBuilder sb = new StringBuilder("Tushar");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'R');        
        System.out.println(sb);

        // insert char at any index
        sb.insert(0, 'A');
        System.out.println(sb);

        // delete char or substring from string
        sb.delete(0, 1);
        System.out.println(sb);

        StringBuilder str = new StringBuilder("H");
        // append char in string
        str.append('e');
        str.append('l');
        str.append('l');
        str.append('o');
        // .length() to find out len of string 
        System.out.println(str.length());

        System.out.println(str);

        // Reverse a string by setBuilder
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;
            
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
        sc.close();
    }
}