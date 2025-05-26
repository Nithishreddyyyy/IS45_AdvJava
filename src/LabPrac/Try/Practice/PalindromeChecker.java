package LabPrac.Try.Practice;

import java.util.Scanner;

class InvalidInputException extends Exception{
    InvalidInputException(String message){
        super(message);
    }
}

class ShortStringException extends Exception{
    ShortStringException(String message){
        super(message);
    }
}
public class PalindromeChecker {
    public boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return str.equalsIgnoreCase(sb.reverse().toString());
    }

    public static void main(String[] args) {
        PalindromeChecker obj = new PalindromeChecker();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        try{
            if(!str.matches("[a-zA-Z]+")){
                throw new InvalidInputException("Input contains number");
            }
            if(str.length()<3){
                throw new ShortStringException("Input is too small");
            }
            if(obj.isPalindrome(str)){
                System.out.println("YES its a palindrome");
            }else{
                System.out.println("NO its a palindrome");
            }
        }catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }
        sc.close();
    }

}
