package Lab._8.pass;
import java.util.Scanner;
public class PassSecurity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password  =  sc.nextLine();
        boolean hasupper = false,haslower = false , hasdigits = false;

        int spect_char = 0;
        String masked_password = "";
        for ( char ch : password.toCharArray() ) {
            if(Character.isUpperCase(ch)){
                hasupper = true;
            }
            else if ( Character.isLowerCase(ch) ){
                haslower = true;
            }
            else if(Character.isDigit(ch)){
                hasdigits = true;
            }
            else{
                spect_char++;
            }
        }

        System.out.println("Password check");
        System.out.println("password contains uppercase letters: "+hasupper);
        System.out.println("password contains lower case letters: "+haslower);
        System.out.println("password contains digits: "+hasdigits);
        System.out.println("password contains special characters: "+spect_char);


        if(password.length() <= 2){
            masked_password = password;
            System.out.println("masked passowrd is : "+masked_password);
        }
        else{
            StringBuffer sb = new StringBuffer();
            sb.append(password.charAt(0));
            for (int i = 1 ; i<password.length(); i++){
                sb.append('*');
            }
            sb.append(password.charAt(password.length()-1));
            masked_password=sb.toString();
            System.out.println("Masked passowrd is : "+masked_password);
        }
        StringBuffer sb1 = new StringBuffer(password);
        String reversedPassword = sb1.reverse().toString();
        System.out.println("Reversed password is: "+reversedPassword);
        int randN = (int)(Math.random()*1001);
        String token = String.valueOf("@"+randN);
        String secured_password = password+token;
        System.out.println("secured password is: "+secured_password);

        StringBuffer sb2 = new StringBuffer(password);
        for(int i = 0 ; i < sb2.length(); i++){
            char ch = Character.toLowerCase(sb2.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb2.setCharAt(i,'#');
            }
        }
        System.out.println("Password(vowel) is: "+sb2);
    }
}
