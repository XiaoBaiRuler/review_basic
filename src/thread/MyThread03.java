package thread;

import java.util.concurrent.Callable;

/**
 * @Author xiaobai
 * @Date 2021/2/10 22:47
 * @Version 1.0
 */
public class MyThread03 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (; i < 100; i ++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
        return i;
    }
}
