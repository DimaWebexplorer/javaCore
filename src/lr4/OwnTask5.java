package lr4;

public class OwnTask5 { // нужно было перехватить исключение RuntimeException, а не NullPointerException
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (RuntimeException e) {
            System.out.println("1");
        }
        System.out.println("2");
    }
}
