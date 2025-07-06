package FinalPractice;

public class _3 {
    int item = 10;
    static void A(){
        System.out.println("A");
    }
}
class B extends _3{
    B(){
        super();
    }
    static void b(){
        System.out.println("b");
    }

    public static void main(String[] args) {
        b();
        A();
    }
}
