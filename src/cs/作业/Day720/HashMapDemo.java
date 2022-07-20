package cs.作业.Day720;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(12);
        //向map集合中添加元素
        map.put("usa", "漂亮国");
        map.put("jp", "⽇本");
        map.put("en", "英国");
        map.put("ca", "加拿⼤");
        map.put("cn", "中华⼈⺠共和国");
        map.put("cn", "中国");
        map.put("china", "中国");
        System.out.println(map);
        System.out.println(map.get("cn"));
        System.out.println(map.containsKey("ca"));
        System.out.println(map.containsValue("中国"));
        System.out.println(map.isEmpty());
//根据key移除map中的元素
        map.remove("jp");
        System.out.println(map);
//返回map集合中元素的个数
        System.out.println(map.size());
        System.out.println("=================================");
//返回map集合中所有的key
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }
        System.out.println("=================================");
//返回map集合中所有的value
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println("=================================");
//返回map集合中所有的key和value (Entry)
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

    }
}
