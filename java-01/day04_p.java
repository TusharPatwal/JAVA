import java.util.*;
// java strings functions 
// loops Pattern 
class day04_p{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // String str = "TusharPatwal";
        // System.out.println(str.length());
        // System.out.println(str.toUpperCase());
        // System.out.println(str.toLowerCase());
        // System.out.println(str.indexOf('r'));
        
        
        // Q10-Print the pattern(Butterfly Pattern)
        // *             *
        // * *         * *
        // * * *     * * * 
        // * * * * * * * *
        // * * * * * * * *
        // * * *     * * *
        // * *         * *
        // *             *  
        /*
        
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j<=(2*(n-i)); j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j<=(2*(n-(n-i))); j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */
        

        // Q11-Print the pattern(Solid Rhombus)
        //         * * * * *
        //       * * * * *
        //     * * * * *
        //   * * * * *
        // * * * * *  
        /*
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */


        // Q12-Print the pattern(Number Pyramid)
        //     1
        //    2 2
        //   3 3 3
        //  4 4 4 4
        // 5 5 5 5 5
        /*
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        */

        // Q13-Print the pattern(Palindromic Pattern)
        //         1
        //       2 1 2
        //     3 2 1 2 3
        //   4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5
        /*
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j = i; j>=1; j--){
                System.out.print(j + " ");
            }
            for(int j = 2; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */

        // Q14-Print the pattern(Diamond Pattern)
        //       *
        //     * * *
        //   * * * * *
        // * * * * * * *
        // * * * * * * *
        //   * * * * *
        //     * * *
        //       *
        /**/
        final int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j = i; j>=1; j--){
                System.out.print("* ");
            }
            for(int j = 2; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i<=n; i++){
            for(int j = 1; j<i; j++){
                System.out.print("  ");
            }for(int j = 0; j<=2*(n-i); j++){
                System.out.print("* ");
            }
            
            
            System.out.println();
        }
        sc.close();
    }
}
