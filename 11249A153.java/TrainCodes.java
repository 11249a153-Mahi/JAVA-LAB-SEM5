import java.util.Scanner;

public class TrainCodes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] trainCodes = {101, 202, 303, 404, 505};

        System.out.print("Enter train code index (0-4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Train Code = " + trainCodes[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
            System.out.println("Please enter an index between 0 and 4.");
        }

        sc.close();
    }
}