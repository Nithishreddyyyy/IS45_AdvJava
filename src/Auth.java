abstract class Authentication {
    protected String userId;
    public Authentication(String userId) {
        this.userId = userId;
    }
    public abstract boolean authenticate();
    public String getUserId() {
        return userId;
    }
}

class PasswordAuthentication extends Authentication {
    private String password;

    public PasswordAuthentication(String userId, String password) {
        super(userId);
        this.password = password;
    }

    @Override
    public boolean authenticate() {
        System.out.println("Authenticating user " + userId + " using password...");
        return isValidPassword(password);
    }
    private boolean isValidPassword(String password) {
        if (password == null || password.length() < 8 || password.length() > 15) {
            return false;
        }
        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isWhitespace(c) && !Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
            if (hasLetter && hasDigit && hasSpecial) {
                break;
            }
        }
        return hasLetter && hasDigit && hasSpecial;
    }
}

class OTPAuthentication extends Authentication{
    private String providedOTP;
    private String generatedOTP;

    public OTPAuthentication(String userId, String providedOTP){
        super(userId);
        this.providedOTP = providedOTP;

        this.generatedOTP = generateOTP();
    }
    private String generateOTP(){
        return "123456";
    }
    @Override
    public boolean authenticate(){
        System.out.println("Authenticating user " + userId + " using OTP...");
        return providedOTP != null && providedOTP.equals(generatedOTP);
    }
}
class FingerprintAuthentication extends Authentication {
    private String fingerprintData;
    public FingerprintAuthentication(String userId, String fingerprintData) {
        super(userId);
        this.fingerprintData = fingerprintData;
    }
    @Override
    public boolean authenticate() {
        System.out.println("Authenticating user " + userId + " using fingerprint...");
        return fingerprintData != null && !fingerprintData.isEmpty();
    }
}
public class Auth {
    public static void main(String[] args) {
        Authentication passwordAuth = new PasswordAuthentication("User", "securepass");
        System.out.println("Password authentication result: " + passwordAuth.authenticate());
        Authentication otpAuth = new OTPAuthentication("User", "123456");
        System.out.println("OTP authentication result: " + otpAuth.authenticate());
        Authentication failedOtpAuth = new OTPAuthentication("User", "654321");
        System.out.println("Failed OTP authentication result: " + failedOtpAuth.authenticate());
        Authentication fingerprintAuth = new FingerprintAuthentication("User", "fingerprintSample123");
        System.out.println("Fingerprint authentication result: " + fingerprintAuth.authenticate());
        Authentication nullFingerprintAuth = new FingerprintAuthentication("User", null);
        System.out.println("Null fingerprint authentication result: " + nullFingerprintAuth.authenticate());
    }
}