package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @Author xiaobai
 * @Date 2021/2/7 19:40
 * @Version 1.0
 */
public class TestVector {
    public static void main(String[] args) throws InterruptedException {
        final Vector<Integer> vector = new Vector<>();
        //线程安全: 但是i 和 get(i)不一一对应？
        //Vector保证其同步方法不能被两个两个以上线程同时访问，但是操作可能会使得Vector线程不安全
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    vector.add(i);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1000; i < 2000; i++) {
                    vector.add(i);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        Thread.sleep(2000);
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(i + " : " + vector.get(i));
        }
        Vector<Integer> enumVector = new Vector<>();
        enumVector.add(1);enumVector.add(2);
        Enumeration en = enumVector.elements();
        while (en.hasMoreElements()){
            System.out.print(en.nextElement() + " ");
        }
    }
}
