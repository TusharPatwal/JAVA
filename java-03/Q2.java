class A extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            try{
            if(i==3){
                Thread.sleep(1000);
            }}
            catch(InterruptedException e){
                System.out.println("ex");
            }
            System.out.println(i);
        }
    }
}
// class B extends Thread{
//     public void run(){
//         for(int i=0;i<5;i++){

//             System.out.println("B ka hai");
//         }
//     }
// }
public class Q2 {
    public static void main(String[] args) {
        A a=new A();
        a.start();


    }
    
}
