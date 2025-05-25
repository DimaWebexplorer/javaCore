package lr7;

import java.io.*;

public class Example4 {
    public static void main(String[] args) {
        String filePath = "src/lr7/example_file.txt";
        String data = "Это данные для записи в файл";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
            System.out.println("Данные записаны в файл: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            char[] buffer = new char[1024];
            int charsRead = reader.read(buffer);
            String readData = new String(buffer, 0, charsRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        if (new File(filePath).delete()) {
            System.out.println("Файл удален: " + filePath);
        } else {
            System.out.println("Не удалось удалить файл: " + filePath);
        }
    }
}
