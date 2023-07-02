// Multiple inheritance using Interface

interface A1 {
    void show();
}

interface B1 {
    void display();
}

public class MultipleInterface implements A1, B1 {

    public void show() {
        System.out.println("Interface A1");
    }

    public void display() {
        System.out.println("Interface B1");
    }

    public static void main(String[] args) {
        MultipleInterface a = new MultipleInterface();
        a.show();
        a.display();
    }
}
