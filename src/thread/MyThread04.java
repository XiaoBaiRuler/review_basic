package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author xiaobai
 * @Date 2021/2/10 23:10
 * @Version 1.0
 */
public class MyThread04 {
    public static void main(String[] args) {

        ExecutorService ex = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            ex.submit(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        System.out.println(Thread.currentThread().getName() + j);
                    }
                }
            });
        }

    }
}
