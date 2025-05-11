package lr6;

public class OwnTask4 {
    private static final Object lock = new Object();
    private static int currentThread = 1;

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int threadNumber = i;
            new Thread(() -> {
                synchronized (lock) {
                    while (threadNumber != currentThread) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println("Thread number: " + threadNumber);
                    currentThread++;
                    lock.notifyAll();
                }
            }).start();
        }
    }
}