package lr4;

public class OwnTask10 { // ошибки нет, выполнится блок try до return 15, но затем управление перейдет в блок finally, который выполнит System.out.println("1") и вернет 20, на этом выполнение данного метода будет закончено
    public static int m() {
        try {
            System.out.println("0");
            return 15;
        } finally {
            System.out.println("1");
            return 20;
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
