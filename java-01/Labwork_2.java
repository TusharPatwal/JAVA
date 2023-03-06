
import java.util.*;
class Labwork_2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        //Q1 wap that excepts 1d array , displays the array elements and the sum.
        /*
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("The sum of array is "+sum);
        */


        //Q2 wap to check wether the given no exists in array or not.
        /*
        System.out.print("Enter the size of array: ");
        int m = sc.nextInt();
        System.out.print("Enter the element you want to find: ");
        int x = sc.nextInt();
        int[] arr1 = new int[m];
        // input
        System.out.println("Enter the elements in array: ");
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        // searching element x
        for (int i = 0; i<m; i++){
            if(arr1[i]==x){
                System.out.println("Found the element at index: "+i);
                break;
            }
        }
        */
        
        //Q3 wap to riverse an array.
        /*
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = n-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        } 
        */
        
        //Q4 wap to create 2d array and display the sum.
        /*
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];
        
        // input
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        int sum = 0;

        // output
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(numbers[i][j] + " ");
                sum += numbers[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum of array is" + sum);
        */
    
        //Q5 wap to except 3x3 matrix from the user and display the left diagonal elements only.
        /**/
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];
        
        // input
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(numbers[i]==numbers[j]){
                    System.out.println(numbers[i][j]);
                }
            }
        }
        
        sc.close();

    }
}