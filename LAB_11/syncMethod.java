package LAB_11;

public class syncMethod {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        count++;
    }

    public void runExample() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        syncMethod example = new syncMethod();
        example.runExample();
    }
}
