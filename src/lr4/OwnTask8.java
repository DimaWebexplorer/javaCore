package lr4;

public class OwnTask8 { // В этом коде, метод m() выбрасывает RuntimeException, которая необходимо перехватить в блоке catch в main().
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(m());
        } catch (RuntimeException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
