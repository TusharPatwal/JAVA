// 12. WAP that implements multilevel inheritance.

class M1 {
    int data1;

}

class M2 extends M1 {
    double data2;
    void show(int data1){
        System.out.println("The value of data1 is "+ data1);
    }
}

class M3 extends M2 {
    void show(double data2){
        System.out.println("The value of data2 is "+ data2);
    }

}

public class Labwork_13 {
    public static void main(String[] args) {
        M3 obj = new M3();

        obj.show(99);
        obj.show(99.99);
    }
}
