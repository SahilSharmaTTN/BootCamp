package Q3;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("Thread is Running ");

            for (int i = 0; i < 10; i++) {
                System.out.println("running " + i);
            }

        };

        Thread thread = new Thread(runnable);
        thread.start();

    }
}
