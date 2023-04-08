// method in java
// types of method 
// 1. pre-defined method
// 2. user-defined method

// syntax:
// return-type method-name(patameter){
//     statement
// }

public class Method {
    static int Sum(int a, int b) {// defination
        return a + b;
    }
    
    void printf(){ // If the method is not static then you have to create the obj of class to call it.
        System.out.println("I am learning java.");
    }



    public static void main(String[] args) {
        int a = Sum(10, 29); // calling
        System.out.println(a);

        Method obj01 = new Method();
        obj01.printf(); // calling by object of class
    }
}
