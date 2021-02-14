package lambda;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * @Author xiaobai
 * @Date 2021/2/14 13:46
 * @Version 1.0
 */
public class TestNewMap {
    public static void main(String[] args) {
        // forEach
        HashMap<Integer, String> map = new HashMap<>(4);
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer + s);
            }
        });
        map.forEach((k, v) -> System.out.println(k + v));

        // getOrDefault
        map.getOrDefault(4, "NoValue");

        // putIfAbsent
        // 不存key或key为null时，才插入
        map.putIfAbsent(4, "4");

        // remove
        // 只有key->value时才可以删除
        map.remove(1, "2");

        // replace
        // key存在时，才会替换
        map.replace(1, "2");
        // key存在且value=oldValue时，才替换新的值
        map.replace(1, "2", "1");

        // replaceAll
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            entry.setValue(entry.getValue().toUpperCase());
        }
        map.replaceAll(new BiFunction<Integer, String, String>() {
            @Override
            public String apply(Integer integer, String s) {
                return s.toUpperCase();
            }
        });
        map.replaceAll((key, value) -> value.toUpperCase());

        // merge
        map.merge(1, "msg", (v1, v2) -> v1 + v2);
        System.out.println(map);

        // compute
        // 把remappingFunction的计算结果关联到key上
        // 如果计算结果为null，则在Map中删除key的映射
        map.compute(1, (k, v) -> v == null ? "msg" : v.concat("msg"));
        System.out.println(map);

        // computeIfAbsent
        // 只有在当前Map中不存在key值的映射或映射值为null时，才调用mappingFunction
        // 并在mappingFunction执行结果非null时，将结果跟key关联
        Map<Integer, Set<String>> mapSet = new HashMap<>(16);
        mapSet.put(1, new HashSet<>(4));
        if (mapSet.containsKey(1)){
            mapSet.get(1).add("1");
        }
        else{
            Set<String> valueSet = new HashSet<>();
            valueSet.add("1");
            mapSet.put(1, valueSet);
        }
        mapSet.computeIfAbsent(2, v -> new HashSet<>()).add("yi");
        System.out.println(mapSet);

        // ComputeIfPresent()
        // 只有在当前Map中存在key值的映射且非null时，才调用remappingFunction
        // 如果remappingFunction执行结果为null，则删除key的映射，否则使用该结果替换key原来的映射．
    }
}
