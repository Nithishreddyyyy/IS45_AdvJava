package collections;
import java.util.*;
class neww{
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Nithish");
        name.add("reddy");
        System.out.println(name);
        System.out.println(name.get(0));

        name.add(1,"Raja");
        System.out.println(name);
        name.remove(1);
        name.remove(String.valueOf("reddy"));
        System.out.println(name);
        name.clear();   //clears the list



    }
}
