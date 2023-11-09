package factory;

import java.text.NumberFormat;

// Zdefniuj nową klase WhatsAppMessage z polami clientId i content
// zdefiniuj fabrykę tych wiadomości z selektorem whatsapp
// zarejestruj fabrykę w factory provider
//
public class MessageFactoryDemo {
    public static void main(String[] args) {
        MessageFactoryProvider provider = new MessageFactoryProvider();
        provider.register(new EmailMessageFactory(), "email");
        provider.register(new SMSFactory(), "sms");
        String messages = "email sms sms email";
        for(var selector: messages.split("\\s")){
            System.out.println(provider.getFactory(selector).create().format());
        }

        Message message = Message.create("sms\txxx\tyyy\tzzz");
        System.out.println(message.format());
        NumberFormat format = NumberFormat.getCurrencyInstance();
        System.out.println(format.format(56.56));
    }
}
