public class Methods2 implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {

        Methods2 obj = new Methods2();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
