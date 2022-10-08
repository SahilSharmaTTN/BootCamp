package Q5;

public class DeadlockEx {
        public static void main(String[] args){


            final String r1 = "Resource1";
            final String r2 = "Resource2";

            Thread t1 = new Thread(() -> {

                synchronized(r1){

                    System.out.println("Thread 1: Locked r1");

                    try{
                        Thread.sleep(100);
                        System.out.println("Thread 1: Waiting for r2");
                    }
                    catch (InterruptedException e) {
                    }
                    synchronized(r2){
                        System.out.println("Thread 1: Locked r2");
                    }
                }
            });
            Thread t2 = new Thread(() -> {
                synchronized(r2){
                    System.out.println("Thread 2: Locked r2");
                    try{
                        Thread.sleep(100);
                        System.out.println("Thread 2: Waiting for r1");
                    } catch( InterruptedException e) {

                    }
                    synchronized(r1){
                        System.out.println("Thread 2: Locked r1");
                    }
                }
            });

            t1.start();
            t2.start();
        }


}