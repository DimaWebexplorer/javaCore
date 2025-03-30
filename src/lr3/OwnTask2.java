package lr3;

public class OwnTask2 {
    public static String Recursion(int n) {
        return switch (n) {
            case 0 -> "0";
            case 1 -> "1";
            default -> Recursion(n / 2) + (n % 2);
        };
    }

    public static void main(String[] args) {
        System.out.println(Recursion(11));
    }
}
