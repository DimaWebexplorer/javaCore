package lr4;

public class OwnTask7 { // ошибка что в блоке catch (NullPointerException e) выбрасывается новое исключение ArithmeticException, которое не перехватывается последующим блоком catch (ArithmeticException e), так как он уже был пройден.
    public static void main(String[] args) { // необходимо добавить блок catch для ArithmeticException после выброса нового исключения или переместить выброс нового исключения в другой блок try
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException ex) {
                System.out.println("2");
            }
        }
        System.out.println("3");
    }
}
