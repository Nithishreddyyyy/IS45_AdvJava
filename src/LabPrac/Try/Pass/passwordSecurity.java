package LabPrac.Try.Pass;

import java.util.Scanner;

public class passwordSecurity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        boolean hasUpper = false , hasLower = false , hasDigit = false ;
        int specialChar = 0;
        String masked_password = "";

        for (char ch : password.toCharArray()){
            if(Character.isUpperCase(ch)){
                hasUpper = true;
            }
            else if(Character.isLowerCase(ch)){
                hasLower = true;
            }
            else if(Character.isDigit(ch)){
                hasDigit = true;
            }
            else{
                specialChar++;
            }
        }

        System.out.println("#### Password Security ####");
        System.out.println("Your password is: " + password);
        System.out.println("Password contains uppercase letters: " + hasUpper);
        System.out.println("Password contains lowercase letters: " + hasLower);
        System.out.println("Password contains digits: " + hasDigit);
        System.out.println("Password contains special characters(number): " + specialChar);

        if(password.length()<=2){
            masked_password = password;
            System.out.println("Your password is: " + masked_password);
        }else{
            StringBuffer sb = new StringBuffer();
            sb.append(password.charAt(0));
            for (int i = 1 ; i < password.length() ; i++){
                sb.append('*');
            }
            sb.append(password.charAt(password.length()-1));
            masked_password = sb.toString();
            System.out.println("Your password is: " + masked_password);
        }

        StringBuffer sb2 = new StringBuffer(password);
        System.out.println("Your reversed pass is: " + sb2.reverse().toString());


        int randN = (int) (Math.random()*1001);
        String token = String.valueOf("@"+randN+"!");
        System.out.println("Your token is: " + password+token);

        StringBuffer sb3 = new StringBuffer(password);
        for(int i = 0 ; i < sb3.length() ; i++){
            char ch = Character.toLowerCase(sb3.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb3.setCharAt(i,'#');
            }
        }
        System.out.println("Password without vowels is: " + sb3.toString());

    }
}
