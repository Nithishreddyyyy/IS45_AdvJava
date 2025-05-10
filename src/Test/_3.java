package Test;
import java.util.*;
public class _3 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Bhoot");
        map.put(2,"Meow");
        map.put(2,"Aadya");
        map.put(3,null);
        map.put(4,null);
        map.put(null,"nithish");
        map.put(null,"rohan");

        System.out.println(map.get(2));
        System.out.println(map.containsValue("Bhoot"));
        System.out.println(map.entrySet());


    }
}
