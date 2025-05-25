package lr7;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class OwnTask2 {
    public static void main(String[] args) {
        String file_input = "src/lr7/test_files/input.txt";
        String file_output = "src/lr7/test_files/output.txt";
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
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            System.out.println("Data was copied: " + file_output);
        } catch (IOException e) {
            System.out.println("Data writing/reading exception:" + e.getMessage());
        }
    }
}
