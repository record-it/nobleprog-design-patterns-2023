package builder;

public class EmailMessageBuilderDemo {
    public static void main(String[] args) {
        EmailMessage msg = EmailMessage
                .builder()
                .to(null)
                .from("ewa@noble.pl")
                .content("Hello from builder")
                .subject("greetings")
                .build();
        System.out.println(msg);
    }
}
