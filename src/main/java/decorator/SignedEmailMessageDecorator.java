package decorator;

import builder.EmailMessage;

public class SignedEmailMessageDecorator extends EmailMessage {
    private EmailMessage message;
    private final String sign;

    public SignedEmailMessageDecorator(EmailMessage message, String sign) {
        this.message = message;
        this.sign = sign;
    }

    @Override
    public String format() {
        String content = this.message.getContent() + "\n" + sign;
        return  "from: " + message.getFrom() + "\n" +
                "to: " + message.getTo() + "\n" +
                "subject: " + message.getSubject() +"\n" +
                "content: " + content +"\n";
    }
}
