// Wap that implements the following methods 
// getPriority()
// join()
// getname , setname

class Methods extends Thread {
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Thread priority: " + Thread.currentThread().getPriority());
    }
}

public class Q5 {
    public static void main(String[] args) {
        Methods t1 = new Methods();
        Methods t2 = new Methods();
        Methods t3 = new Methods();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}