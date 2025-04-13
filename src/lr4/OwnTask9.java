package lr4;

public class OwnTask9 { // ошибок нет, блок finally всегда выполнится, а в блоке try выполнится return 55 и программа закончит выполнение
    public static int m() {
        try {
            System.out.println("0");
            return 55;
        } finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
