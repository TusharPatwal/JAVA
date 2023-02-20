// loops - Patterns 

import java.util.*;

class day04{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Q1-Print the pattern(Solid Rectangle)
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        /* 
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print("* "); 
            }
            System.out.println();
        }
        */


        // Q2-Print the pattern(Hollow Rectangle)
        // * * * * *
        // *       *
        // *       *
        // * * * * *
        /* 
        int n = sc.nextInt();
        int m = sc.nextInt(); 

        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(i == 1 || j == 1 || i == n || j == m)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        */


        // Q3-Print the pattern(Half Pyramid)
        // *
        // * * 
        // * * * 
        // * * * * 
        /*
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */


        // Q4-Print the pattern(Inverted Half Pyramid )
        // * * * *
        // * * *  
        // * *
        // * 
        /*
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            for(int j = 0; j<n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/


        // Q5-Print the pattern(Inverted Half Pyramid(rotated by 180 deg))
        //       *
        //     * *  
        //   * * *
        // * * * * 
        /*
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print("  ");
            }
            for(int j = 0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/


        // Q6-Print the pattern(Half Pyramid with numbers)
        // 1
        // 1 2  
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        /*
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

        // Q7-Print the pattern(Inverted Half Pyramid with numbers)
        // 1
        // 1 2  
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        /*
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=n+1-i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }*/


        // Q8-Print the pattern(Floyd's Triangle with numbers)
        // 1
        // 2 3  
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        /*
        int n = sc.nextInt();
        int x = 1;
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(x++ + " ");
            }
            System.out.println();
        }*/


        
        // Q9-Print the pattern(0-1 Triangle)
        // 1
        // 0 1  
        // 1 0 1 
        // 0 1 0 1 
        // 1 0 1 0 1
        /**/
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print( "1 ");
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}