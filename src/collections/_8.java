package collections;
import java.util.*;
public class _8 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        System.out.println(fruits);

        fruits.remove("Mango");
        System.out.println(fruits);
        System.out.println(fruits.contains("Mango"));
        fruits.addAll(Arrays.asList("Mango","Pineapple","Godknows what"));
        System.out.println("---");
        Iterator<String> itr = fruits.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Loop[");
        for(String j : fruits){
            System.out.println(j);
        }
    }
}
