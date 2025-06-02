package LabPrac.Try.Palindrome;

import java.util.Scanner;

class InvalidInputException extends Exception {
    InvalidInputException(String message) {
        super(message);
    }
}

class ShortStringException extends Exception{
    ShortStringException(String message){
        super(message);
    }
}

public class main {
    public boolean isPalindrome(String str) {
        String rev = new StringBuffer (str).reverse().toString();
        return rev.equalsIgnoreCase(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        main obj = new main();
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        try{
            if(!s.matches("[a-zA-Z]+")){
                throw new InvalidInputException("This String contains non alphanumeric characters");
            }
            if(s.length()<3){
                throw new ShortStringException("The String is too short");
            }
            if(obj.isPalindrome(s)){
                System.out.println("Yes its palindrome");
            }else{
                System.out.println("No its not a palindrome");
            }

        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        sc.close();
    }
}
