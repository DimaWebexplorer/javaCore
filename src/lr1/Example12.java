package lr1;
import java.util.Scanner;
import java.time.Year;
public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();

        int currentYear = Year.now().getValue();
        int birthYear = currentYear - age;

        System.out.println("Ваш год рождения: " + birthYear);
        scanner.close();
    }
}