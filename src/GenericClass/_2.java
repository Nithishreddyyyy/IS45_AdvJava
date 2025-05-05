package GenericClass;

public class _2 {
    public <T extends Number> T  printObj(T obj){
        System.out.println("The object is : "+obj);
        return obj;
    }

    public static void main(String[] args) {
        _2 example = new _2();
        double test = example.printObj(10);
        System.out.println(test);
        example.printObj(20);
//        example.printObj("Nithish");
        example.printObj(3.132);
//        example.printObj(true);
    }
}
