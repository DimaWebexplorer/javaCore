package lr3;

public class OwnTask1 {
    private static int DepthFibNum(int n, int depth) {
        System.out.println(" ".repeat(depth) + "fib" + n);
        if (n <= 1) {
            return n;
        }
        return DepthFibNum(n - 1, depth + 1) + DepthFibNum(n - 2, depth + 1);
    }

    public static int FibNum(int n) {
        return DepthFibNum(n, 0);
    }

    public static void main(String[] args) {
        System.out.println(FibNum(4));
    }
}
