package lr7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExampleOwn8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input file name:");
        String file_input = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(file_input))) {
            int line_count = 0;
            while (reader.readLine() != null) {
                line_count++;
            }
            reader.close();
            System.out.println("Line count:" + line_count);
        } catch (IOException e) {
            System.out.println("Data reading exception:" + e.getMessage());
        }
    }
}
