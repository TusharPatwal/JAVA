// Super keyword in java
// 1. Whenever The Super class and sub class variable and method name are same than it can be used only.
// 2. To avoid the confusion between super class and sub class variables and methods that have same name we should use super keyword.

// types of super keyword implementation 
// VAriable
// Method
// Constructor
class A{
    int a = 10;
    void display(){
        System.out.println("Class A");
    }
    A(int a){
        System.out.println("This is class A "+ a);
    }
}
class B extends A{
    int a = 20;
    
    public void show(){
        System.out.println(a);
        // call of super variable from sub class
        System.out.println(super.a);
    }

    void display(){
        // call of super method from sub class
        super.display();
        System.out.println("Class B");
    }
    B(){
        // By default it calls super class constructor in sub class
        // super();

        // incase of parameterised constructor you have to use super keyword and pass the parameter
        super(100);
        System.out.println("This is class B");
    }
}
class SuperKeyword{
    public static void main(String[] args) {
        B obj = new B();

        obj.show();
        obj.display();
    }
}