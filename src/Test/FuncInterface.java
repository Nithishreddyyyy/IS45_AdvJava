package Test;

interface Aa{
    void show (int i);
}

public class FuncInterface {
    public static void main(String[] args) {
//        Aa obj = () ->{
//            System.out.println("in Show");
//        };
//        obj.show();
        Aa obj1 = (int i) ->{
            System.out.println("Showing: "+i);
        };
        obj1.show(10);
    }
}
