package builder;

import factory.Message;

public class EmailMessage extends Message {
    private String to;
    private String from;
    private String subject;
    private String content;

    public EmailMessage(){
    }
    private EmailMessage(String to, String from){
        this.to = to;
        this.from = from;
    }



    private EmailMessage(String to, String from, String subject){
        this(to, from);
        this.subject = subject;
    }
    private EmailMessage(String to, String from, String subject, String content) {
        this(to, from, subject);
        this.content = content;
    }


    @Override
    public String toString() {
        return "EmailMessage{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String format() {
        return "from: " + from +"\nto: " + to + "\ncontent: " + content;
    }

    @Override
    public Message clone() {
        return EmailMessage.builder().to(to).from(from).build();
    }

    public interface RequireTo{
        RequireFrom to(String to);
    }
    public interface RequireFrom{
        Builder from(String from);
    }
    // dodaj pole content jako wymagane
    public static RequireTo builder(){
        final Builder builder = new Builder();
        return to -> {
            if (to == null){
                throw new IllegalArgumentException();
            }
            builder.instance.to = to;
            return from -> {
                builder.instance.from = from;
                return builder;
            };
        };
    }

    public static RequireTo builderA(){
        final Builder builder = new Builder();
        return new RequireTo() {
            @Override
            public RequireFrom to(String to) {
                builder.instance.to = to;
                return new RequireFrom() {
                    @Override
                    public Builder from(String from) {
                        builder.instance.from = from;
                        return builder;
                    }
                };
            }
        };
    }
    static public class Builder{
        private EmailMessage instance;
        public Builder(){
            instance = new EmailMessage();
        }

        public Builder to(String arg){
            instance.to = arg;
            return this;
        }

        public Builder from(String arg){
            instance.from = arg;
            return this;
        }
        public Builder subject(String arg){
            instance.subject = arg;
            return this;
        }
        public Builder content(String arg){
            instance.content = arg;
            return this;
        }

        public EmailMessage build(){
            return instance;
        }


    }
}
