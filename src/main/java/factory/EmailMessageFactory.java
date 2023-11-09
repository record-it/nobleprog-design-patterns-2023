package factory;

import builder.EmailMessage;

import java.time.LocalDateTime;

public class EmailMessageFactory implements AbstractFactory<Message> {

    @Override
    public EmailMessage create() {
        return EmailMessage.builder()
                .to("adam@wp.pl")
                .from("ewa@wp.pl")
                .content("Przypomnienie " + LocalDateTime.now())
                .build();
    }
}
