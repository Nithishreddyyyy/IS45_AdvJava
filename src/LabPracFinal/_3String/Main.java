package LabPracFinal._3String;
import java.util.Scanner;
import LabPracFinal._3String.StringOperation.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stringProcess str = new stringProcess();

        System.out.println("enter the string: ");
        String s = sc.nextLine();
        String str2 = "\tThis is str2";

        System.out.println("---String Operations---");
        System.out.println("Original String: " + s);
        System.out.println("Reversed: "+str.revString(s));
        System.out.println("Upper: "+str.upperString(s));
        System.out.println("Lower: "+str.lowerString(s));
        System.out.println("Concat of two String " + str.concatString(s,str2));
        System.out.println("CountVowels : " + str.countVowels(s));
        System.out.println("Palindrome or not: "+str.isPali(s));
        System.out.println("Count Words: "+str.countWords(s));
    }
}
