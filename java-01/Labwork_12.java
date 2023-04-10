// 11. Create a class box having height, width , depth as the instance variables & calculate its volume. Implement
// constructor overloading in it. Create a subclass named box_new that has weight as an instance variable. Use
// super in the box_new class to initialize members of the base class.

class Box {
    int height, width, depth;

    Box(){
        System.out.println("Constructor ");
    }

    Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void volume() {
        System.out.println("The volume of box is " + (height * width * depth));
    }

}

class Box_new extends Box{
    int weight;
    Box_new(){
        super(2,5,8);
        weight = 10;
    }
}
public class Labwork_12 {
    public static void main(String[] args) {
        Box obj01 = new Box();
        Box obj02 = new Box(3,6,8);
        Box_new obj03 = new Box_new();

        obj02.volume();
        obj03.volume();
    }
}
