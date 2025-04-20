package Lab._1;
import java.util.*;
public class fact {
    static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n*fact(n-1);
    }

    static int Fact(int n){
        int res=1;
        for (int i = 1 ; i <= n ; i++){
            res = res * i;
        }
        return res;
    }
    public static void main(String [] args){
        int a;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the value:");
        a = S.nextInt();
        int res =fact(a);
        System.out.println("The factorial of the given number is: "+res);
        System.out.println("The fact wihtout reccursive enter number: ");
        int b = S.nextInt();
        res = Fact(b);
        System.out.println("The result is "+res);
    }
}