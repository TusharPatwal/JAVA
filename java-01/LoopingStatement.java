import java.util.Scanner;

class LoopingStatement{
	
	public static void main(String[] args){
        // for loop 
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.print(n*i + " ");
        } System.out.println();;


        // While loop 
        int i=1;
        while(i<=10){
            System.out.print(n*i + " ");
            i++;
        } System.out.println();

        // do while loop 

        // foreach loop
        sc.close();
	}
}