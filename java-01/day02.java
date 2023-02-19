import java.util.*;

//  If-else, Switch Break
class day02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // adult or not based on age
        /*
         * int age = sc.nextInt();
         * 
         * if (age > 18){
         * System.out.println("Adult");
         * }
         * else{
         * System.out.println("Not Adult");
         * }
         */

        // Number is odd or even
        /*
         * System.out.print("Enter the number: ");
         * int num = sc.nextInt();
         * if(num%2==0){
         * System.out.println("Even number");
         * }
         * else{
         * System.out.println("Odd number");
         * }
         */

        // Find if the number is greater, equal, or lesser between two numbers.
        /*
         * System.out.print("Enter the first number: ");
         * int num1 = sc.nextInt();
         * System.out.print("Enter the second number: ");
         * int num2 = sc.nextInt();
         * 
         * if (num1 == num2) {
         * System.out.println("Equal");
         * } else if (num1 > num2) {
         * System.out.println("num1 is greater");
         * } else {
         * System.out.println("num2 is lesser");
         * }
         */

        // question - Write a program to enter button number according to
        // choice(1-Hello, 2-Namaste, 3-Bonjour) with if else
        /*
         * System.out.print("Enter the button number: ");
         * int button = sc.nextInt();
         * if(button == 1)
         * System.out.println("Hello");
         * else if(button == 2)
         * System.out.println("Namaste");
         * else if(button == 3)
         * System.out.println("Bonjour");
         * else
         * System.out.println("Please press the correct button");
         */

        // question - Write a program to enter button number according to
        // choice(1-Hello, 2-Namaste, 3-Bonjour) with switch case
        System.out.print("Enter the button number: ");
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid button");
        }
        sc.close();
    }
}