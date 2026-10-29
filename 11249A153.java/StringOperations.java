import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second employee name: ");
        String name2 = sc.nextLine();

        System.out.println("\n--- String Operations ---");

        System.out.println("First employee name: " + name1);
        System.out.println("Second employee name: " + name2);
        System.out.println("Length of first name: " + name1.length());
        System.out.println("First name in uppercase: " + name1.toUpperCase());
        System.out.println("Second name in lowercase: " + name2.toLowerCase());

        if (name1.equals(name2)) {
            System.out.println("Both employee names are the same.");
        } else {
            System.out.println("Employee names are different.");
        }

        sc.close();
    }
}