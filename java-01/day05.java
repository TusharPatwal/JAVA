import java.util.*;

// import javax.sound.sampled.ReverbType;
// Functions and methods in java
// synatx: returnType functionName(type arg1, type arg2...){
//  // operaions
// return type;
// }
class day05 {
    // Q1-Write a function to print your name.
    /*
    public static void printMyName(String name){
        System.out.println("My name is " + name);
        return;
    }
    */

    // Q2-Write a function to add 2 numbers and return the sum.
    /*
    public static int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
        
    }
    */

    // Q3-Make a function to multiply 2 numbers and return the product.
    /*
    public static int product(int a, int b){
        int product = a*b;
        return product;
    }
    */

    // Q4-Find the factorial of a number.
    /**/
    public static int factorial(int a){
        if (a == 1 || a == 0){
            return 1;
        }
        else{
            return a * factorial(a-1);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // String name = sc.nextLine();
        // printMyName(name);

        // System.out.print("Enter the First number: ");
        // int n = sc.nextInt();
        // System.out.print("Enter the Second number: ");
        // int m = sc.nextInt();
        // System.out.println(add(n,m));

        int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("The product of 2 numbers is: " + product(a, b));

        System.out.println("The factorial is: "+ factorial(a));

        sc.close();
    }
    
}
