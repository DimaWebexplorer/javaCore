package lr4;

public class OwnTask12 { // здесь ошибка так как тип неверный, ожидается str, а пробрасывается null, необходимо перехватить это исключение в главном методе
    public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }

    public static void main(String[] args) {
        try {
            m(null, 0.000001);
        } catch (IllegalArgumentException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }
    }
}
