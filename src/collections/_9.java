package collections;
import java.util.*;
public class _9 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(10,"Nithish");
        map.put(20,"Bhavinish");
        map.put(30,"Kalyani");
        map.put(40,"Maheswara");

        System.out.println("HashMap: "+map);

        System.out.println("Value for 10: "+map.get(10));

        System.out.println("----");
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println("Key: "+entry.getKey() + ", Values: "+entry.getValue());
        }
    }
}
