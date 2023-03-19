// core practicals

// Q2-write a program to demonstrate use of method overloading to calculate area of square, rectangle, triangle.
// (area of triangle = 1/2*b*h) (area of rectangle = l*b) (area of square = a*a)

class Shape{
    public void area(Double b, int h){
        System.out.println("Area of triangle is "+((1/2)*b*h));
    }
    public void area(int l, int b){
        System.out.println("Area of rectangle is "+(l*b));
    }
    public void area(int a){
        System.out.println("Area of square is "+(a*a));
    }
}

class Q2 {
    public static void main(String[] args) {
        Shape obj = new Shape();
        obj.area(5.8, 9);
        obj.area(4, 5);
        obj.area(5);
    }
}
