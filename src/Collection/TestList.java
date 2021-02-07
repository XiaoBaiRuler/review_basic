package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author xiaobai
 * @Date 2021/2/7 18:49
 * @Version 1.0
 */
public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //增删查改
        list.add(1);
        list.add(3);
        list.add(1, 2);
        //1, 2, 3
        list.remove(Integer.valueOf(1));
        list.remove(1);
        //2
        list.set(0, 6);
        //6
        list.add(8);
        //判断：false true
        System.out.println(list.isEmpty());
        System.out.println(list.contains(6));
        //获取位置：1
        System.out.println(list.indexOf(8));
        //获取子集合: [6]
        List<Integer> subList = list.subList(0, 1);
        //遍历:扩展Collection接口，包含Iterable
        //6, 8
        for (Integer i: list){
            System.out.print(i + " ");
        }
        //6, 8
        ListIterator<Integer> listIt = list.listIterator();
        while (listIt.hasNext()){
            System.out.print(listIt.next() + " ");
        }
        //8, 6
        while (listIt.hasPrevious()){
            System.out.print(listIt.previous() + " ");
        }
    }
}
