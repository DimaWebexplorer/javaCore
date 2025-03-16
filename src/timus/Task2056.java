package timus;
import java.util.Scanner;

public class Task2056 {
    public static String WhichScholarship() {
        Scanner scanner = new Scanner(System.in);

        var n = scanner.nextInt();
        double sum = 0;
        for(int i = 0; i < n ; i++) {
            int mark = scanner.nextInt();
            if (mark == 3) {
                return "None";
            }
            sum += mark;
        }
        double average = sum / n;
        if (average == 5.0) {
            return "Named";
        }
        if (average >= 4.5) {
            return "High";
        }
        return "Common";
    }

    public static void main(String[] args) {
        System.out.println(WhichScholarship());
    }
}
