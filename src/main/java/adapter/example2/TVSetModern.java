package adapter.example2;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class TVSetModern {

    @Getter
    @Setter
    private LocalDate date = LocalDate.now();

    @Getter
    private int volume;

    public void volumeUp(){
        volume += volume < 100 ? 1 : 0;
    }

    public void volumeDown(){
        volume -= volume > 0 ? 1 : 0;
    }
}
