package lr8;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class OwnTask3 {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";
        String outputFilePath = "src/lr8/ownTask3/links.txt";
        int maxRetries = 3;

        try (FileWriter writer = new FileWriter(outputFilePath)) {
            Document doc = fetchDocumentWithRetries(url, maxRetries);
            if (doc != null) {
                Elements links = doc.select("a[href]");
                for (Element link : links) {
                    String absoluteLink = link.attr("abs:href");
                    System.out.println(absoluteLink);
                    writer.write(absoluteLink + System.lineSeparator());
                }
                System.out.println("Ссылки успешно сохранены в файл: " + outputFilePath);
            } else {
                System.out.println("Не удалось подключиться к сайту после " + maxRetries + " попыток.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Document fetchDocumentWithRetries(String url, int maxRetries) {
        int attempt = 0;
        while (attempt < maxRetries) {
            try {
                System.out.println("Попытка подключения #" + (attempt + 1));
                return Jsoup.connect(url).get();
            } catch (IOException e) {
                System.out.println("Ошибка подключения: " + e.getMessage());
                attempt++;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {
                }
            }
        }
        return null;
    }
}
