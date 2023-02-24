// Inheritance in java
class Shape{
    String color;
    public void area(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape{ //extends: it is used for accessing parent class from child class(Inheritance)
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

public class day07 {
    public static void main(String[] args){

        Triangle t1 = new Triangle();
        t1.color = "Red";
    }    
}
