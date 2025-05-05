package collections;
import java.util.*;
public class _5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,30,5,23));
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

    }
}
