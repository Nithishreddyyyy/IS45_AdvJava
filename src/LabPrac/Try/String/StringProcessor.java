package LabPrac.Try.String;

import java.util.Scanner;

public class StringProcessor implements StringManipulator {
    @Override
    public String reverse(String input) {
        char [] ch = input.toCharArray();
        int left = 0 ; int right = ch.length - 1;
        while(left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }

    @Override
    public String Upper(String input) {
        return input.toUpperCase();
    }

    @Override
    public String Lower(String input) {
        return input.toLowerCase();
    }

    @Override
    public String concatenate(String str1, String str2) {
        return str1.concat(str2);
    }

    @Override
    public int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        char [] ch = input.toCharArray();
        for (char c : ch){
            if(vowels.indexOf(c)!=-1){
                count++;
            }
        }
        return count;
    }

    @Override
    public int wordCount(String str){
        if(str.trim().isEmpty()){
            return 0;
        }
        return str.trim().split("\\s+").length;
    }

    @Override
    public Boolean Palindrome(String input) {
        String rev = reverse(input);
        return rev.equalsIgnoreCase(input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String s2 = "\tNew String";

        StringProcessor sp = new StringProcessor();

        System.out.println("reverse: " + sp.reverse(s));
        System.out.println("Upper: " + sp.Upper(s));
        System.out.println("Lower: " + sp.Lower(s));
        System.out.println("Concate: "+ sp.concatenate(s,s2));
        System.out.println("CountVowels: " + sp.countVowels(s));
        System.out.println("WordCount: " + sp.wordCount(s));
        System.out.println("Palindrome: " + sp.Palindrome(s));

        System.out.println("---End of Program---");
    }
}
