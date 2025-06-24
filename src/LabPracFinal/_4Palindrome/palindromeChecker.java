package LabPracFinal._4Palindrome;
import LabPrac._4Palindrome.InvalidInputException;

import java.util.*;
public class palindromeChecker {
    public boolean isPalindrome(String str){
        String lowerInput = str.toLowerCase();
        String reversedInput = new StringBuffer(lowerInput).reverse().toString();
        return lowerInput.equals(reversedInput);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        palindromeChecker obj = new palindromeChecker();
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        try{
            if(!str.matches("[a-zA-Z]+")){
                throw new InvalidInputException("Input contains non alpha");
            }
            if(str.length()<3){
                throw new ShortStringException("Input is too short");
            }
            if(obj.isPalindrome(str)){
                System.out.println("YES");
            }
            else{
                System.out.println("NOT");
            }
        }catch(InvalidInputException e){
            System.err.println(e.getMessage());
        }

        sc.close();
    }
}
