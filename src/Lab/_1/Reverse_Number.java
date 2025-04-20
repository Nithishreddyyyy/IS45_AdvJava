package Lab._1;

import java.util.*;
class rev{
    public static void main(String [] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        int num = S.nextInt();
        int rev = 0,rem;
        while (num != 0){
            rem = num % 10;
            rev = rem + rev * 10;

            num = num/10;
        }
        System.out.println("The reversed number is: "+rev);
    }
}
