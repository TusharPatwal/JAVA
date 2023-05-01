class m{
    int a = 5;
    public void display(){
        System.out.println("Class m method");
    }

    m(int a){
        System.out.println("Value of a is "+ a);
    }
}

class n extends m{
    int a = 9;
    public void display(){
        super.display();
        System.out.println(super.a);
        System.out.println("Class n method");
    }
    n(int a){
        super(8);
        System.out.println("Value of a is "+ a);
    }
}


public class SuperKeyword02 {
    public static void main(String[] args) {
        n obj = new n(9);
        System.out.println();
        obj.display();

        // n obj2 = new n(9);
    }
}
