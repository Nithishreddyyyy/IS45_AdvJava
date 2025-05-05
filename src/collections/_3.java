package collections;
import java.util.*;
public class _3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Apple","Mango","Banana"));
        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println("Fwd: "+it.next());
        }

        ListIterator<String> lit = list.listIterator(list.size());
        while(lit.hasPrevious()){
            System.out.println("Back: "+lit.previous());
        }

        for(String fruit : list){
            System.out.println(fruit);
        }
    }
}
