package Test;

import java.util.ArrayList;
import java.util.List;

//class Container<T>{
//    T value;
//    public void show(){
//        System.out.println(value.getClass().getName());
//    }
//}
//
//public class Generics {
//    public static void main(String[] args) {
//        Container<String> obj = new Container<>();
//        obj.value = "10.0";
//        obj.show();
//    }
//}


class NumericContainer<T extends Number> {
    T num;

    public NumericContainer(T num) {
        this.num = num;
    }

    public void square (){
        double res = Double.parseDouble(num.toString());
        res = res * res;
        System.out.println("Square of " + num + " is " + res);
    }
}

public class Generics {
    public static void main(String[] args) {
        NumericContainer<Integer> num = new NumericContainer<>(5);
        num.square();

        NumericContainer<Double> num1 = new NumericContainer<>(5.90);
        num1.square();

        NumericContainer<?>  n = new NumericContainer<Number>(3);
        n.square();
    }
}