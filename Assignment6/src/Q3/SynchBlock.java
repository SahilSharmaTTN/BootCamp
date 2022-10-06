package Q3;

public class SynchBlock {
    static Integer count = 0;

    public void display(String message) {

        synchronized (this) {
            count++;
            System.out.println(message +" "+ Thread.currentThread().getName() + " " + count);

        }

    }

    public static void main(String[] args) {

        SynchBlock obj = new SynchBlock();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {

                obj.display("FIZZ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        });


        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {

                obj.display("BUZZ");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });


        t1.start();
        t2.start();
    }
}
