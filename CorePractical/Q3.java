// Q3-Write a program to demonstrate the use of static variable, static method and static block.

class Static{
    public static int a = 6;

    static void showData(){
        System.out.println("The value of a is "+a);
    }
    
    static{
        System.out.println("My name is Tushar Patwal");
    }    
}
class Q3 {
    public static void main(String[] args) {
        Static obj = new Static();
        obj.showData();
    }
}
