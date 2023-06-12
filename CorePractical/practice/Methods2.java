public class Methods2 implements Runnable {
    public void run() {
        // System.out.println("Thread is running...");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " "+ Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        Methods2 obj1 = new Methods2();
        Methods2 obj2 = new Methods2();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // setName() method
        t1.setName("T-1");
        t2.setName("T-2");
        t2.setPriority(Thread.MAX_PRIORITY);

        // getPriority() method ->(range of priority is 1 to 10) default priority of a thread is 5
        System.out.println("t1 thread priority: "+t1.getPriority());
        System.out.println("t2 thread priority: "+t2.getPriority());

        
        // setPriority() method (MIN_PRIORITY->1, NORM_PRIORITY->5, MAX_PRIORITY->5)
        t2.start();

        t1.start();
        try{
            // join() method
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
