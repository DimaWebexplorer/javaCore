package timus;
import java.util.Scanner;

public class Task1263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] votes = new int[N];

        for (int i = 0; i < M; i++) {
            int candidateNumber = scanner.nextInt();
            votes[candidateNumber - 1]++;
        }

        for (int i = 0; i < N; i++) {
            double percentage = (votes[i] * 100.0) / M;
            System.out.printf("%.2f%%\n", percentage);
        }

        scanner.close();
    }
}
