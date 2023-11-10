package decorator;

import builder.EmailMessage;
// zdefiniuj dekorator, który dowolny email uzupełnij o linię gwiazdek nad i pod
// np.
// ********************
// from: ewa
// to: adam
// content: Cześć
// ********************
public class Demo {
    public static void main(String[] args) {
        EmailMessage message = EmailMessage
                .builder()
                .to("adam")
                .from("ewa")
                .subject("hello")
                .content("Cześć")
                .build();
        message = new SignedEmailMessageDecorator(message, "Pozdrawiam\nEwa");
        // kod zastany
        System.out.println(message.format());
    }
}
