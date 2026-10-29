
interface Sports {
    void play();
}

interface Academics {
    void study();
}

class Student implements Sports, Academics {
    public void play() {
        System.out.println("Student is playing sports.");
    }

    public void study() {
        System.out.println("Student is studying academics.");
    }

    void display() {
        System.out.println("Multiple Inheritance Through Interfaces");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Student s = new Student();

        s.display();
        s.play();
        s.study();
    }
}
