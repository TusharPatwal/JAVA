public class F{
    public static void main(String[] args) {
        F obj = new F();

        System.out.println("Hashcode is "+ obj.hashCode());
        obj = null;
        System.gc();

        System.out.println("End of the garbage collection");
    }
    protected void finalize(){
        System.out.println("Called the finalize() method");
    }
} 
