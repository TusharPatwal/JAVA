
// Loops in java
import java.util.*;

class day03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Hello world!");
        // System.out.println("Hello world!");
        // System.out.println("Hello world!");

        // loops -> for loop
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println("Hello World " + i);
        // }

        // for(int i = 0; i<=10; i++) {
        //     System.out.print(i + " ");
        // }
        // System.out.println("\n");

        // loops -> while loop
        // int i = 0;
        // while(i <= 10){
        //     System.out.print(i + " ");
        //     i+=1;
        // }
        // System.out.println("\n");

        // loops -> do while loop 
        // i = 0;
        // do {
        //     System.out.print(i + " ");
        //     i++;
        // } while (i<=10); 



        // Question-1: Print the sum of first n natural numbers.
        /*int i = 0;
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(sum);*/


        // Question-2: Print the table of a number input by the user.
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(i*n);
        }
        sc.close();
    }
}