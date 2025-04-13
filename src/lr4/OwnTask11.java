package lr4;

public class OwnTask11 { // ошибки нет, выполнится код по порядку, будет обработана ошибка в catch, потом выполлнится блок finally, и программа продолжит выполнение, в конце будет выведено 3
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } finally {
            System.out.println("2");
        }
        System.out.println("3");
    }
}
