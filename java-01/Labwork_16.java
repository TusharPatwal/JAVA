// 15. WAP to implement interface. Create an interface named Shape having area() & perimeter() as its methods. Create three classes circle, rectangle & square that implement this interface.

interface Shapes {
    void area();

    void perimeter();
}

class circle implements Shapes {
    double pi;
    int r;

    circle(double pi, int r) {
        this.pi = pi;
        this.r = r;
    }

    public void area() {
        System.out.println(pi * r);
    }

    public void perimeter() {
        System.out.println(2 * pi * r);
    }
}

class Rectangle implements Shapes {

    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        System.out.println(b * l);
    }

    public void perimeter() {
        System.out.println(2 * b * l);
    }
}

class square implements Shapes {
    int a;

    square(int a) {
        this.a = a;
    }

    public void area() {
        System.out.println(a * a);
    }

    public void perimeter() {
        System.out.println(2 * a);
    }
}

public class Labwork_16 {
    public static void main(String[] args) {
        circle o1 = new circle(3.14, 5);
        o1.area();
        o1.perimeter();
        Rectangle o2 = new Rectangle(3, 5);
        o2.area();
        o2.perimeter();
        square o3 = new square(9);
        o3.area();
        o3.perimeter();

    }
}
