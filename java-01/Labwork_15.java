// 13. Consider a university where students who participate in the national games or Olympics are given some grace marks. Therefore, the final marks awarded = Exam_Marks + Sports_Grace_Marks. A class diagram representing this scenario is as follow;

import java.util.Scanner;

class Student {
    String Name;
    long rollNo;

    void getData(String Name, long rollNo) {
        this.Name = Name;
        this.rollNo = rollNo;
    }
}

class Exam extends Student {
    int Exam_Marks;

    void getData(String Name, long rollNo, int Exam_Marks) {
        super.getData(Name, rollNo);
        this.Exam_Marks = Exam_Marks;
    }
}

interface Sports {
    int marks = 10;
}

class Result extends Exam implements Sports {
    int resultExam() {
        return marks + Exam_Marks;
    }

    void getData(String Name, long rollNo, int Exam_Marks) {
        super.getData(Name, rollNo, Exam_Marks);
    }

}

public class Labwork_15 {
    public static void main(String[] args) {
        Result r1 = new Result();
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
        int rollNo = sc.nextInt();
        int Exam_Marks = sc.nextInt();       
        r1.getData(Name, rollNo, Exam_Marks);
        System.out.println(r1.resultExam());
        sc.close();
    }
}