package FinalPractice;
import java.util.*;

public class _7 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("a");
        lst.add("b");
        lst.add("c");
        lst.remove(1);
        Iterator<String> lt = lst.iterator();
        while(lt.hasNext()){
            System.out.println(lt.next());
        }
        System.out.println(lst.isEmpty());
    }
}
