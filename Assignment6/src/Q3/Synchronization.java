package Q3;

public class Synchronization {
    static int Counter = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                increment();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                increment();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.setName("A");
        thread2.setName("B");

        thread1.start();
        thread2.start();

    }

     synchronized public static void increment() {
        Counter++;
        System.out.println("Thread " + Thread.currentThread().getName()+ "| Counter value : " + Counter);

    }
}
