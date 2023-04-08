// import java.util.Scanner;
// import java.util.Arrays;
import java.util.*;
// arrays in java
// Arrays is an object in java, which contains similar type of data in a contigous memory location.

// Synatx: 1. data-type[] var-name; 
//         2. data-type var-name[];
//         3. data-type var-name[] = new data-type[size];

// Note: Array index starts with 0.

// types of arrays: 1. Single-Dimensional Array  
//                  2. Multi-Dimensional Array.

public class Array {
    public static void main(String[] args) {
        // int a[] = { 10, 20, 30, 40, 50 }; // a[5]
        Scanner sc = new Scanner(System.in);         
        int a[] = new int[5];    

        System.out.println("Enter the elements for 1d array: ");
        for(int i = 0; i<5; i++){
            a[i] = sc.nextInt();
        }

        // System.out.println(a[2] + " " + a[4]);
        Arrays.sort(a); // to sort the array 
        System.out.print("Sorted Array elements are: ");
        for (int b : a) {
            System.out.print(b + " ");
        }System.out.println();
        
        
        int arr[][] = new int[2][2];
        System.out.println("Enter the elements for 2d array: ");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                arr[i][j] = sc.nextInt();
            } 
        }

        System.out.println("Elements are: ");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                System.out.print(arr[i][j] + " ");
            } 
            System.out.println();
        }

        sc.close();
    }
}
