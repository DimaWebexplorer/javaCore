package lr7;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class Example9 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src/lr7/test_files/input.txt");
             FileWriter writer = new FileWriter("src/lr7/test_files/output.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("Файл успешно скопирован!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
