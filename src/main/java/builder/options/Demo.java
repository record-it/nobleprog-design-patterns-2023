package builder.options;

public class Demo {
    public static void main(String[] args) {
        UserService service = new UserService();
        service.configurePassword(
                PasswordOptions.builder()
                        .hasDigit(true)
                        .minLength(5)
                        .build()
        );
        service.configurePassword(true, false, true, 5, 9);
    }
}
