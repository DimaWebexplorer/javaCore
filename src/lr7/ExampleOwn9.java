package lr7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExampleOwn9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input file name:");
        String file_input = scanner.nextLine();

        System.out.println("Enter output file name:");
        String file_output = scanner.nextLine();

        try (
                FileReader fileReader = new FileReader(file_input);
                FileWriter fileWriter = new FileWriter(file_output);) {
            int c;
            while ((c = fileReader.read()) != -1) {
                fileWriter.write(c);
            }

            fileReader.close();
            fileWriter.close();
            System.out.println("File was written successful");
        } catch (IOException e) {
            System.out.println("Data writing/reading exception:" + e.getMessage());
        }
    }
}
