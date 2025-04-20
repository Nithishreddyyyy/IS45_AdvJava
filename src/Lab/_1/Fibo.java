package Lab._1;

import java.util.*;
class fibonaci{
    static int fibo(int n){
        if(n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String [] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Emter how many series of fibo is requried: ");
        int num = S.nextInt();
        for (int i = 0 ; i< num ; i ++){
            System.out.println(fibo(i));
        }
    }
}
