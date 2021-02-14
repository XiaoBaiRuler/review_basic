package lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @Author xiaobai
 * @Date 2021/2/14 17:21
 * @Version 1.0
 */
public class TestStream {
    public static void main(String[] args) {

        // forEach()
        Stream<String> stream1 = Stream.of("I", "xiaobai", "jiejie");
        stream1.forEach(System.out::println);

        // filter()
        Stream<String> stream2 = Stream.of("a", "ab", "abc");
        stream2.filter(str -> str.length() > 1).forEach(System.out::println);

        // distinct()
        Stream<String> stream3 = Stream.of("a", "b", "a");
        stream3.distinct().forEach(System.out::println);

        // sorted()
        Stream<Character> stream4 = Stream.of('b', 'c', 'a');
        stream4.sorted((a, b) -> b - a).forEach(System.out::print);

        // map()
        // 返回一个对当前所有元素执行操作之后的结果组成的Stream
        Stream<String> stream5 = Stream.of("a", "b", "c");
        stream5.map(String::toUpperCase).forEach(System.out::print);

        // flatMap()
        // 对每个元素执行操作，并用所有mapper返回的Stream中的元素组成一个新的Stream
        // 相当于把原stream中的所有元素都”摊平”之后组成的Stream，转换前后元素的个数和类型都可能会改变
        Stream<List<Integer>> stream6 = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4));
        stream6.flatMap(Collection::stream).forEach(System.out::print);
    }
}
