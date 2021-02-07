package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author xiaobai
 * @Date 2021/2/7 20:04
 * @Version 1.0
 */
public class TestSet {
    public static void main(String[] args) {
        //增删判断
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.remove(2);
        set.add(null);
        // true false
        System.out.println(set.contains(null));
        System.out.println(set.isEmpty());
        //不可重复，且可以插入null:[null, 1]
        System.out.println(set.toString());
        //遍历：null 1
        for (Integer i : set){
            System.out.print(i + " ");
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
