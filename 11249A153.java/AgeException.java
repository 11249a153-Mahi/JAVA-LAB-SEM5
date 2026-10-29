import java.util.Scanner;

public class AgeException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String input = sc.nextLine();

        try {
            int age = Integer.parseInt(input);

            System.out.println("Age = " + age);

            int result = 100 / age;

            System.out.println("100 / Age = " + result);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number for age.");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Age cannot be zero.");
        }

        sc.close();
    }
}
