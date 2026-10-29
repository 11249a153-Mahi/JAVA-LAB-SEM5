class Student {
    int rollNo;
    String name;

    void getStudentDetails() {
        rollNo = 101;
        name = "Mahith";
    }

    void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Student Name: " + name);
    }
}

class Marks extends Student {
    int m1 = 85;
    int m2 = 90;
    int m3 = 78;
    int m4 = 88;
    int m5 = 95;

    void displayMarks() {
        System.out.println("Marks in Five Subjects:");
        System.out.println("Subject 1: " + m1);
        System.out.println("Subject 2: " + m2);
        System.out.println("Subject 3: " + m3);
        System.out.println("Subject 4: " + m4);
        System.out.println("Subject 5: " + m5);
    }
}

class Result extends Marks {
    int total;
    double average;
    String grade;

    void calculateResult() {
        total = m1 + m2 + m3 + m4 + m5;
        average = total / 5.0;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    void displayResult() {
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Result r = new Result();

        r.getStudentDetails();
        r.calculateResult();

        System.out.println("STUDENT RESULT");
        System.out.println("--------------------");

        r.displayStudentDetails();
        r.displayMarks();
        r.displayResult();
    }
}
