package collection;

import java.util.TreeMap;

/**
 * @Author xiaobai
 * @Date 2021/2/7 20:41
 * @Version 1.0
 */
public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<Person, String> treeMap = new TreeMap<>();
        treeMap.put(new Person(1, "xiaobai"), "xiaobai");
        treeMap.put(new Person(2, "jiejie"), "jiejie");
        System.out.println(treeMap.entrySet());
    }
}
