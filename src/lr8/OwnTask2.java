package lr8;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class OwnTask2 {
    private static final String FILE_PATH = "src/lr8/ownTask2/example.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ensureFileExists();

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Найти книги по автору");
            System.out.println("2. Добавить новую книгу");
            System.out.println("3. Удалить книгу по названию");
            System.out.println("4. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> searchBooksByAuthor(scanner);
                case 2 -> addNewBook(scanner);
                case 3 -> deleteBookByTitle(scanner);
                case 4 -> System.exit(0);
                default -> System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static void ensureFileExists() {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                JSONObject library = new JSONObject();
                library.put("library", new JSONArray());
                try (FileWriter writer = new FileWriter(FILE_PATH)) {
                    writer.write(library.toJSONString());
                }
                System.out.println("Файл JSON создан.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void searchBooksByAuthor(Scanner scanner) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(FILE_PATH));
            JSONArray jsonArray = (JSONArray) jsonObject.get("library");

            System.out.print("Введите имя автора: ");
            String author = scanner.nextLine();

            System.out.println("Книги автора " + author + ":");
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                if (author.equalsIgnoreCase((String) book.get("author"))) {
                    System.out.println("Название: " + book.get("title") + ", Год: " + book.get("year"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addNewBook(Scanner scanner) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(FILE_PATH));
            JSONArray jsonArray = (JSONArray) jsonObject.get("library");

            System.out.print("Введите название книги: ");
            String title = scanner.nextLine();
            System.out.print("Введите автора книги: ");
            String author = scanner.nextLine();
            System.out.print("Введите год издания: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            JSONObject newBook = new JSONObject();
            newBook.put("title", title);
            newBook.put("author", author);
            newBook.put("year", year);

            jsonArray.add(newBook);
            saveToFile(jsonObject);
            System.out.println("Книга успешно добавлена.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteBookByTitle(Scanner scanner) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(FILE_PATH));
            JSONArray jsonArray = (JSONArray) jsonObject.get("library");

            System.out.print("Введите название книги для удаления: ");
            String title = scanner.nextLine();

            boolean found = false;
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject book = (JSONObject) jsonArray.get(i);
                if (title.equalsIgnoreCase((String) book.get("title"))) {
                    jsonArray.remove(i);
                    found = true;
                    break;
                }
            }

            if (found) {
                saveToFile(jsonObject);
                System.out.println("Книга успешно удалена.");
            } else {
                System.out.println("Книга с таким названием не найдена.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void saveToFile(JSONObject jsonObject) {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            writer.write(jsonObject.toJSONString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
