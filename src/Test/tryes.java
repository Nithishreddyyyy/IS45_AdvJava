package Test;
@FunctionalInterface
interface test{
    public void run(String s);
}
public class tryes {
    public static void main(String[] args) {
        test t1= (String s) -> System.out.println(s);
        t1.run("hello");
    }
}
