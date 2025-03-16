package lr2;
import java.util.Scanner;

public class OwnTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        scanner.nextLine();

        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");

        while (true) {
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("y")) {
                String decryptedText = encrypt(encryptedText, -key);
                System.out.println("Текст после обратного преобразования: " + decryptedText);
                break;
            } else if (response.equalsIgnoreCase("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
        scanner.close();
    }

    private static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                character = (char) ((character + key));
            }
            result.append(character);
        }

        return result.toString();
    }
}
