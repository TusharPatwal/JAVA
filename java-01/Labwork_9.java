// 8. WAP to show call by value & call by reference.
class Operation1 {
    int data = 50;

    void change(int data) {
        data += 100;// changes will be in the local variable only
    }
}

class Operation2 {
    int data = 50;

    void change(Operation2 op) {
        op.data = op.data + 100;// changes will be in the instance variable
    }
}

class Labwork_9 {
    public static void main(String[] args) {
        Operation1 obj1 = new Operation1();

        System.out.println("before change " + obj1.data);
        obj1.change(500);
        System.out.println("after change " + obj1.data);

        Operation2 obj2 = new Operation2();

        System.out.println("before change " + obj2.data);
        obj2.change(obj2);// passing object
        System.out.println("after change " + obj2.data);
    }
}
