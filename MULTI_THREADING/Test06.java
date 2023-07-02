// THREAD PRIORITY

public class Test06 extends Thread {
    int i;
    Test06(int i){
        this.i = i;
    }
    public void run(){
        for(int i = 1; i<=3; i++){
            System.out.println(Thread.currentThread().getName() + " i = " + i);
        }
    }
    public static void main(String[] args) {
        Test06 t1 = new Test06(4);
        Test06 t2 = new Test06(5);
        Test06 t3 = new Test06(6);

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
