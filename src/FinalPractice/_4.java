package FinalPractice;

public class _4 {
    private int test = 10;
    try{
        int b = 100/0;
        System.out.println("b: "+b);
    }catch(ArithmeticException E){
        System.err.println(E.getMessage());
    }

}

