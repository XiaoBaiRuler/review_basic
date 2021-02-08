package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author xiaobai
 * @Date 2021/2/7 21:06
 * @Version 1.0
 */
public class ListThreadSafe {
    public static void main(String[] args) throws InterruptedException {

        //1. Collections.synchronizedList(new List<>());
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        //2. CopyOnWriteArrayList替换arrayList
        CopyOnWriteArrayList<Integer> arrayList = new CopyOnWriteArrayList<>();
        //3. ConcurrentLinkedQueue替换LinkedList
        ConcurrentLinkedQueue<Integer> linkedList = new ConcurrentLinkedQueue<>();
    }
}
