// Create a class name member, having the following members:
// Data members 1-Name, 2-Age, 3-PhoneNumber, 4-Address, 5-Salary
// It also has a method named "printSalary" which print the salary of the members.
// Two classes "employee" and "manager" inherits the member class. The employee and manager class have data member "specialization" and "department" respectively.
// Now assign name, age, phone number, address and salary to an "employee" and a "manager" by making an object of both these classes and print the same.


import java.util.*;
class Member{
    String name;
    int age;
    long pnum;
    String address;
    Double salary;
    Scanner sc = new Scanner(System.in);

    void setData(){
        System.out.print("Enter the name: ");
        name = sc.next();
        System.out.print("Enter the age: ");
        age = sc.nextInt();
        System.out.print("Enter the phone num: ");
        pnum = sc.nextLong();
        System.out.print("Enter the address: ");
        address = sc.next();
        System.out.print("Enter the salary: ");
        salary = sc.nextDouble();
    }

    void printSalary(){
        System.out.println(salary);
    }

    void display(){
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Phone Number : "+ pnum);
        System.out.println("Address : "+ address);
        System.out.println("Salary : "+ salary);
    }
}

class Employee extends Member{
    String specialization;
    String department;  

    void setData(String specialization, String department){
        this.specialization = specialization;
        this.department = department;
    }
    void show(){
        System.out.println("Specialization : " + specialization);
        System.out.println("Department : "+ department);
    }
}
class Manager extends Member{
    String specialization;
    String department; 
    
    void setData(String specialization, String department){
        this.specialization = specialization;
        this.department = department;
    }
    void show(){
        System.out.println("Specialization : " + specialization);
        System.out.println("Department : "+ department);
    }
}

class Labwork_5{ 
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setData();
        emp1.setData("Python", "HR");
        
        Manager manag1 = new Manager();
        manag1.setData("cpp", "Head");
        manag1.setData();

        emp1.display();
        emp1.show();
        manag1.display();
        manag1.show();
    }
}