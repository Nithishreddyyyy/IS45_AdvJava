package Test;

@FunctionalInterface
interface Bb{
    int add(int a,int b);
}
public class FuncInterface2 {
    public static void main(String[] args) {
        Bb obj = (int i , int j) ->{
            return i + j;
        };
        int res = obj.add(5,4);
        System.out.println(res);
    }
}
