package lr7;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example2 {
    public static void main(String[] args) {
        String filePath = "src/lr7/example_file.txt";
        String data = "Это данные для записи в файл";
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            outputStream.write(data.getBytes());
            System.out.println("Данные записаны в файл: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String readData = new String(buffer, 0, bytesRead);
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
