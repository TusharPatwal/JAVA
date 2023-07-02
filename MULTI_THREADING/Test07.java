// CONTROLLING THE MAIN THREAD

public class Test07 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current Thread name : " + t);
        
        t.setName("MyThread001");
        
        System.out.println("New name of thread : " + t);

        try {
            for(int i = 5; i>0; i--){
                System.out.println(i);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
    }
}
