package lr8;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class OwnTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите путь к Excel файлу: ");
                String filePath = scanner.nextLine();
                FileInputStream inputStream = new FileInputStream(filePath);
                XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

                System.out.print("Введите название листа: ");
                String sheetName = scanner.nextLine();
                XSSFSheet sheet = workbook.getSheet(sheetName);

                if (sheet == null) {
                    throw new IllegalArgumentException("Лист с названием \"" + sheetName + "\" не найден.");
                }

                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + "\t");
                    }
                    System.out.println();
                }

                workbook.close();
                inputStream.close();
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Ошибка: Файл не найден. Проверьте путь и попробуйте снова.");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Ошибка при чтении файла. Убедитесь, что файл имеет правильный формат.");
            } catch (Exception e) {
                System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
            }

            System.out.println("Попробуйте снова.\n");
        }
        scanner.close();
    }
}
