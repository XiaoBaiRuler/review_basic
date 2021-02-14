package lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xiaobai
 * @Date 2021/2/13 12:34
 * @Version 1.0
 */
public class MyStream<T> {
    private List<T> list;

    public MyStream(T t){
        list = new ArrayList<>(2);
        list.add(t);
    }

    public void myForeach(ConsumerInterface<T> consumer){
        for (T t : list){
            consumer.say(t);
        }
    }

    public static void main(String[] args) {
        MyStream<String> stringMyStream = new MyStream<>("xiaobai");
        stringMyStream.myForeach(System.out::println);
        stringMyStream.myForeach(System.out::println);
    }
}
