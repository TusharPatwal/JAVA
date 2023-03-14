import java.util.*;

// wap to create a class matrix. the class should have 1 field as 3*3 matrix.
// write a function to accept a matrix and display its transpose
/*
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
 */

/*
 * wap to create student class having fields name, roll, marks in 5 subjects.
 * class should contain void display result which display the average marks
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

// Wap to create circle class and calculate its circumference & area.
class Circle{
    public double r;

    public double circumference(){
        return 2*3.14*r;
    }

    public double area(){
        return 2*r*r;
    }
}

class Labwork_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Circle obj = new Circle();

        obj.r = 5;
        System.out.println(obj.circumference());
        System.out.println(obj.area());

        /*
         * Students tushar = new Students();
         * 
         * tushar.except();
         * tushar.displayResults();
         */
        
        /* 
         Matrix mat = new Matrix();

        mat.accept();
        mat.transpose();
        */
        sc.close();
    }
}
