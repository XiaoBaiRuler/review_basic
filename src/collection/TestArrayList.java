package collection;

import java.util.ArrayList;

/**
 * @Author xiaobai
 * @Date 2021/2/7 18:22
 * @Version 1.0
 */
public class TestArrayList {
    public static void main(String[] args) throws InterruptedException {
        //可以设置容量
        ArrayList<Integer> list = new ArrayList<>(11);
        //允许插入null: 1
        list.add(null);
        System.out.println(list.size());
        //线程不安全
        final ArrayList<Integer> finalList = new ArrayList<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    finalList.add(i);
                    try {
                        Thread.sleep(1);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1000; i < 2000; i++) {
                    finalList.add(i);
                    try {
                        Thread.sleep(1);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        Thread.sleep(1000);
        // i:get(i)不对应
        for (int i = 0; i < finalList.size(); i++) {
            System.out.println(i + " : " + finalList.get(i));
        }
    }
}
