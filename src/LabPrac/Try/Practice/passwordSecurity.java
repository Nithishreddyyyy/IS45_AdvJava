package LabPrac.Try.Practice;

import java.util.Scanner;

public class passwordSecurity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        boolean Upper = false,Lower = false, Number = false;
        int special = 0;

        for (char ch : password.toCharArray()){
            if(Character.isUpperCase(ch)){
                Upper = true;
            }
            else if(Character.isLowerCase(ch)){
                Lower = true;
            }
            else if(Character.isDigit(ch)){
                Number = true;
            }
            else{
                special++;
            }
        }

        System.out.println("Password Operations");
        System.out.println("your password is: " + password);
        System.out.println("pass has upper: "+Upper);
        System.out.println("pass has lower: "+Lower);
        System.out.println("pass has number: "+Number);
        System.out.println("Special charecters: "+special);

        if(password.length()<=2){
            String masked_password = password;
            System.out.println("Your password is: " + masked_password);
        }else{
            StringBuffer sb = new StringBuffer();
            sb.append(password.charAt(0));
            for(int i = 1 ; i < password.length() ; i++){
                sb.append("*");
            }
            sb.append(password.charAt(password.length()-1));
            String masked_password = sb.toString();
            System.out.println("Your masked password is: " + masked_password);
        }
        StringBuffer sb1 = new StringBuffer(password);
        String rev = sb1.reverse().toString();
        System.out.println("Your reversed password is: " + rev);

        int randN = (int) (Math.random()*1001);
        String token = String.valueOf("@" + randN + "!");
        String securePass = password + token;
        System.out.println("Secure password is: " + securePass);

        StringBuffer sb2 = new StringBuffer(password);;
        for (int i = 0 ; i < sb2.length() ; i ++){
            char ch = Character.toLowerCase(sb2.charAt(i));
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                sb2.setCharAt(i,'#');
            }
        }
        System.out.println("Pass without vowels: " + sb2.toString());
    }
}
