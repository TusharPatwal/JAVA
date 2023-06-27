class EXceptionClass extends Exception{
    public EXceptionClass(String string){
        super(string);
    }
}
public class test07{
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0){
                throw new EXceptionClass("Error exception class");
            }
        }catch (EXceptionClass e) {
            System.out.println(e);
        }
    }
}