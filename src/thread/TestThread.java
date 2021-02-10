package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author xiaobai
 * @Date 2021/2/10 22:34
 * @Version 1.0
 */
public class TestThread {
    public static void main(String[] args) {
//        // 1. Thread的子类
//        MyThread01 myThread1 = new MyThread01();
//        MyThread01 myThread2 = new MyThread01();
//        MyThread01 myThread3 = new MyThread01();
//        myThread1.start();
//        myThread2.start();
//        myThread3.start();
//
//        // 2. 通过Runnable接口创建线程
//        MyThread02 myThread4 = new MyThread02();
//        new Thread(myThread4).start();
//        new Thread(myThread4).start();
//        new Thread(myThread4).start();
//
//        // 3. 通过Callable和Future创建线程
//        MyThread03 myThread03 = new MyThread03();
//        FutureTask<Integer> futureTask = new FutureTask<>(myThread03);
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + "的循环变量i:" + i);
//            if (i == 20){
//                new Thread(futureTask,"有返回值的线程").start();
//            }
//        }
//        try {
//            System.out.println("返回值:" + futureTask.get());
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }catch (ExecutionException e){
//            e.printStackTrace();
//        }

    }
}
