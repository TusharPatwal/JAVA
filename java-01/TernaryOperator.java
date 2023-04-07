// Ternary operator

class TernaryOperator{
    public static void main(String[] args) {
        // find among the three variables that which is greatest(by ternary operator) 

        int a = 10, b = 43, c = 24;
        int greatest = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("The greatest among the three is "+ greatest);


    }
}