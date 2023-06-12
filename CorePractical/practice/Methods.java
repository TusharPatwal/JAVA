public class Methods extends Thread {
    public void run() {
        // currentThread() method & getName() method 
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            try {
                // sleep() method
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Methods t1 = new Methods();

        // start() method
        t1.start();

        // run() method
        t1.run();


    }
}
