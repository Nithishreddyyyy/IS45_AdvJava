package Lab._1;
import java.util.*;
class op{
    static int add(int a , int b){
        return a + b;
    }
    static int prod(int a , int b){
        return a*b;
    }
    static int diff(int a, int b){
        return a-b;
    }
    static int divide(int a , int b){
        return (a/b);
    }
    public static void main(String [] args){
        int x , y , res;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the Numbers x , y");
        x = S.nextInt();
        y = S.nextInt();

        while(true){
            System.out.println("The operatoins are as follows:");
            System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division");
            System.out.print("Enter your choice:");
            int choice = S.nextInt();
            switch(choice){
                case 1:
                    res =add(x,y);
                    System.out.println(res);
                    break;
                case 2:
                    res = diff(x,y);
                    System.out.println(res);
                    break;
                case 3:
                    res = prod(x,y);
                    System.out.println(res);
                    break;
                case 4:
                    res = divide(x,y);
                    System.out.println(res);
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}