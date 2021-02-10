package thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 测试到无效：交替运行，但是不知道synchronized要锁那个对象
 * @Author xiaobai
 * @Date 2021/2/10 23:33
 * @Version 1.0
 */
public class TestThreadMethod {
    private static Integer count = 1;
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i < 100; i++) {
                    synchronized (count){
                        count.notify();
                        try {
                            count.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count ++;
                    System.out.println("t1" + count);
                }
                synchronized (count){
                    count.notify();
                }
            }catch (Throwable e){
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 100; i++) {
                    synchronized (count){
                        count.notify();
                        try {
                            count.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count ++;
                    System.out.println("t2" + count);
                }
                synchronized (count){
                    count.notify();
                }
            }catch (Throwable e){
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
        System.out.println("count" + count);
    }
}
