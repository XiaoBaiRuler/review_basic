package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author xiaobai
 * @Date 2021/2/7 20:25
 * @Version 1.0
 */
public class TestHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(16);
        // 增删查判断
        map.put("cn", "中国");
        map.put("en", "美国");
        map.put("us", "美国");
        map.remove("en");
        // 中国 false true false
        System.out.println(map.get("cn"));
        System.out.println(map.containsKey("en"));
        System.out.println(map.containsValue("中国"));
        System.out.println(map.isEmpty());
        // 遍历元素:keySet:cn:中国 us:美国
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            System.out.print(key + ":" + map.get(key) + " ");
        }
        // 遍历元素:entrySet:cn:中国 us:美国
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries){
            System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
        }

    }
}
