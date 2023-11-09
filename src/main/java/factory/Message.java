package factory;

import builder.EmailMessage;
import prototype.Cloneable;

public abstract class  Message implements Cloneable<Message> {
    protected String content;

    public abstract String format();

    // "email adam@wp.pl ewa@op.pl Hello"
    // "sms 1234234 34457664 Hej
    public static Message create(String rawData){
        String[] tokens = rawData.split("\t");
        switch (tokens[0]){
            case "email":
                return EmailMessage.builder().to(tokens[1]).from(tokens[2]).build();
            case "sms":
                return new SMS(tokens[1], tokens[2], tokens[3]);
            default:
                return null;
        }
    }

    public abstract Message clone();
}
