
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UserProfile {
    public static void main(String[] args) {
        String data = "Name: Mahith\nAge: 20\nFitness Goal: Weight Loss";

        try {
            FileOutputStream fout =
                new FileOutputStream("profile.txt");
            fout.write(data.getBytes());
            fout.close();

            FileInputStream fin =
                new FileInputStream("profile.txt");

            int ch;
            while ((ch = fin.read()) != -1) {
                System.out.print((char) ch);
            }

            fin.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
