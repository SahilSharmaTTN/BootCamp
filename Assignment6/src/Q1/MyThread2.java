package Q1;

import java.util.stream.IntStream;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread using Runnable Class is Running");
        IntStream.rangeClosed(5,10).forEach(System.out::println);

        System.out.println("Finished");
    }
}
