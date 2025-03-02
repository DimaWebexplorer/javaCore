package lr1;
import java.util.Scanner;
import java.time.Year;
public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите год вашего рождения: ");
        int birthYear = scanner.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("Имя: " + name + ", Возраст: " + age);
        scanner.close();
    }
}