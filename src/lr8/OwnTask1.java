package lr8;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class OwnTask1 {
    private static final String FILE_PATH = "src/lr8/ownTask1/example.xml";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Найти книги");
            System.out.println("3. Удалить книгу");
            System.out.println("4. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addBook(scanner);
                case 2 -> searchBooks(scanner);
                case 3 -> deleteBook(scanner);
                case 4 -> System.exit(0);
                default -> System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static void addBook(Scanner scanner) {
        try {
            Document doc = getDocument();
            Element root = doc.getDocumentElement();

            System.out.print("Введите название книги: ");
            String title = scanner.nextLine();
            System.out.print("Введите автора книги: ");
            String author = scanner.nextLine();
            System.out.print("Введите год издания: ");
            String year = scanner.nextLine();

            Element book = doc.createElement("book");

            Element titleElement = doc.createElement("title");
            titleElement.appendChild(doc.createTextNode(title));
            book.appendChild(titleElement);

            Element authorElement = doc.createElement("author");
            authorElement.appendChild(doc.createTextNode(author));
            book.appendChild(authorElement);

            Element yearElement = doc.createElement("year");
            yearElement.appendChild(doc.createTextNode(year));
            book.appendChild(yearElement);

            root.appendChild(book);
            saveDocument(doc);
            System.out.println("Книга успешно добавлена.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void searchBooks(Scanner scanner) {
        try {
            Document doc = getDocument();
            NodeList books = doc.getElementsByTagName("book");

            System.out.print("Введите автора или год издания для поиска: ");
            String query = scanner.nextLine();

            System.out.println("Результаты поиска:");
            for (int i = 0; i < books.getLength(); i++) {
                Element book = (Element) books.item(i);
                String author = book.getElementsByTagName("author").item(0).getTextContent();
                String year = book.getElementsByTagName("year").item(0).getTextContent();

                if (author.equalsIgnoreCase(query) || year.equals(query)) {
                    String title = book.getElementsByTagName("title").item(0).getTextContent();
                    System.out.println("Название: " + title + ", Автор: " + author + ", Год: " + year);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteBook(Scanner scanner) {
        try {
            Document doc = getDocument();
            NodeList books = doc.getElementsByTagName("book");

            System.out.print("Введите название книги для удаления: ");
            String titleToDelete = scanner.nextLine();

            boolean found = false;
            for (int i = 0; i < books.getLength(); i++) {
                Element book = (Element) books.item(i);
                String title = book.getElementsByTagName("title").item(0).getTextContent();

                if (title.equalsIgnoreCase(titleToDelete)) {
                    book.getParentNode().removeChild(book);
                    found = true;
                    break;
                }
            }

            if (found) {
                saveDocument(doc);
                System.out.println("Книга успешно удалена.");
            } else {
                System.out.println("Книга с таким названием не найдена.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Document getDocument() throws Exception {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            Element root = doc.createElement("library");
            doc.appendChild(root);
            saveDocument(doc);
        }
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        return builder.parse(file);
    }

    private static void saveDocument(Document doc) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(FILE_PATH));
        transformer.transform(source, result);
    }
}
