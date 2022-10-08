package Q5;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx {
    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();

        final String r1 = "Resource1";
        final String r2 = "Resource2";

        Thread t1 = new Thread(() -> {

            lock.lock();
            System.out.println("Thread 1 : Acquired Lock");

            try {
                System.out.println("Accessing: " + r1);
                Thread.sleep(100);
                System.out.println("Accessing: "  + r2);

            } catch (InterruptedException e) {}
            finally {
                lock.unlock();
                System.out.println("Thread 1 : Releasing lock");
            }




        });

        Thread t2 = new Thread(() -> {

            lock.lock();
            System.out.println("Thread 2 : Acquired Lock");

            try {
                System.out.println("Accessing: " + r2);
                Thread.sleep(100);
                System.out.println("Accessing: "  + r1);

            } catch (InterruptedException e) {}
            finally {
                lock.unlock();
                System.out.println("Thread 2 : Releasing lock");
            }

        });

        t1.start();
        t2.start();
    }

}

