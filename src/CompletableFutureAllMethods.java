import java.util.concurrent.*;

public class CompletableFutureAllMethods {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println(
                    Thread.currentThread().getName()
                            + " executing Runnable");
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}