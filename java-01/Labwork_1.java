
import java.util.*;

class Labwork_1 {

    public static void main(String[] args) {
        /*
         * // Q1 wap to display hello world.
         * System.out.println("Hello World!");
         * 
         * //Q2 wap to display sum of 2 numbers.
         * int a = 9;
         * int b = 6;
         * System.out.println("The value after addition: " + (a+b));
         * 
         * //Q3 Wap to take radius from user and calculatea the area of circle.
         * Scanner sc = new Scanner(System.in);
         * double pi = sc.nextDouble();
         * int radius = sc.nextInt();
         * System.out.println("The area of circle: " + pi*radius*radius);
         * 
         * //Q4 wap p,t,r, and calculate si.
         * int p = sc.nextInt();
         * int r = sc.nextInt();
         * int t = sc.nextInt();
         * float f = (p*r*t)/100;
         * System.out.println("The principle is " + f);
         * 
         * //Q5 Wap that checks number is even or odd.
         * int num = sc.nextInt();
         * if(num%2==0){
         * System.out.println("Even");
         * }else{
         * System.out.println("Odd");
         * }
         * 
         * //Q6 wap to calculate factorial of a number.
         * int num1 = sc.nextInt();
         * int fact = 1;
         * for(int i = 1; i<=num1; i++){
         * fact *= i;
         * }
         * System.out.println("The factorial is " + fact);
         */
        Scanner sc = new Scanner(System.in);

        // Q7 wap that except your name, age, and percentage and display.
        String name = sc.nextLine();
        int age = sc.nextInt();
        float percentage = sc.nextFloat();

        System.out.println("My name is " + name + " and age is " + age + " and percentage is " + percentage);

        // Q8 wap that display all even number between 1 to 100.
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // Q9 wap that excepts the day of weeks and displays the same.
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusrday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Q10 wap that checks weather the given number is prime or not.
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        // Q11 wap that checks weather num is divisible by 3 or 7.
        int num1 = sc.nextInt();
        if (num1 % 3 == 0 || num1 % 7 == 0) {
            System.out.println("Number is divisible 3 or 7");
        } else {
            System.out.println("Number is not divisible 3 or 7");
        }

        // Q12 wap that excepts grade from user and display result a,b,c,d.
        String grade = sc.next();
        switch (grade) {
            case "a":
                System.out.println("Excellent");
                break;
            case "b":
                System.out.println("Very Good");
                break;
            case "c":
                System.out.println("Good");
                break;
            case "d":
                System.out.println("Nice");
                break;
            default:
                System.out.println("Invalid garde");
        }

        sc.close();
    }
}