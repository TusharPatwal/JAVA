// core practicals

//Q1-write a program declaring a class rectangle with data member length, breadth and member function Input, Output and CalcArea.

class Rectangle {
    public int length, breadth;

    public void Input(int l, int b) {
        length = l;
        breadth = b;
    }

    public int CalcArea() {
        return (length * breadth);
    }

    public void Output() {
        System.out.println("The area of rectangle is " + CalcArea());
    }
}

class Q1 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.Input(5, 8);
        obj.CalcArea();
        obj.Output();
    }
}