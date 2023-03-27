//6. WAP to implement constructor overloading.

class Overloading{
    Overloading(){
        System.out.println("constructor overloading");
    }
    Overloading(int x){
        System.out.println("My age is "+x);
    }
    Overloading(String name, int x){
        System.out.println("My name is "+name);
        System.out.println("My age is "+x);
    }
}

public class Labwork_7 {
    public static void main(String[] args) {
        Overloading obj = new Overloading("Tushar",29);

    }    
}
