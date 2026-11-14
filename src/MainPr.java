
import java.util.*;
public class MainPr {

    public static void main(String[] args) throws InterruptedException {

        Map<String, Integer> map = new HashMap<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put("A" + i, i);
                System.out.println(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put("B" + i, i);
                System.out.println(i);
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put("C" + i, i);
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Map size: " + map.size());
    }
}