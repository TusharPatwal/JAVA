import java.util.*;
// oops in java
// class creation
class Pen{
    String color; // blue, black, red, green
    String type; // ball or gel

    public void write(){
        System.out.println("Class Pen: Writting someting");
    }

    public void dispay(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;
    int roll;

    // public void setter(int age, String name,int roll){
    //     this.name = name;
    //     this.age = age;
    //     this.roll = roll;
    // }
    public void display(){
        System.out.println("The name of the student is " +this.name+ " age is " + this.age + " and roll number is " + this.roll);
    }
    Student(){ // non-parameterized constructor or default constructor
        System.out.println("Construtor called");
    }
    Student(String name, int age, int roll){ //parameterized constructor
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    Student(Student s01){ //copy constructor
        this.name = s01.name;
        this.age = s01.age;
        this.roll = s01.roll;
    }

    // polymorphism 
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}

public class day06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // object creation
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";
        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ball";
        pen1.write();
        pen1.dispay();
        pen2.dispay();
        


        Student s1 = new Student("Tushar",20, 98);
        // s1.setter(20, "Tushar", 98);

        Student s2 = new Student("Aayush",22, 99);
        // s2.setter(22,"Aayush", 99);
        
        s1.display();
        s2.display();

        Student s01 = new Student(s1);
        s01.display();
        sc.close();

        s01.printInfo("Tushar");
        s01.printInfo(20);
        s01.printInfo("Hello", 22);
    }
}
