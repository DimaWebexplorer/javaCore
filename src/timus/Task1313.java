package timus;
import java.util.Scanner;

public class Task1313 {
    public static void SquareResolution() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = scanner.nextInt();
                arr[i][j] = num;
            }
        }
        int p = 0;
        int k = 0;
        for (int i = 0; i < 2*n; i++) {
            int q = p;
            int t = k;
            while (t<=p) {
                System.out.printf("%d ", arr[q][t]);
                q-=1;
                t+=1;
            }
            if (p==n-1) {
                k+=1;
            }
            else
            {
                p+=1;
            }
        }
    }

    public static void main(String[] args) {
        SquareResolution();
    }
}
