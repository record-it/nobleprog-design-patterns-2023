package builder.options;

public class UserService {
    void configurePassword(boolean hasDigit, boolean hasSpecialChar, boolean hasUpperCase, int minLength, int maxLength){
        System.out.println("hasDigit: " + hasDigit);
        System.out.println("hasSpecialChar: " + hasSpecialChar);
        System.out.println("hasUpperCase: " + hasUpperCase);
        System.out.println("minLength: " + minLength);
        System.out.println("maxLength: " + maxLength);
    }

    void configurePassword(PasswordOptions options){
        System.out.println(options);
    }
}
