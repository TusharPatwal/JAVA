// Java Thread Example by implementing Runnable interface

public class Test02 implements Runnable {

    public void run() {
        System.out.println("Runnable Interface ... ");
    }

    public static void main(String[] args) {
        Test02 t = new Test02();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
