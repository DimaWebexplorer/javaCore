package timus;
import java.math.BigInteger;
import java.util.Scanner;
public class Task1243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger N = scanner.nextBigInteger();

        BigInteger remainder = N.mod(BigInteger.valueOf(7));

        System.out.println(remainder);

        scanner.close();
    }
}