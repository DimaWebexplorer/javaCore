package lr7;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class OwnTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter file name:");
        String file_name = scanner.nextLine();

        try (FileInputStream inputStream = new FileInputStream(file_name)) {
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            System.out.println("Read bytes:" + bytesRead);
        } catch (
                IOException e) {
            System.out.println("Data reading exception:" + e.getMessage());
        }
    }
}
