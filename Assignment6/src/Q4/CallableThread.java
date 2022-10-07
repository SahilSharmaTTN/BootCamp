package Q4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThread implements Callable {
    @Override
    public Object call() throws Exception {
        return "Thread Complete";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable callable = new CallableThread();

        FutureTask futureTask = new FutureTask(callable);
        Thread thread = new Thread(futureTask);

        thread.start();

        System.out.println(futureTask.get());

    }
}
