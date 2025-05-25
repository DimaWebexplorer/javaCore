package lr7;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class Example3 {
    public static void main(String[] args) {
        String filePath = "src/lr7/example_file.txt";
        String data = "Это данные для записи в файл";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(data);
            System.out.println("Данные записаны в файл: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (FileReader reader = new FileReader(filePath)) {
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
