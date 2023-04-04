
// jump statement in java

public class JumpStatement {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if(i==2)
                break; //break to exit current loop
            System.out.println(i);
        }
        for (int i = 0; i <= 5; i++) {
            if(i==2)
                continue; // continue to skip loops iteration
            System.out.println(i);
        }
        for (int i = 0; i <= 5; i++) {
            if(i==2)
                return; // return to exit the method
            System.out.println(i);
        }
    }
}
