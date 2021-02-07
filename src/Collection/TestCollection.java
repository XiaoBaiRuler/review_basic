package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author xiaobai
 * @Date 2021/2/7 18:41
 * @Version 1.0
 */
public class TestCollection {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        //增删判断
        collection.add(1);
        collection.add(2);
        collection.remove(1);
        // true
        System.out.println(collection.contains(2));
        // false
        System.out.println(collection.isEmpty());
        collection.add(2);
        //Collection扩展Iterable,可以增强遍历和迭代器遍历
        //2 2
        for (Integer col: collection){
            System.out.print(col + " ");
        }
        //2 2
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
