package Q2;

import java.util.concurrent.TimeUnit;

public class ThreadTask implements Runnable {
    int count = 0 ;
    public void run() {
        try {
            // Long duration = (long) (Math.random() * 20);
            for (int i = 0; i < 15; i++) {
                System.out.println("Running Task! " + count++);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//            TimeUnit.SECONDS.sleep(duration);
//            System.out.println("hello");

    }
}

