public class test002 {
    public void show() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        test002 o = new test002();
        System.out.println(o);
    
        o.show();
    }
}
