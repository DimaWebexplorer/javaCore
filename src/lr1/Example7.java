package lr1;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Ваш возраст: ");
        int age = scanner.nextInt();

        System.out.println("Имя: " + name + ", Возраст: " + age);
        scanner.close();
    }
}
