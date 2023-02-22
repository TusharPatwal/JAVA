import java.util.*;
// functions practice questions in java
class day05_p {
    // Q1-Enter 3 numbers from the user & make a function to print their average.
    public static int average(int a, int b, int c){
        int average = (a+b+c)/3;
        return average;
    }


    // Q2-Write a function to print the sum of all odd numbers from 1 to n.
    public static int sumAllOdd(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(i%2==1){
                sum += i;
            }
            else{
                continue;
            }   
        }
        return sum;
    }    
    // Q3-Write a function which takes in 2 numbers and returns the greater of those two.
    public static int greater(int n, int m){
        if(n>m){
            return n;
        }        
        return m;
    }


    // Q4-Write a function that takes in the radius as input and returns the circumference of a circle.
    public static float circumference(int r){
        float pi = 3.14f;
        return 2*pi*r;
    }


    // Q5-Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static void eligibleVote(int age){
        if(age<18){
            System.out.println("Not eligible for vote.");
        }else{
            System.out.println("Eligible for vote.");
        }
    }

    // Q10-Write a program to print Fibonacci series of n terms where n is input by user
    public static void fibonacci(int n){
        int m1 = 0;
        int m2 = 1;
        System.out.print(m1 + m2 + " ");
        for(int i = 1; i<=n; i++){
            int m3 = m1+m2;
            m1 = m2;
            m2 = m3;
            System.out.print(m3 + " ");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Average is: " + average(4,5, 7));
        System.out.println("Sum of all odd numbers between 1 and n is: " + sumAllOdd(9));
        System.out.println("Greater number between a and b is: "+ greater(5, 6));
        System.out.println("The circumference od circle is: " + circumference(55));
        eligibleVote(20);
        fibonacci(18);
        sc.close();
    }
}