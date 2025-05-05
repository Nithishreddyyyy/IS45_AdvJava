package collections;
import java.util.*;
public class _4 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple",10);
        map.put("Orange",20);
        map.put("Green Apple",30);
        System.out.println(map.get("apple"));
        map.remove("Green Apple");
        System.out.println(map.size());
        System.out.println(map.containsKey("apple"));
        System.out.println(map.containsValue(20));
        System.out.println(map.values());
        System.out.println(map);
    }
}