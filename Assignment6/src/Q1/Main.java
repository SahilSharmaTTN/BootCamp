package Q1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        MyThread thread1 = new MyThread();
        thread1.setName("Thread A");

        Thread thread2 =  new Thread(new MyThread2());
        thread2.setName("Thread B");

        thread1.start();
        thread1.join();
        thread2.start();


    }
}
