package lr7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExampleOwn3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input file name:");
        String file_name = scanner.nextLine();

        System.out.println("Enter input data to write:");
        String data = scanner.nextLine();

        try (FileWriter writer = new FileWriter(file_name)) {
            writer.write(data);
            System.out.println("Data was written: " + file_name);
        } catch (IOException e) {
            System.out.println("Data writing exception:" + e.getMessage());
        }

        try (FileReader reader = new FileReader(file_name)) {
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer, 0, charRead);
            System.out.println("Read data:" + readData);
        } catch (IOException e) {
            System.out.println("Data reading exception:" + e.getMessage());
        }

        if (new File(file_name).delete()) {
            System.out.println("File was deleted: " + file_name);
        } else {
            System.out.println("File delete failed: " + file_name);
        }
    }

}
