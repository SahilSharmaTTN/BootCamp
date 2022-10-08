package Q2;

import java.util.concurrent.TimeUnit;

public class ThreadTask implements Runnable {

    public void run() {
        try {
            Long duration = (long) (Math.random() * 20);
            System.out.println("Running Task!");
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

