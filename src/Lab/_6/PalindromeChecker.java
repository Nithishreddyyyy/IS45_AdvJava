package Lab._6;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class ShortStringException extends Exception {
    public ShortStringException(String message) {
        super(message);
    }
}

public class PalindromeChecker {

    public static void validateInput(String str) throws InvalidInputException, ShortStringException {
        if (!str.matches("[a-zA-Z]+")) {
            throw new InvalidInputException("Input must contain only alphabets");
        }
        if (str.length() < 3) {
            throw new ShortStringException("Input string must be at least 3 characters long");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        StringBuffer original = new StringBuffer(str);
        StringBuffer reversed = new StringBuffer(str); // Create a new copy
        reversed.reverse();

        return original.toString().equals(reversed.toString());
    }
}
