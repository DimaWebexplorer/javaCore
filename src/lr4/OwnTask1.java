package lr4;

public class OwnTask1 { // Ошибка была перехвачена уже, исправление не требуется
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw  new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException e) {
            System.out.println("1  "+ e);
        }
        System.out.println("2");
    }
}
