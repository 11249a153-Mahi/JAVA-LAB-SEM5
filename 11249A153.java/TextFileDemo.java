
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class TextFileDemo {
    public static void main(String[] args) {
        String content = "Welcome to Java I/O Operations!";

        try {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write(content);
            fw.close();

            FileReader fr = new FileReader("sample.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
