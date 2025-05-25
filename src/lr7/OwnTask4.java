package lr7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OwnTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input file name:");
        String file_input = scanner.nextLine();

        System.out.println("Enter word for searching:");
        String pattern = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(file_input))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(pattern)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Data reading exception:" + e.getMessage());
        }
    }
}
