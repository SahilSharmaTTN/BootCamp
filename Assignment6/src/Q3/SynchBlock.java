package Q3;

public class SynchBlock {
    static Integer count = 0;

    public void display(String message) throws InterruptedException {

        synchronized (this) {
            count++;
            System.out.println(message +" "+ Thread.currentThread().getName() + " " + count);
        }

    }

    public static void main(String[] args) {

        SynchBlock obj = new SynchBlock();

        Thread t1 = new Thread(() -> {
            Thread.currentThread().setName("A");
            for (int i = 0; i < 5; i++) {

                try {
                    obj.display("FIZZ");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        });


        Thread t2 = new Thread(() -> {

            Thread.currentThread().setName("B");

            for (int i = 0; i < 5; i++) {

                try {
                    obj.display("BUZZ");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        });


        t1.start();
        t2.start();

    }
}
