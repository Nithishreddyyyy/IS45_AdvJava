package Lab._6;

import java.util.Scanner;

import static Lab._6.PalindromeChecker.isPalindrome;
import static Lab._6.PalindromeChecker.validateInput;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        try{
            System.out.println("Enter a string to check for palindrome:");
            String input = S.nextLine();

            validateInput(input);

            if(isPalindrome(input)){
                System.out.println("The String is a palindrome");;
            }
            else{
                System.out.println("The string is NOT a palindrome");
            }
        }
        catch (InvalidInputException | ShortStringException e){
            System.out.println("Error:  "+e.getMessage());
        }
        finally{
            S.close();
        }
    }
}
