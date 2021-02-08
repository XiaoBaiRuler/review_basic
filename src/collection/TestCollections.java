package collection;

import java.util.*;

/**
 * @Author xiaobai
 * @Date 2021/2/7 8:57
 * @Version 1.0
 */
public class TestCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i >= 0 ; i--) {
            list.add(i);
        }
        //排序(升序):[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        Collections.sort(list);
        //排序(逆序):[10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        //查找(二分查找):5
        int i = Collections.binarySearch(list, 5);
        //复制(目标列表必须和源列表大小一样):[10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
        List<Integer> dest = new ArrayList<>();
        for (int j = 0; j <= 10; j++) {
            dest.add(i);
        }
        Collections.copy(dest, list);
        //反转:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        Collections.reverse(list);
        //打乱:[9, 8, 7, 2, 1, 3, 10, 0, 4, 6, 5]
        Collections.shuffle(list);
        //集合转数组:[5, 7, 0, 3, 1, 10, 9, 4, 8, 6, 2]
        Integer[] arr = list.toArray(new Integer[0]);
        //数组转集合:[9, 1, 3, 6, 10, 2, 7, 8, 5, 4, 0]
        List<Integer> listArr = Arrays.asList(arr);
    }

}
