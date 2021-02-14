package lambda;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * @Author xiaobai
 * @Date 2021/2/14 12:53
 * @Version 1.0
 */
public class TestMethodReference {
    public static void main(String[] args) {

        Test test = System.out::println;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.forEach(System.out::println);

        // 类构造器引用
        InterfaceExample com = Demo::new;
        Demo demo = com.create();
        demo.say("xiaobai");
        // 数组构造器引用
        Function<Integer, Demo[]> function = Demo[]::new;
        Demo[] array = function.apply(8);
        for (Demo d : array){
            System.out.println(d);
        }

    }


}

@FunctionalInterface
interface Test{
    /**
     * say
     * @param s String
     */
    public void say(String s);
}
