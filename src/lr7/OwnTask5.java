package lr7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OwnTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter output file name:");
        String file_output = scanner.nextLine();

        System.out.println("Enter data for writing:");
        String data = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file_output))) {
            writer.write(data);
            System.out.println("Symbols were written: " + data.length());
        } catch (IOException e) {
            System.out.println("Data reading exception:" + e.getMessage());
        }
    }
}
