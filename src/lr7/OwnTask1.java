package lr7;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class OwnTask1 {
    public static void main(String[] args) {
        String file_input = "src/lr7/test_files/input.txt";
        String format = "UTF-8";

        try (
                InputStream inputStream = new FileInputStream(file_input);
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, format);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            int line_count = 0;
            while (bufferedReader.readLine() != null) {
                line_count++;
            }

            System.out.println("Line count: " + line_count);
        } catch (IOException e) {
            System.out.println("Data writing/reading exception:" + e.getMessage());
        }
    }
}
