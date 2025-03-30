package lr3;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n) {
        return switch (n) {
            case 0 -> 0;
            case 1 -> 1;
            default -> fact(n - 2) + fact(n - 1);
        };
    }
}
