package factory;

import java.time.LocalDateTime;
import java.time.LocalTime;
// zdefiniuj fabrykę obiektów EmailMessage
public class SMSFactory implements AbstractFactory<Message>{
    @Override
    public SMS create() {
        return new SMS("23445", "55667", "Przypomnienie " + LocalDateTime.now());
    }
}
