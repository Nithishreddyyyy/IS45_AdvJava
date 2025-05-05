package collections;
import java.util.*;
public class _2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Mango");
        list.add("Cherry");

        ListIterator<String> itr = list.listIterator(list.size());
        System.out.println("---");
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
