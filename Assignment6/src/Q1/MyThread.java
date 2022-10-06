package Q1;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread using thread Class is Running");

        for( int i =1 ; i< 5 ; i++){
            System.out.println(i);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(currentThread().getName() + " is completed");

    }
}
