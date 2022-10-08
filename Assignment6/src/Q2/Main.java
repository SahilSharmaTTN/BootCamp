package Q2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        ExecutorService executor1 = Executors.newSingleThreadExecutor();

        ExecutorService executor2 = Executors.newFixedThreadPool(5);

        ExecutorService executor3 = Executors.newCachedThreadPool();

        try {
            executor1.submit(new ThreadTask());
            System.out.println("Shutdown executor");
            executor1.shutdown();
            executor1.awaitTermination(11, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        } finally {

            if (!executor1.isTerminated()) {
                System.err.println("cancel non-finished tasks");
            }
            executor1.shutdownNow();
            System.out.println("shutdown finished");
        }


        try {
            executor2.submit(new ThreadTask());
            System.out.println("Shutdown executor");
            executor2.shutdown();
            executor2.awaitTermination(11, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        } finally {

            if (!executor2.isTerminated()) {
                System.err.println("cancel non-finished tasks");
            }
            executor2.shutdownNow();
            System.out.println("shutdown finished");
        }

        try {
            executor3.submit(new ThreadTask());
            System.out.println("Shutdown executor");
            executor3.shutdown();
            executor3.awaitTermination(11, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        } finally {

            if (!executor3.isTerminated()) {
                System.err.println("cancel non-finished tasks");
            }
            executor3.shutdownNow();
            System.out.println("shutdown finished");
        }

    }
}


