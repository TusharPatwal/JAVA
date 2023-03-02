// Operators & Binary Number System 
import java.util.*;

class day10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        // Arithmetic operators(+,-,*,/,%)
        System.out.println(5+4); // 9
        
        System.out.println(5-4); // 1
        
        System.out.println(5*4); // 20
        
        System.out.println(5/4); // 1
        
        System.out.println(10%4); // 2
        
        System.out.println();


        // Unary operators(++,--)
        int a = 2;
        // Pre Increment 
        System.out.println(++a); // 3
        // Pre Increment 
        System.out.println(a++); // 3
        System.out.println(a); // 4
        
        int b = 5;
        // Pre Decrement
        System.out.println(--b); // 4
        // Post Decrement
        System.out.println(b--); // 4
        System.out.println(b); // 3
        System.out.println();

        // Relational operators(==,!=,>,<,<=,>=)
        int c = 3;
        int d = 4;
        
        System.out.println(c==d);
        System.out.println(c!=d);
        System.out.println(c>d);
        System.out.println(c<d);
        System.out.println(c>=d);
        System.out.println(c<=d);

        sc.close();
    }   
}
