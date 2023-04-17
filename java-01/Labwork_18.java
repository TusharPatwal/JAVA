// 17. WAP to implement exception handling. The program should accept two numbers from the user &
// divide the first no. by the second. It should throw a Arithmetic Exception if an attempt is made to
// divide the no. by zero. Use try, catch & finally .Implement multi-catch statements also .

import java.util.Scanner;

public class Labwork_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();
        
        try{
            // int z = x/y;
            int a[]=new int[5];  
            a[10]=50;
        }catch(ArithmeticException e){System.out.println(e);} 
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
        finally{
            System.out.println("Done");
        } 

        sc.close();
    }
}
