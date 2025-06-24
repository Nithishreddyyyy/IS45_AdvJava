package LabPracFinal._3String.StringOperation;

import java.util.*;
public class stringProcess implements StringManipulator {
    @Override
    public String revString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    @Override
    public String upperString(String str) {
        return str.toUpperCase();
    }

    @Override
    public String lowerString(String str) {
        return str.toLowerCase();
    }

    @Override
    public String concatString(String str1, String str2) {
        return str1.concat(str2);
    }

    @Override
    public int countVowels(String str) {
        int count = 0;
        String VOWELS = "aeiouAEIOU";
        for(char ch : str.toCharArray()){
            if(VOWELS.indexOf(ch) != 1){
                count ++;
            }
        }
        return count;
    }

    @Override
    public boolean isPali(String str) {
        String rev = revString(str);
        return rev.equals(str);
    }

    @Override
    public int countWords(String str) {
        if (str.trim().isEmpty()){
            return 0;
        }
        return str.trim().split("\\s+").length;
    }
}
