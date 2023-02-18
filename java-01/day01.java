import java.util.*;
class day01 {
  
  public static void main(String[] args){

    // output (println for next line)
    System.out.print("Hello\n");
    System.out.println("Hello");
    // or (print for same line)
    System.out.print("Hello\n");
    System.out.println(5+20);
    System.out.println("*\n* *\n* * *\n* * * *\n* * * * *");
    // String name = "tushar";
    // System.out.println(name);
    // int age = 20;
    // int a = 25;
    // int b = 10;
    // double prince = 29.99;
    // name = "Tushar Patwal";


    // variables(int)
    // int a = 25, b = 10;
    // int sum = a+b;
    // System.out.println(sum);

    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    // nextInt(), nextFloat(), next()
    System.out.println(name);
    // System.out.println(a+b);

    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int sum = a+b;
    System.out.println(sum);
  }

}