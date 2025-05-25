package lr7;

import java.io.*;

public class Example6 {
    public static void main(String[] args) {
        String filePath = "src/lr7/test_files/input.txt";
        String outputFilePath = "src/lr7/test_files/output.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
             PrintWriter printWriter = new PrintWriter(outputFilePath, "UTF-8")) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                printWriter.println(line.toUpperCase());
            }
            System.out.println("Данные записаны в файл " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
