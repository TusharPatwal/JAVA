
class Bike{  
  void run(){System.out.println("running");}  
}  

class test003 extends Bike{  
  void run(){System.out.println("running safely with 60km");}  
  
  public static void main(String args[]){  
    Bike b = new test003();//upcasting  
    b.run();  
    b = new Bike();
    b.run();
  }  
} 