package thread;

/**
 * @Author xiaobai
 * @Date 2021/2/10 22:34
 * @Version 1.0
 */
public class MyThread01 extends Thread{

    private static int j = 1;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + j ++);
        }
    }
}
