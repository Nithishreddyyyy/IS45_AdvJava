package Unit_2;
import java.util.*;
import java.util.HashSet;

class op{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter the first String: ");
        String S1 = S.nextLine();
        System.out.print("\nEnter the second String: ");
        String S2 = S.nextLine();

        System.out.println(S1.equals(new StringBuilder(S1).reverse().toString()));
    }
}