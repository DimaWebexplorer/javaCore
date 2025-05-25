package lr7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExampleOwn2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input file name:");
        String file_name = scanner.nextLine();

        System.out.println("Enter input data to write:");
        String data = scanner.nextLine();

        try (FileOutputStream outputStream = new FileOutputStream(file_name)) {
            outputStream.write(data.getBytes());

            System.out.println("Data was written: " + file_name);
        } catch (IOException e) {
            System.out.println("Data writing exception:" + e.getMessage());
        }

        try (FileInputStream inputStream = new FileInputStream(file_name)) {
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String readData = new String(buffer, 0, bytesRead);
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
