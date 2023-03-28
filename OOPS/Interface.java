import java.util.Scanner;

// interface in java
// Interface is just like a class, which contains only abstract method. To achieve interface java provides a keyword called implements.

// Note-1 Interface methods are bydefault public & abstract.
// Note-2 Interface variables are bydefault public + static + final.
// Note-3 Interface method must be overriden inside the implementing class.
// Note-4 Interface is nothing but deals between client & developer.

import java.util.*;

interface client{
    void input(); //public + abstract
    void output(); //public + abstract
}


public class Interface implements client {

    String name; double sal;

        public void input(){
            Scanner sc = new Scanner(System.in);
            System.err.print("Enter the Username: ");
            name = sc.nextLine();
            System.err.print("Enter the Salary: ");
            sal = sc.nextDouble();
            sc.close();
        }
        public void output(){
            System.out.println(name + " " + sal);
        }
        
        public static void main(String[] args) {
            client c = new Interface();
            
            c.input();
            c.output();
        }
        
}
