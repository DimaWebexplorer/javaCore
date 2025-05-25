package lr7;

import java.io.*;
import java.util.Scanner;

public class ExampleOwn5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input file name:");
        String file_input = scanner.nextLine();

        System.out.println("Enter output file name:");
        String file_output = scanner.nextLine();

        String format = "UTF-8";

        try (
                InputStream inputStream = new FileInputStream(file_input);
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, format);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                OutputStream outputStream = new FileOutputStream(file_output);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, format);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            }

            System.out.println("Data was written: " + file_output);
        } catch (IOException e) {
            System.out.println("Data writing/reading exception:" + e.getMessage());
        }
    }
}
