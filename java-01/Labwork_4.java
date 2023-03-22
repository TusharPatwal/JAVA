// Consider classes 
// Base: worker (int code, String  name, float salary)
// Sub: class manager (float TA(is 10% of salary ),(gross sal))
// Gross sal = TA + salary
// write nessary member functions to display.

import java.util.*;

class Worker{
    int code;
    String name;
    double salary;    
}

class Manager extends Worker{
    Scanner sc = new Scanner(System.in);
   double TA;
   double grossSal;

   void setData(){
        code = sc.nextInt();
        name = sc.next();
        salary = sc.nextDouble();
        TA = (salary * .1);
        grossSal = (TA + salary);
   }
    
   void display(){
    System.out.println("The code of Worker is " + code);
    System.out.println("The name of Worker is " + name);
    System.out.println("The salary of Worker is " + salary);
    System.out.println("The travel allawance is "+ TA);
    System.out.println("The gross salary is "+ grossSal);
}
}




class Labwork_4{
    
    public static void main(String[] args) {
        Manager obj = new Manager();

        obj.setData();
        obj.display();
    }
}