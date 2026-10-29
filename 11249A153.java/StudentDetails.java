class Student {
    String name;
    int rollNumber;
    int marks;

    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 80)
            return 'B';
        else if (marks >= 70)
            return 'C';
        else if (marks >= 60)
            return 'D';
        else if (marks >= 50)
            return 'E';
        else
            return 'F';
    }


    void displayInfo() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + calculateGrade());
        System.out.println("--------------------------");
    }
}

public class StudentDetails {
    public static void main(String[] args) {


        Student s1 = new Student("Mahith", 101, 92);
        Student s2 = new Student("Rahul", 102, 76);

        System.out.println("STUDENT DETAILS");
        System.out.println("==========================");

        s1.displayInfo();
        s2.displayInfo();
    }
}