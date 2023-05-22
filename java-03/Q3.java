// Wap to create two threads ones print even and another prints odd. 
// use thread class
// use runnable interface 

class MyThread2 extends Thread {
    public void run() {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

class MyThread3 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

}

public class Q3 {
    public static void main(String[] args) {
        MyThread2 obj1 = new MyThread2();
        MyThread3 obj2 = new MyThread3();

        Thread A = new Thread(obj1);
        Thread B = new Thread(obj2);
        A.start();
        B.start();
    }
}
