package Test;

@FunctionalInterface
interface FactorialCalculator{
    int calculator(int n);
}

public class Lambda{
    public static void main(String[] args) {
        FactorialCalculator obj = (int n) -> {
            if (n == 0 || n == 1){
                return 1;
            }
            int res = 1;
            for (int i = 2; i<=n ; i++){
                res = res * i;
            }
            return res;
        };
        int res = obj.calculator(5);
        System.out.println(res);
    }
}