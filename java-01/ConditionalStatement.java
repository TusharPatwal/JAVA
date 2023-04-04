import java.util.Scanner;
// conditional statements in java

public class ConditionalStatement {
    public static void main(String[] args) {
        int pwd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password: ");
        pwd = sc.nextInt();
        if (pwd == 100) { // if statement
            System.out.println("True");
        }

        if (pwd == 100) { // if else statement
            System.out.println("True");
        } else {
            System.out.println("False");           
        }

        if (pwd==10) { // if else-if else statement 
            System.out.println(pwd);
        } else if (pwd==100){
            System.out.println(pwd);
        } else{
            System.out.println("False");
        }
        if (pwd <= 1000) { // nested if else statement
            if(pwd == 1000){
                System.out.println("Thats great");
            } else {
                System.out.println("Not great");
            }
        } else {
            System.out.println("not correct ");
        }

        sc.close();
    }
}
