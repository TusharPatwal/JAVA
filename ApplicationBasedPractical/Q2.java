//Q2-Write a java program to perform basic calculator operations. Make a menu driven program to select operation to perform(+,-,*,/). Take 2 integers and perform operation as chosen by user.

import java.util.*;

class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the operator: ");
        int operator = sc.nextInt();

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        switch (operator) {
            case 1:
                System.out.println("a + b = " + (a + b));
                break;
            case 2:
                System.out.println("a + b = " + (a - b));
                break;
            case 3:
                System.out.println("a + b = " + (a * b));
                break;
            case 4:
                System.out.println("a + b = " + (a / b));
                break;

            default:
                System.out.println("Please enter the correct operator.");
                break;
        }
        sc.close();
    }
}
