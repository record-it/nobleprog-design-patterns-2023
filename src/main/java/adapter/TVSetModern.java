package adapter;

import java.time.LocalDate;
import java.util.Date;

public class TVSetModern {
    LocalDate date = LocalDate.now();

    public void setDate(LocalDate date) {
        this.date = date;
    }

    int volume;
    void volumeUp(){
        volume += volume < 100 ? 1 : 0;
    }

    void volumeDown(){
        volume -= volume > 0 ? 1 : 0;
    }

    int getVolume(){
        return volume;
    }


}
