// class and object in java
// class is a group of elements having common properties and behaviour's.

// Note: 1. Class is virtual.
//       2. Object is real.

// Types of class:
//                1. User-defined -> A, Person, Animal, ... etc
//                2. pre-defined -> System, Strings, Scanner, ... etc
class Person {
    int age = 20;
    int weight = 65;
    String color = "Light";

    void eat() {
        System.out.println("I am eating");
    }

    void sleep() {
        System.out.println("I am sleeping");
    }
}

public class Class_Object {
    public static void main(String[] args) {
        Person obj = new Person();
        System.out.println(obj.age);
        System.out.println(obj.weight);
        System.out.println(obj.color);

        obj.eat();
        obj.sleep();
    }
}
