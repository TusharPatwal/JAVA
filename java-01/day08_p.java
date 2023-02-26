// 2D array in java
import java.util.*;

// Synatx: type[][] arrayName = new type[rows][columns];
// Example: int[][] numbers = new int[3][5];


public class day08_p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        /*
        int[][] numbers = new int[rows][columns];
        
        // input
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        // output
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        */

        // Q-1 Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

        System.out.print("Enter the value of x: " );
        int x = sc.nextInt();
        int[][] num = new int[rows][columns];
        // input
        for(int i=0; i<rows; i++){
            for(int j=0;j<columns; j++){
                num[i][j] = sc.nextInt();
            }
        }

        // checking element x
        for(int i=0; i<rows; i++){
            for(int j=0;j<columns; j++){
                if (num[i][j]==x){
                    System.out.println(i + " "+ j);
                }
            }
        }
        sc.close();
   
    } 
}