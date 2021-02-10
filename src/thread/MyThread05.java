package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author xiaobai
 * @Date 2021/2/10 23:14
 * @Version 1.0
 */
public class MyThread05 {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newSingleThreadExecutor();
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
