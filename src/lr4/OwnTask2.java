package lr4;

public class OwnTask2 { // Ошибка была в том, что после оператора throw код никогда не будет выполнен, поэтому System.out.println("1") необходимо убрать в блок catch
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (Exception e) {
            System.out.println("1" + e);
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }
}
