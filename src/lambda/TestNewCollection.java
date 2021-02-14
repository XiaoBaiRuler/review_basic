package lambda;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * @Author xiaobai
 * @Date 2021/2/14 13:18
 * @Version 1.0
 */
public class TestNewCollection {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));

        // foreach
        for (Integer i : list){
            if (i < 2){
                System.out.println(i);
            }
        }
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                if (i < 2){
                    System.out.println(i);
                }
            }
        });
        list.forEach((i) -> {
            if (i < 2){
                System.out.println(i);
            }
        });

        // removeIf
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if (it.next() == 4){
                it.remove();
            }
        }
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer == 3;
            }
        });
        list.removeIf((i) -> i == 2);

        // replaceAll
        for (int i = 0; i < list.size(); i++) {
            Integer a = list.get(i);
            if (a == 1) {
                list.set(i, 2);
            }
        }
        list.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer == 2 ? 3 : 2;
            }
        });
        list.replaceAll((i) -> i == 3 ? 4: 3);

        // sort
        list.add(1);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 01 - 02;
            }
        });
        Collections.sort(list, (o1, o2) -> o2 - o1);
        System.out.println(list);

        //spliterator() stream() parallelStream()
    }
}
