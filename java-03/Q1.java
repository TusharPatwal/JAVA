import java.util.*;
class MyThreads implements Runnable{

    public void run(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.print(n*i + " ");
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        MyThreads ob1 = new MyThreads();
        MyThreads ob2 = new MyThreads();
        MyThreads ob3 = new MyThreads();

        Thread A = new Thread(ob1);
        A.start();
        Thread B = new Thread(ob2);
        B.start();
        Thread C = new Thread(ob3);
        C.start();
    }
}
