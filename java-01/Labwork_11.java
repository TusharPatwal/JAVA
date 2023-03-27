// 10. WAP that demonstrates all the usages of “super” keyword.
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
        super.display();
        System.out.println("Class B");
    }
    B(){
        super(100);
        System.out.println("This is class B");
    }
}
public class Labwork_11 {
    public static void main(String[] args) {
        B obj = new B();

        obj.show();
        obj.display();
    }
}
