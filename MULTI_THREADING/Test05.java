// Java Synchronized Method & Synchronized Block

class MyThread01 implements Runnable {
  synchronized public void run(){
    for(int i=0; i<3; i++){
      System.out.println("form MyThread01 i : " + i);
    }
    System.out.println("Exit MyThread01");
  }
}
class MyThread02 implements Runnable {
  public void run(){
    synchronized(this){
    for(int j=0; j<3; j++){
      System.out.println("form MyThread02 j : " + j);
    }
    System.out.println("Exit MyThread02");
  }
  }
}

public class Test05 {
  public static void main(String args[]) {
    Thread t2 = new Thread(new MyThread02());
    t2.start();
    Thread t1 = new Thread(new MyThread01());
    t1.start();
    
  }
}