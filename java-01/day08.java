// Arrays in java
import java.util.*;
public class day08{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        // Array syntax 
        // type[] arrayName = new type[size];
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        // or
        // int marks[] = new int[n]; 
        // or
        // int marks[] = {98,99,97,88,66};
        
        // loop for taking input in array
        for(int i = 0; i<n; i++){
            marks[i] = sc.nextInt();
        }
        // System.out.println(marks);// garbage value 
        // loop for output of array
        for(int i = 0; i<n; i++){
            System.out.print(marks[i] + " ");
        }
        */

        // Q1-Take an array as input from user. Search for a given number x and print the index at which it occurs.

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the element you want to find: ");
        int x = sc.nextInt();
        int[] marks = new int[n];
        // input
        System.out.println("Enter the elements in array: ");
        for(int i = 0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }

        // searching element x
        for (int i = 0; i<n; i++){
            if(marks[i]==x){
                System.out.println("Found the element at index: "+i);
                break;
            }
        }
        sc.close();
    }
}