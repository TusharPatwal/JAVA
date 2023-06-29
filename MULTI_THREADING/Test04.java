// Implementation of Thread methods

public class Test04 extends Thread {
    public void run() {
        for (int i = 0; i <= 1; i++) {
            try {
                // sleep() method
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Thread class ... " + i);
        }
        // currentThread() method & getName() method
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Test04 t = new Test04();
        
        // setPriority() method
        t.setPriority(Thread.MAX_PRIORITY);
        
        // setName() method
        t.setName("Thread00001");
        
        // start() method
        t.start();
        
        // run() method
        // t.run();

        // getPriority() method
        System.out.println("t thread priority: " + t.getPriority());

        try{
            // join() method
            t.join();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
