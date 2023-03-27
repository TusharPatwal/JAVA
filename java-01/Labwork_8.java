// 7. WAP to count the no. of objects created in a program.
class Count{
    static int count = 0;
    Count(){
        count++;
    }
}
class Labwork_8 {
    public static void main(String[] args) {
        Count a = new Count();
        Count b = new Count();
        Count c = new Count();
        Count d = new Count();
        System.out.println("Objects no: "+ Count.count);
    }    
}
