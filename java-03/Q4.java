
// Wap to create 3 thread 1st table of 7, 2nd table of 11, 3rd table of 3. use sleep method.

class MyThread1 extends Thread{
    int n;
    MyThread1(int n){
        this.n = n;
    }

    public void run() {

        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " + " + i +" = "+ n*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("ex");
            }
            
        }
    }
}
public class Q4 {
    public static void main(String[] args) {
        MyThread1 ob1 = new MyThread1(3);
        MyThread1 ob2 = new MyThread1(7);
        MyThread1 ob3 = new MyThread1(11);

        Thread A = new Thread(ob1);
        A.start();
        Thread B = new Thread(ob2);
        B.start();
        Thread C = new Thread(ob3);
        C.start();
    }
}
