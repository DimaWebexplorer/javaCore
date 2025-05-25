package lr7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExampleOwn6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input file name:");
        String file_input = scanner.nextLine();

        System.out.println("Enter output file name:");
        String file_output = scanner.nextLine();

        String format = "UTF-8";

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file_input));
                PrintWriter printWriter = new PrintWriter(file_output, format);
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }

            System.out.println("Data was written: " + file_output);
        } catch (IOException e) {
            System.out.println("Data writing/reading exception:" + e.getMessage());
        }
    }
}
