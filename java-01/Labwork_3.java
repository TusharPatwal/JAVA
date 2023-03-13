import java.util.*;

// wap to create a class matrix. the class should have 1 field as 3*3 matrix.
// write a function to accept a matrix and display its transpose

class Matrix {
    Scanner sc = new Scanner(System.in);
    public int[][] matrix = new int[3][3];

    public void accept() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public void transpose() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
/*
 * class Students {
 * public String name;
 * public long roll;
 * public int[] marks = new int[5];
 * public double sum;
 * 
 * Scanner sc = new Scanner(System.in);
 * public void except() {
 * name = sc.nextLine();
 * roll = sc.nextLong();
 * 
 * for (int i = 0; i < 5; i++) {
 * marks[i] = sc.nextInt();
 * }
 * for (int i = 0; i < 5; i++) {
 * sum += marks[i];
 * }
 * }
 * 
 * public void displayResults() {
 * System.out.println("My name is " + name);
 * System.out.println("My roll is " + roll);
 * System.out.println("Average total marks is " + sum / 5);
 * }
 * }
 */

class Labwork_3 {
    public static void main(String args[]) {
        // wap to create class student having fields like name, roll, marls in 5
        // which display avg. marks.
        // Students tushar = new Students();

        // tushar.except();
        // tushar.displayResults();

        Matrix mat = new Matrix();

        mat.accept();
        mat.transpose();
    }
}
 