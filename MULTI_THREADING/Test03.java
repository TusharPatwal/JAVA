// creation of Multiple-Threads 

public class Test03 implements Runnable{
    public void run(){
        for(int i = 0; i<=5; i++){
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("i = " + i);
        }
    }
    public static void main(String[] args) {
        Test03 t = new Test03();
        Thread t1 = new Thread(t);

        Test03 x = new Test03();
        Thread x1 = new Thread(x);
        
        t1.start();
        x1.start();
    }
}
