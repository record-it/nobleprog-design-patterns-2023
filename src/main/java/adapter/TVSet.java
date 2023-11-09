package adapter;

import java.util.Date;

public class TVSet {
    Date date = new Date();

    public void setDate(Date date) {
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
